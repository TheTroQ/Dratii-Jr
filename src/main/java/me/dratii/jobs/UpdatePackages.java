package me.dratii.jobs;

import me.dratii.Globals;
import me.dratii.data.schema.Data;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;

import static me.dratii.Globals.currentPackageData;
import static me.dratii.Globals.gson;
import static me.dratii.handlers.ErrorHandler.sendError;

public class UpdatePackages implements Job {
    TrackPackages trackPackages = new TrackPackages();

    public void loadData() {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(Globals.packages));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Data[] data = gson.fromJson(br, Data[].class);
        currentPackageData = data;
    }

    //PocztaPolskaInfo info = new PocztaPolskaInfo(data.getMailInfo(),(new PocztaPolskaInfo.info(data.mailInfo().getStates(),data.mailInfo().getEvents())));
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        loadData();
        for (int i = 0; i < currentPackageData.length; i++) {
            Data dane = currentPackageData[i];
            switch (dane.carrier) {
                case InPost:
                    trackPackages.inpost();
                    break;
                case Cainiao:
                    trackPackages.cainiao();
                    break;
                case PocztaPolska:
                    trackPackages.pocztaPolska();
                    break;
                case PostNL:
                    trackPackages.PostNL();
                    break;
                default:
                    // Handle the default case or throw an exception if necessary
                    System.out.println("Unknown carrier: " + dane.carrier);
                    break;
            }
            try {
                Thread.sleep(Duration.ofMinutes(1).toMillis());
            } catch (InterruptedException e) {
                sendError(e.getMessage());
            }
        }

    }
}