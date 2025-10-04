package me.dratii.discord;

import me.dratii.data.schema.Carriers;
import me.dratii.data.schema.Data;
import me.dratii.handlers.RemovePackageHandler;
import me.dratii.handlers.TrackerFileUpdateHandler;
import me.dratii.jobs.UpdatePackages;
import net.dv8tion.jda.api.components.actionrow.ActionRow;
import net.dv8tion.jda.api.components.buttons.Button;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

import static me.dratii.Globals.currentPackageData;

public class Listeners extends ListenerAdapter {
    UpdatePackages updatePackages = new UpdatePackages();

    private String buttonEventType;

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("addpackage")) {
            event.deferReply(true).queue();
            TrackerFileUpdateHandler.updateFile(new Data(event.getUser().getId(), "TBU", event.getOption("packagenumber").getAsString(), getCarrier(event.getOption("carrier").getAsString()), false));
            event.getHook().sendMessage("Paczka dodana!").queue();
        } else if (event.getName().equals("removepackage")) {
            buttonEventType = "removepackage";
            currentPackageData = null;
            updatePackages.loadData();
            List<Button> buttonData = GenerateButtons(currentPackageData, event.getUser().getId());
            if (buttonData.isEmpty()) {
                event.reply("Nie znaleziono paczek!").queue();
            } else {
                event.reply("Click the button to remove the package.")
                        .addComponents(
                                ActionRow.of(buttonData))
                        .queue();


            }
        }
    }

    @Override
    public void onButtonInteraction(ButtonInteractionEvent event) {
        if(Objects.equals(buttonEventType, "removepackage")){
        event.deferReply(true).queue();
        currentPackageData = null;
        updatePackages.loadData();
        String ButtonID = event.getComponentId();
        AtomicInteger i = new AtomicInteger();
        Arrays.stream(currentPackageData).forEach(data -> {
            if (i.get() == (Integer.parseInt(ButtonID))) {
                RemovePackageHandler.removeFinishedPackagesByData(data);
                event.getHook().editOriginal("Package removed").queue();
            }
            i.getAndIncrement();
        });
    }

    }

    private Carriers getCarrier(String carrier) {
        switch (carrier) {
            case "inpost":
                return Carriers.InPost;
            case "cainiao":
                return Carriers.Cainiao;
            case "pocztapolska":
                return Carriers.PocztaPolska;
            case "postnl":
                return Carriers.PostNL;
        }
        return null;
    }

    private List<Button> GenerateButtons(Data[] data, String owner) {
        List<Button> buttonsRow1 = new ArrayList<>();
        AtomicInteger i = new AtomicInteger(0);
        Arrays.stream(data).forEach(dane -> {
            if (dane.owner.equals(owner)) {
                buttonsRow1.add(Button.primary(String.valueOf(i.get()), dane.number));
            }
            i.getAndIncrement();
        });
        return buttonsRow1;
    }
}