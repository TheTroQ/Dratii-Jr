package me.dratii.tracking;

import me.dratii.Globals;
import me.dratii.data.discord.ConfigData;
import me.dratii.data.tracking.pocztaPolska.Data;
import me.dratii.data.tracking.pocztaPolska.PocztaPolskaInfo;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

import static me.dratii.Globals.*;

public class PocztaPolska {

    public static Data getTrackingInfo(String number) {

        // Define the request parameters
        HttpUrl.Builder urlBuilder = HttpUrl.parse("https://uss.poczta-polska.pl/uss/v2.0/tracking/checkmailex").newBuilder()
                .addQueryParameter("language", "PL")
                .addQueryParameter("number", number)
                .addQueryParameter("addPostOfficeInfo", "false") // only when user USS has additional attribute
                .addQueryParameter("states", "true");
        String url = urlBuilder.build().toString();

        // Build the request
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("Accept", "application/json")
                .addHeader("api_key", configData.PocztaPolskaAPIKey())
                .build();

        // Execute the request and handle the response
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            return gson.fromJson(response.body().string(),Data.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
