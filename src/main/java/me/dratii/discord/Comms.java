package me.dratii.discord;

import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

import java.util.Map;

import static me.dratii.Globals.jda;

public class Comms {
    public static void InitializeCommands() {
        jda.updateCommands().addCommands(
                Commands.slash("addpackage", "Adds a package to the tracking list for your account.")
                        .addOption(OptionType.STRING, "packagenumber", "Your package number.", true)
                        .addOptions(new OptionData(OptionType.STRING, "carrier", "The Carrier of the package.", true)
                                .addChoice("InPost", "inpost")
                                .addChoice("Cainiao", "cainiao")
                                //.addChoice("PocztaPolska", "pocztapolska")
                                .addChoice("PostNL", "postnl")
                                .addChoice("DPD", "dpd"))
                        .addOption(OptionType.STRING,"name","Add a friendly name to Your package",true),
                Commands.slash("removepackage", "Removes a package to the tracking list for your account.")
        ).queue();
    }
}
