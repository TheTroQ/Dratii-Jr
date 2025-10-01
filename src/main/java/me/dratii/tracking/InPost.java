package me.dratii.tracking;

import me.dratii.Globals;
import me.dratii.data.tracking.inPost.InPostInfo;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

import static me.dratii.Globals.INPOST_LOG;
import static me.dratii.Globals.gson;
import static me.dratii.handlers.ErrorHandler.sendError;

public class InPost {
    private static final OkHttpClient client = Globals.client;

    public static InPostInfo getTrackingInfo(String number) {
        String url = "https://api-shipx-pl.easypack24.net/v1/tracking/"+number;
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) INPOST_LOG.error("Tracking package {} failed, Error: {}", number, response);

            String jsonResponse = response.body().string();
            return (gson.fromJson(jsonResponse, InPostInfo.class));
        } catch (IOException e) {
            sendError(String.valueOf(e));

        }
        return null;

    }
}
