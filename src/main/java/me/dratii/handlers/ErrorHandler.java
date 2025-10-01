package me.dratii.handlers;

import club.minnced.discord.webhook.WebhookClientBuilder;
import me.dratii.Globals;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.WebhookClient;
import net.dv8tion.jda.api.entities.Webhook;
import net.dv8tion.jda.api.requests.RestAction;
import net.dv8tion.jda.api.utils.FileUpload;

import static me.dratii.Globals.DEFAULT_LOG;
import static me.dratii.Globals.configData;

public class ErrorHandler {
    private static WebhookClient webhookClient;

    public static void initializeWebhook(String webhookUrl) {
        if (webhookUrl != null && !webhookUrl.isEmpty()) {
            WebhookClientBuilder builder = new WebhookClientBuilder(webhookUrl);
            builder.build();
        } else {
            DEFAULT_LOG.error("Error Webhook URL is not configured.");
        }
    }

    public static void sendError(String errorMessage) {
        if (webhookClient == null) {
            initializeWebhook(configData.ErrorWebhookURL());
            return;
        }

        EmbedBuilder embed = new EmbedBuilder()
                .setTitle("An Error Occurred")
                .setDescription(errorMessage)
                .setColor(0xFF0000); // Red color for error embeds
        DEFAULT_LOG.error(errorMessage);
        webhookClient.sendMessageEmbeds(embed.build()).queue();
    }
}
