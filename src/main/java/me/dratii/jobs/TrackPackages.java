package me.dratii.jobs;

import static me.dratii.Globals.*;
import static me.dratii.handlers.ErrorHandler.sendError;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import me.dratii.data.schema.Carriers;
import me.dratii.data.schema.Data;
import me.dratii.data.schema.Statuses;
import me.dratii.data.tracking.cainiao.CainiaoInfo;
import me.dratii.data.tracking.dpd.DPDInfo;
import me.dratii.data.tracking.dpd.DPDStatuses;
import me.dratii.data.tracking.gls.GLSData;
import me.dratii.data.tracking.gls.GLSstatuses;
import me.dratii.data.tracking.gls.Info;
import me.dratii.data.tracking.inPost.InPostInfo;
import me.dratii.data.tracking.inPost.InPostStatuses;
import me.dratii.data.tracking.postNL.Data__1;
import me.dratii.data.tracking.postNL.Event;
import me.dratii.data.tracking.postNL.Item;
import me.dratii.data.tracking.postNL.PostNLStatuses;
import me.dratii.handlers.EmbedHandler;
import me.dratii.handlers.RemovePackageHandler;
import me.dratii.tracking.*;

public class TrackPackages {

    public void inpost(Data data) {
        InPostInfo dane = InPost.getTrackingInfo(data.number);

        assert dane != null;
        String[] newTime = dane.tracking_details()[0].datetime().split("T");
        String newStatus = InPostStatuses.Status.get(dane.status()).getName();

        if (!newStatus.equals(data.status)) {
            EmbedHandler.SendEmbed(EmbedHandler.TrackingEmbed(Carriers.InPost, data.number, InPostStatuses.Status.get(dane.status()).getEmoji() + " " + newStatus, newTime[0] + " " + newTime[1], null,data.friendlyName).build(), data.owner);
            data.status = newStatus;
            saveData();
            removeIfFinished(data);
        }
    }

    public void cainiao(Data data) {
        CainiaoInfo dane = Cainiao.getTrackingInfo(data.number);

        assert dane != null;
        String newDesc = dane.status();
        String newTime = dane.time();
        String newStatus = dane.latestTrace().getDesc();

        if (!newStatus.equals(data.status)) {
            EmbedHandler.SendEmbed(EmbedHandler.TrackingEmbed(Carriers.Cainiao, data.number, newStatus, newTime, newDesc, data.friendlyName).build(), data.owner);
            data.status = newStatus;
            saveData();
            removeIfFinished(data);
        }
    }

    //public void pocztaPolska() {
    //    for (Data data : currentPackageData) {
    //        if (!data.carrier.equals(Carriers.PocztaPolska)) continue;
    //        me.dratii.data.tracking.pocztaPolska.Data dane = PocztaPolska.getTrackingInfo(data.number);
    //        assert dane != null;
    //        LocalDateTime newTime = LocalDateTime.parse(dane.mailInfo().getEvents().getFirst().getTime(), czas);
    //        String newStatus = dane.mailInfo().getEvents().getFirst().getName();
    //        //String state = dane.mailInfo().getEvents().get(dane.mailInfo().getEvents().size()-1).getState().getCode();
    //
    //        if (!newStatus.equals(data.status)) {
    //            EmbedHandler.SendEmbed(EmbedHandler.TrackingEmbed(Carriers.PocztaPolska, data.number, newStatus, String.valueOf(newTime), null).build(), data.owner);
    //            data.status = newStatus;
    //            saveData();
    //
    //        }
    //
    //    }
    //}

    public void PostNL(Data data) {
        me.dratii.data.tracking.postNL.Data dane = PostNL.getTrackingInfo(data.number);
        String strDt = Optional.ofNullable(dane).map(me.dratii.data.tracking.postNL.Data::getData).map(Data__1::getItems).map(List::getFirst).map(Item::getEvents).map(List::getFirst).map(Event::getDatetimeLocal).orElse(null);
        String strCat = Optional.ofNullable(dane).map(me.dratii.data.tracking.postNL.Data::getData).map(Data__1::getItems).map(List::getFirst).map(Item::getEvents).map(List::getFirst).map(Event::getCategory).orElse(null);
        String strStat = Optional.ofNullable(dane).map(me.dratii.data.tracking.postNL.Data::getData).map(Data__1::getItems).map(List::getFirst).map(Item::getEvents).map(List::getFirst).map(Event::getStatusDescription).orElse(null);
        if (strDt == null || strCat == null || strStat == null) return;

        var parsed = LocalDateTime.parse(strDt, czas);
        var dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        var timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String[] newTime = {parsed.format(dateFormatter), parsed.format(timeFormatter),};

        if (!strStat.equals(data.status)) {
            EmbedHandler.SendEmbed(EmbedHandler.TrackingEmbed(Carriers.PostNL, data.number, strStat, newTime[0] + " " + newTime[1], PostNLStatuses.Status.get(strCat).getEmoji() + " " + strCat, data.friendlyName).build(), data.owner);
            data.status = strStat;
            saveData();
            removeIfFinished(data);
        }
    }

    public void DPD(Data data) {
        DPDInfo info = DPD.getTrackingInfo(data.number);
        assert info != null;

        if (!info.status().equals(data.status)) {
            EmbedHandler.SendEmbed(EmbedHandler.TrackingEmbed(Carriers.DPD, data.number, DPDStatuses.Status.get(info.status()).getEmoji() + " " + info.status(), info.time(), null,data.friendlyName).build(), data.owner);
            data.status = info.status();
            saveData();
            removeIfFinished(data);
        }
    }

    public void GLS(Data data) {
        GLSData info = GLS.getTrackingInfo(data.number);
        assert info != null;

        if (!info.Event().equals(data.status)) {
            EmbedHandler.SendEmbed(EmbedHandler.TrackingEmbed(Carriers.gls, data.number, GLSstatuses.Status.get(info.status()).getEmoji() + " " + info.Event(), info.Date(), null,data.friendlyName).build(), data.owner);
            data.status = info.Event();
            saveData();
            removeIfFinished(data);
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
    private void removeIfFinished(Data data){
        if(Objects.equals(data.status, Statuses.DELIVERED.getName())){
            RemovePackageHandler.removeFinishedPackagesByData(data);
        }
    }
}
