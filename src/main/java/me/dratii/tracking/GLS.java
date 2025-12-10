package me.dratii.tracking;

import me.dratii.Globals;
import me.dratii.data.tracking.cainiao.Data;
import me.dratii.data.tracking.dpd.DPDInfo;
import me.dratii.data.tracking.gls.GLSData;
import me.dratii.data.tracking.gls.Root;
import me.dratii.data.tracking.gls.TuStatus;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

import static me.dratii.Globals.*;

public class GLS {
    public static GLSData getTrackingInfo(String number) {
        Request request = new Request.Builder()
                .url("https://api-tt.de.gls-group.com/app/service/open/rest/PL/en/rstt001?match=" + number)
                .get()
                .addHeader("x-api-key", configData.GLSAPIkey())
                .build();

        // Execute the request and handle the response
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            String resp = response.body().string();
            System.out.println(resp);
            Root data = gson.fromJson(resp, Root.class);
            String eventDesc = data.tuStatus.getFirst().history.getFirst().evtDscr;
            String City = data.tuStatus.getFirst().history.getFirst().address.city;
            String Date = data.tuStatus.getFirst().history.getFirst().date;
            String Status = data.tuStatus.getFirst().progressBar.statusInfo;
            return new GLSData(eventDesc,City,Date,Status);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}