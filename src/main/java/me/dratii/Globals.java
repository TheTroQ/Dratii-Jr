package me.dratii;

import club.minnced.discord.webhook.WebhookClient;
import com.google.gson.Gson;
import me.dratii.data.discord.ConfigData;
import me.dratii.data.schema.Data;
import net.dv8tion.jda.api.JDA;
import net.kyori.adventure.text.logger.slf4j.ComponentLogger;
import okhttp3.OkHttpClient;
import org.quartz.Scheduler;

import java.io.File;
import java.time.format.DateTimeFormatter;

public class Globals {
    public static Scheduler scheduler;
    public static OkHttpClient client = new OkHttpClient();
    public static final File config = new File("config.json");
    public static final File packages = new File("packages/packs.json");
    public static ConfigData configData;
    public static JDA jda;
    public static Gson gson = new Gson();
    public static final ComponentLogger DEFAULT_LOG = ComponentLogger.logger("System");
    public static final ComponentLogger INPOST_LOG = ComponentLogger.logger("InPost");
    public static final ComponentLogger CAINIAO_LOG = ComponentLogger.logger("Cainiao");
    public static Data[] currentPackageData;
    public static WebhookClient webhookClient;
    public static String PostNLApiKey;
    public static DateTimeFormatter czas = DateTimeFormatter.ISO_DATE_TIME;
}
