package me.dratii.handlers;

import me.dratii.data.schema.Carriers;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

import java.awt.*;
import java.util.Objects;

import static me.dratii.Globals.jda;
import static me.dratii.handlers.ErrorHandler.sendError;

public class EmbedHandler {


    public static EmbedBuilder TrackingEmbed(Carriers carrier, String number, String status, String date, String desc,String friendlyName) {
        EmbedBuilder eb = new EmbedBuilder();
        eb.setTitle("Tracking Update of "+friendlyName+"!");

        switch (carrier) {
            case Cainiao:
                eb.setColor(Color.blue);
                eb.addField("Carrier: ", String.valueOf(carrier), true);
                break;
            case InPost:
                eb.setColor(Color.yellow);
                eb.addField("Carrier: ", String.valueOf(carrier), true);
                break;
            case PocztaPolska:
                eb.setColor(Color.white);
                eb.addField("Carrier: ", String.valueOf(carrier), true);
                break;
            case PostNL:
                eb.setColor(Color.orange);
                eb.addField("Carrier: ", String.valueOf(carrier), true);
                break;
            case DPD:
                eb.setColor(Color.red);
                eb.addField("Carrier: ", String.valueOf(carrier), true);
                break;
            case gls:
                eb.setColor(Color.yellow);
                eb.addField("Carrier: ", String.valueOf(carrier), true);
                break;
            case yuntrack:
                eb.setColor(Color.green);
                eb.addField("Carrier: ", String.valueOf(carrier), true);
                break;
            case null, default:
                eb.setColor(Color.cyan);
                eb.addField("Carrier: ", "Error", true);
                break;
        }

        eb.setDescription("Package: " + number + " just got status update!");

        eb.addField("On:", date, false);

        eb.addField("Status:", status, true);

        if (!(desc == null)) {
            eb.addField("Description:", desc, true);
        }

        eb.setFooter("Powered by love from dratii.me","https://cdn.discordapp.com/avatars/341291627509186560/490dda2a7b68c59492e99557d979ba3a.png?size=1024");

        return eb;
    }

    public static void SendEmbed(MessageEmbed embed, String userID) {
        try {
            Objects.requireNonNull(jda.getUserById(userID)).openPrivateChannel().flatMap(channel -> channel.sendMessageEmbeds(embed)).queue();
        } catch (Exception e) {
            sendError(e.toString());
        }
    }
}
