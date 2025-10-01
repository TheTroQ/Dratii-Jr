package me.dratii.discord;

import me.dratii.data.schema.Carriers;
import me.dratii.data.schema.Data;
import me.dratii.handlers.TrackerFileUpdateHandler;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Listeners extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("addpackage")) {
            TrackerFileUpdateHandler.updateFile(new Data(event.getUser().getId(), "TBU", event.getOption("packagenumber").getAsString(), getCarrier(event.getOption("carrier").getAsString()),false));
            event.deferReply(true).queue();

            event.getHook().sendMessage("Paczka dodana!").queue();
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
}