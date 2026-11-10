package me.dratii.tracking;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import me.dratii.Globals;
import me.dratii.data.tracking.yuntrack.Data;
import me.dratii.data.tracking.yuntrack.YunTrackInfo;
import okhttp3.*;

import java.io.IOException;
import java.util.Collections;

import static me.dratii.Globals.client;
import static me.dratii.tracking.helpers.YuntrackSign.getSign;


public class YunTrack {

    private static final String ENDPOINT = "https://services.yuntrack.com/Track/Query";

    /**
     * Anti-bot cookie (acw_tc) issued by the Yuntrack edge. It is short lived,
     * so refresh it from the browser's network tab when requests start failing.
     */
    private static final String COOKIE =
            "acw_tc=2f3478d917943437133486291edc3590606715503c6857a5861d5ecc60f069";

    private static final MediaType JSON = MediaType.parse("application/json");

    public static YunTrackInfo getTrackingInfo(String number) {

        long timestamp = System.currentTimeMillis();

        // Build the JSON payload
        JsonArray numberList = new JsonArray();
        numberList.add(number);

        JsonObject payload = new JsonObject();
        payload.add("NumberList", numberList);
        payload.addProperty("CaptchaVerification", "");
        payload.addProperty("Year", 0);
        payload.addProperty("Timestamp", timestamp);
        payload.addProperty("Signature", getSign(timestamp, Collections.singletonList(number)));

        RequestBody body = RequestBody.create(payload.toString(), JSON);

        Request req = new Request.Builder()
                .url(ENDPOINT)
                .addHeader("Accept", "application/json, text/plain, */*")
                .addHeader("Accept-Language", "en-US,en;q=0.9")
                .addHeader("Authorization", "Nebula token:undefined")
                .addHeader("Cookie", COOKIE)
                .addHeader("Origin", "https://www.yuntrack.com")
                .addHeader("Referer", "https://www.yuntrack.com/")
                .addHeader("Sec-Fetch-Dest", "empty")
                .addHeader("Sec-Fetch-Mode", "cors")
                .addHeader("Sec-Fetch-Site", "same-site")
                .addHeader("Sec-GPC", "1")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/157.0.0.0 Safari/537.36")
                .addHeader("sec-ch-ua", "\"Not-A.Brand\";v=\"99\", \"Brave\";v=\"157\", \"Chromium\";v=\"157\"")
                .addHeader("sec-ch-ua-mobile", "?0")
                .addHeader("sec-ch-ua-platform", "\"Windows\"")
                .post(body)   // OkHttp sets Content-Type from the RequestBody
                .build();

        Data data = null;
        try (Response response = client.newCall(req).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("HTTP status code: " + response.code());
            }
            data = Globals.gson.fromJson(response.body().string(), Data.class);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        if (data == null || data.getResultList() == null || data.getResultList().isEmpty()) return null;
        return new YunTrackInfo(data.getResultList().getLast().getTrackInfo().getLastTrackEvent());
    }
}
