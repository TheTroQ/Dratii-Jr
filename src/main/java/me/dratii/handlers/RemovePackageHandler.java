package me.dratii.handlers;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import me.dratii.data.schema.Data;

import java.io.FileWriter;
import java.io.IOException;

import static me.dratii.Globals.*;
import static me.dratii.handlers.ErrorHandler.sendError;

public class RemovePackageHandler {
    public static void removeFinishedPackages(Data packToRemove) {
        Data[] data = currentPackageData;

        // Create a new JsonArray
        JsonArray jsonArray = new JsonArray();

        // Iterate over the data array and add each Data object as a JsonObject to the JsonArray
        for (Data dane : data) {
            JsonObject jsonObject = gson.toJsonTree(dane).getAsJsonObject();
            JsonObject packet = gson.toJsonTree(packToRemove).getAsJsonObject();
            if (jsonObject.equals(packet)){
                jsonArray.remove(jsonObject);
            }else {
                jsonArray.add(jsonObject);
            }
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
