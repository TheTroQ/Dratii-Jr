package me.dratii.handlers;

import me.dratii.data.schema.Carriers;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

import java.awt.*;
import java.util.Objects;

import static me.dratii.Globals.jda;
import static me.dratii.handlers.ErrorHandler.sendError;

public class EmbedHandler {


    public static EmbedBuilder TrackingEmbed(Carriers carrier, String number, String status, String date, String desc) {
        EmbedBuilder eb = new EmbedBuilder();
        eb.setTitle("Tracking Update!");

        switch (carrier) {
            case Cainiao:
                eb.setColor(Color.blue);
                eb.addField("Carrier: ",  String.valueOf(carrier), true);
                break;
            case InPost:
                eb.setColor(Color.yellow);
                eb.addField("Carrier: ",  String.valueOf(carrier), true);
                break;
            case PocztaPolska:
                eb.setColor(Color.red);
                eb.addField("Carrier: ",  String.valueOf(carrier), true);
                break;
            case null, default:
                eb.setColor(Color.cyan);
                eb.addField("Carrier: ", "Error", true);
                break;
        }

        eb.setDescription("Package: " + number + " just got status update!");

        eb.addField("On:", date, false);

        eb.addField("Status:", status, true);

        if (desc == null) {
        } else {
            eb.addField("Description:", desc, true);
        }


        eb.setFooter("Powered by love from catboys.network");

        return eb;
    }

    public static void SendEmbed(MessageEmbed embed, String userID) {
        try {
            Objects.requireNonNull(jda.getUserById(userID)).openPrivateChannel().flatMap(channel -> channel.sendMessageEmbeds(embed)).queue();
        } catch (Exception e) {
            sendError(e.getMessage());
        }
    }
}
