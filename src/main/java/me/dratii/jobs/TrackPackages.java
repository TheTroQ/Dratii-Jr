package me.dratii.jobs;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import me.dratii.data.schema.Carriers;
import me.dratii.data.schema.Data;
import me.dratii.data.tracking.cainiao.CainiaoInfo;
import me.dratii.data.tracking.dpd.DPDInfo;
import me.dratii.data.tracking.dpd.DPDStatuses;
import me.dratii.data.tracking.inPost.InPostInfo;
import me.dratii.data.tracking.inPost.InPostStatuses;
import me.dratii.data.tracking.postNL.PostNLStatuses;
import me.dratii.handlers.EmbedHandler;
import me.dratii.tracking.*;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import static me.dratii.Globals.*;
import static me.dratii.handlers.ErrorHandler.sendError;

public class TrackPackages {


    public void inpost() {

        for (Data data : currentPackageData) {
            if (!data.carrier.equals(Carriers.InPost)) continue;
            InPostInfo dane = InPost.getTrackingInfo(data.number);


            assert dane != null;
            String[] newTime = dane.tracking_details()[0].datetime().split("T");
            String newStatus = InPostStatuses.Status.get(dane.status()).getName();

            if (!newStatus.equals(data.status)) {
                EmbedHandler.SendEmbed(EmbedHandler.TrackingEmbed(Carriers.InPost, data.number, InPostStatuses.Status.get(dane.status()).getEmoji() + " " + newStatus, newTime[0] + " " + newTime[1], null).build(), data.owner);
                data.status = newStatus;
                saveData();

            }

        }
    }

    public void cainiao() {
        for (Data data : currentPackageData) {
            if (!data.carrier.equals(Carriers.Cainiao)) continue;
            CainiaoInfo dane = Cainiao.getTrackingInfo(data.number);

            assert dane != null;
            String newDesc = dane.status();
            String newTime = dane.time();
            String newStatus = dane.latestTrace().getDesc();

            if (!newStatus.equals(data.status)) {
                EmbedHandler.SendEmbed(EmbedHandler.TrackingEmbed(Carriers.Cainiao, data.number, newStatus, newTime, newDesc).build(), data.owner);
                data.status = newStatus;
                saveData();
            }

        }
    }

    public void pocztaPolska() {
        for (Data data : currentPackageData) {
            if (!data.carrier.equals(Carriers.PocztaPolska)) continue;
            me.dratii.data.tracking.pocztaPolska.Data dane = PocztaPolska.getTrackingInfo(data.number);
            assert dane != null;
            LocalDateTime newTime = LocalDateTime.parse(dane.mailInfo().getEvents().getFirst().getTime(), czas);
            String newStatus = dane.mailInfo().getEvents().getFirst().getName();
            //String state = dane.mailInfo().getEvents().get(dane.mailInfo().getEvents().size()-1).getState().getCode();

            if (!newStatus.equals(data.status)) {
                EmbedHandler.SendEmbed(EmbedHandler.TrackingEmbed(Carriers.PocztaPolska, data.number, newStatus, String.valueOf(newTime), null).build(), data.owner);
                data.status = newStatus;
                saveData();

            }

        }
    }

    public void PostNL() {
        for (Data data : currentPackageData) {
            if (!data.carrier.equals(Carriers.PostNL)) continue;
            me.dratii.data.tracking.postNL.Data dane = PostNL.getTrackingInfo(data.number);
            assert dane != null;
            String[] newTime = LocalDateTime.parse(dane.getData().getItems().getFirst().getEvents().getFirst().getDatetimeLocal(), czas).toString().split("T");
            String category = PostNLStatuses.Status.get(dane.getData().getItems().getFirst().getEvents().getFirst().getCategory()).getName();
            String status = dane.getData().getItems().getFirst().getEvents().getFirst().getStatusDescription();

            if (!status.equals(data.status)) {
                EmbedHandler.SendEmbed(EmbedHandler.TrackingEmbed(Carriers.PostNL, data.number, status, newTime[0] + " " + newTime[1], PostNLStatuses.Status.get(dane.getData().getItems().getFirst().getEvents().getFirst().getCategory()).getEmoji() + " " + category).build(), data.owner);
                data.status = status;
                saveData();

            }

        }
    }

    public void DPD() {
        for (Data data : currentPackageData) {
            if (!data.carrier.equals(Carriers.DPD)) continue;

            DPDInfo info = DPD.getTrackingInfo(data.number);
            assert info != null;


            if (!info.status().equals(data.status)) {
                EmbedHandler.SendEmbed(EmbedHandler.TrackingEmbed(Carriers.DPD, data.number, DPDStatuses.Status.get(info.status()).getEmoji() + " " + info.status(), info.time(), null).build(), data.owner);
                data.status = info.status();
                saveData();

            }
        }
    }

    private void saveData() {
        Data[] data = currentPackageData;

        // Create a new JsonArray
        JsonArray jsonArray = new JsonArray();

        // Iterate over the data array and add each Data object as a JsonObject to the JsonArray
        for (Data dane : data) {
            JsonObject jsonObject = gson.toJsonTree(dane).getAsJsonObject();
            jsonArray.add(jsonObject);
        }

        // Convert the JsonArray to a JSON string
        String json = gson.toJson(jsonArray);

        try {
            FileWriter file = new FileWriter(packages);
            file.write(json);
            file.flush();
            file.close();
        } catch (IOException e) {
            sendError(e.getMessage());
        }
    }
}
