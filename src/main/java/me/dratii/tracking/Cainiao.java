package me.dratii.tracking;

import me.dratii.data.tracking.cainiao.Data;
import me.dratii.data.tracking.cainiao.CainiaoInfo;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

import static me.dratii.Globals.CAINIAO_LOG;
import static me.dratii.Globals.gson;

public class Cainiao {
    private static String makeHttpRequest(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) CAINIAO_LOG.error("Unexpected code {}", response);
            return response.body().string();
        }
    }

    public static CainiaoInfo getTrackingInfo(String number) {
        String url = "https://global.cainiao.com/global/detail.json?mailNos="+number+"&lang=en-US&language=en-US";
        try {
            String jsonResponse = makeHttpRequest(url);
            Data data = gson.fromJson(jsonResponse, Data.class);
            return new CainiaoInfo(data.getModule().getFirst().getStatus(),data.getModule().getFirst().getDaysNumber(),data.getModule().getFirst().getStatusDesc());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
