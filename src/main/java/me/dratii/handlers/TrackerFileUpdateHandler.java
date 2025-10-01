package me.dratii.handlers;

import me.dratii.data.schema.Carriers;
import me.dratii.data.schema.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import static me.dratii.Globals.*;

public class TrackerFileUpdateHandler {
    public static void updateFile(Data data) {
        try {
            JsonElement dane = JsonParser.parseReader(new BufferedReader(new FileReader(packages)));
            dane.getAsJsonArray().add(gson.toJsonTree(data));
            String json = gson.toJson(dane);

            FileWriter file = new FileWriter(packages);
            file.write(json);
            file.flush();
            file.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
