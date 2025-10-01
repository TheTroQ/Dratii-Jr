package me.dratii.handlers;

import club.minnced.discord.webhook.WebhookClientBuilder;
import club.minnced.discord.webhook.send.WebhookEmbed;
import club.minnced.discord.webhook.send.WebhookEmbedBuilder;
import me.dratii.Globals;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.WebhookClient;
import net.dv8tion.jda.api.entities.Webhook;
import net.dv8tion.jda.api.requests.RestAction;
import net.dv8tion.jda.api.utils.FileUpload;

import static me.dratii.Globals.*;

public class ErrorHandler {

    public static void sendError(String errorMessage) {
        WebhookEmbed embed = new WebhookEmbedBuilder()
                .setTitle(new WebhookEmbed.EmbedTitle("Error occured!",null))
                .setColor(0xFF0000)
                .setDescription(errorMessage)
                .build();
        DEFAULT_LOG.error(errorMessage);
        webhookClient.send(embed);
    }
}
