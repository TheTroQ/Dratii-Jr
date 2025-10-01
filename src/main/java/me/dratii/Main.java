package me.dratii;


import me.dratii.data.discord.ConfigData;
import me.dratii.discord.Comms;
import me.dratii.discord.Listeners;
import me.dratii.jobs.UpdatePackages;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import org.quartz.JobDetail;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static me.dratii.Globals.*;
import static me.dratii.handlers.ErrorHandler.sendError;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

public class Main {
    static JobDetail jobTracker;
    static Trigger triggerTracker;
    static Trigger triggerUpdatePackages;
    static JobDetail jobUpdatePackages;

    public static void main(String[] args) {
        // Move bufferedReader and configData initialization outside the if block for better readability

        if (config.exists()) {
            try {
                Globals.configData = gson.fromJson(new BufferedReader(new FileReader(config)), ConfigData.class);
                jda = JDABuilder.create(configData.Token(), GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_PRESENCES, GatewayIntent.GUILD_MEMBERS).setActivity(Activity.competing("mischievous activities")).setStatus(OnlineStatus.ONLINE).disableCache(CacheFlag.VOICE_STATE, CacheFlag.EMOJI, CacheFlag.STICKER, CacheFlag.SCHEDULED_EVENTS).build();
                init();
            } catch (FileNotFoundException e) {
                DEFAULT_LOG.error("Error reading config file: {}", e.getMessage()); // Use err for errors
                DEFAULT_LOG.error("Error reading config file \n Exiting!");
                System.exit(42);
            } catch (Exception e) {
                DEFAULT_LOG.error("Unexpected error: {}", e.getMessage()); // Catch other exceptions if needed
                System.exit(43); // Consider a more appropriate exit code based on the error handling strategy
            }
        } else {
            DEFAULT_LOG.info("Config file does not exist.");
        }
    }

    public static void init() {
        DEFAULT_LOG.info("Initializing...");
        try {
            scheduler = StdSchedulerFactory.getDefaultScheduler();
        }catch (SchedulerException e) {
            sendError(String.valueOf(e));
        }
        DEFAULT_LOG.info("Initializing commands...");
        Comms.InitializeCommands();
        DEFAULT_LOG.info("Commands initialized.");
        DEFAULT_LOG.info("Initializing listeners...");
        jda.addEventListener(new Listeners());
        DEFAULT_LOG.info("Listeners initialized.");
        DEFAULT_LOG.info("Build jobs...");
        try {
            jobBuilder();
        } catch (SchedulerException e) {
            sendError(String.valueOf(e));
        }
        DEFAULT_LOG.info("Build jobs complete.");
        DEFAULT_LOG.info("Build triggers...");
        triggerBuilder();
        DEFAULT_LOG.info("Build triggers complete.");
        DEFAULT_LOG.info("Scheduling jobs...");
        try {
            scheduler.scheduleJob(jobTracker, triggerTracker);
            scheduler.scheduleJob(jobUpdatePackages, triggerUpdatePackages);
        } catch (SchedulerException e) {
            sendError(String.valueOf(e));
        }
        DEFAULT_LOG.info("Jobs scheduled.");
        DEFAULT_LOG.info("Starting scheduler...");
        try {
            scheduler.start();
        } catch (SchedulerException e) {
            sendError(String.valueOf(e));
        }
        DEFAULT_LOG.info("Scheduler started.");
        DEFAULT_LOG.info("Initialization complete.");
    }

    private static void jobBuilder() throws SchedulerException {
        jobTracker = newJob(UpdatePackages.class)
                .withIdentity("Tracker", "TrackerGroup")
                .build();
    }

    private static void triggerBuilder() {
        triggerTracker = newTrigger()
                .withIdentity("Tracker", "TrackerGroup")
                .startNow()
                .withSchedule(simpleSchedule()
                        .withIntervalInMinutes(10)
                        .repeatForever())
                .build();

    }
}
