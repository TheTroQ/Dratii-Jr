package me.dratii.tracking;

import me.dratii.data.tracking.postNL.Data;
import okhttp3.*;

import java.io.IOException;

import static me.dratii.Globals.*;

public class PostNL {

    public static Data getTrackingInfo(String number) {
        Data data = new Data();
        RequestBody body = RequestBody.create("{\"items\":[\""+number+"\"],\"language_code\":\"en\"}", MediaType.parse("application/json"));
        // Create an HTTP POST request with context
        Request req = new Request.Builder()
                .url("https://postnl.post/api/v1/tracking-items")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36")
                .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8")
                .addHeader("Accept-Language", "en-US,en;q=0.5")
                .addHeader("Upgrade-Insecure-Requests", "1")
                .addHeader("Pragma", "no-cache")
                .addHeader("Cache-Control", "no-cache")
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("authorization", "Bearer "+PostNLApiKey)
                .post(body)
                .build();

        try (Response response = client.newCall(req).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("HTTP status code: " + response.code());
            }

            // Parse the HTML response using Jsoup
             data = gson.fromJson(response.body().string(), Data.class);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return data;
    }
}
