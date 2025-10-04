package me.dratii.jobs;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import me.dratii.data.schema.Carriers;
import me.dratii.data.schema.Data;
import me.dratii.data.schema.Statuses;
import me.dratii.data.tracking.cainiao.CainiaoInfo;
import me.dratii.data.tracking.inPost.InPostInfo;
import me.dratii.data.tracking.inPost.InPostStatuses;
import me.dratii.handlers.EmbedHandler;
import me.dratii.tracking.Cainiao;
import me.dratii.tracking.InPost;
import me.dratii.tracking.PocztaPolska;
import me.dratii.tracking.PostNL;

import java.io.FileWriter;
import java.io.IOException;
import java.util.EnumMap;

import static me.dratii.Globals.*;
import static me.dratii.Globals.gson;
import static me.dratii.Globals.packages;
import static me.dratii.handlers.ErrorHandler.sendError;

public class TrackPackages {


    public void inpost() {

        for (Data data : currentPackageData) {
            if (!data.carrier.equals(Carriers.InPost)) continue;
            InPostInfo dane = InPost.getTrackingInfo(data.number);


            assert dane != null;
            String newTime = dane.tracking_details()[0].datetime();
            String newStatus = InPostStatuses.Status.get(dane.status()).getName();

            if (!newStatus.equals(data.status)) {
                        EmbedHandler.SendEmbed(EmbedHandler.TrackingEmbed(Carriers.InPost, data.number, newStatus, newTime, null).build(), data.owner);
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
            String newTime = dane.mailInfo().getEvents().get(dane.mailInfo().getEvents().size()-1).getTime();
            String newStatus = dane.mailInfo().getEvents().get(dane.mailInfo().getEvents().size()-1).getName();
            //String state = dane.mailInfo().getEvents().get(dane.mailInfo().getEvents().size()-1).getState().getCode();

            if (!newStatus.equals(data.status)) {
                EmbedHandler.SendEmbed(EmbedHandler.TrackingEmbed(Carriers.PocztaPolska, data.number, newStatus, newTime, null).build(), data.owner);
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
            String newTime = dane.getData().getItems().getFirst().getEvents().getFirst().getDatetimeLocal();
            String newStatus = dane.getData().getItems().getFirst().getEvents().getFirst().getStatusDescription();
            String state = dane.getData().getItems().getFirst().getEvents().getFirst().getCategory();

            if (!newStatus.equals(data.status)) {
                EmbedHandler.SendEmbed(EmbedHandler.TrackingEmbed(Carriers.PostNL, data.number, newStatus, newTime, state).build(), data.owner);
                data.status = newStatus;
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
