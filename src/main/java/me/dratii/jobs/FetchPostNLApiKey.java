package me.dratii.jobs;

import me.dratii.data.tracking.postNL.Token;
import me.dratii.data.tracking.pocztaPolska.Data;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.io.IOException;

import static me.dratii.Globals.*;

public class FetchPostNLApiKey implements Job{
    private static Token GetApiKey() {
        Request request = new Request.Builder()
                .url("https://postnl.post/api/v1/auth/token")
                .post(RequestBody.EMPTY)
                .addHeader("Accept", "application/json")
                .addHeader("api_key", configData.PocztaPolskaAPIKey())
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            return gson.fromJson(response.body().string(), Token.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        PostNLApiKey = GetApiKey().access_token();
    }
}
