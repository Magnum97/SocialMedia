package me.goldensecrets;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import org.bukkit.block.CommandBlock;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.logging.Logger;

// The commands will extend BaseCommand - each class will need to extend BaseCommand
@CommandAlias("discord")
public class Sender extends BaseCommand {

	// We can use the name plugin here because it is private and does not extend JavaPlugin
	private static SocialMedia plugin = SocialMedia.getInstance();

	@Default // Use default because there are no sub command or arguments passed to it.
	public static void onDiscord (CommandSender sender) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			player.sendMessage("Equestrians United discord is https://discord.gg/BENtZpB");
			// This command structure is a void type; which means you do not need to return anything.
		}
		if (! (sender instanceof CommandBlock)) {
			// Read about logic operators in Java. ! means not
			// so in this case if sender is NOT a CommandBlock do this code
			Logger log = plugin.getLogger();
			// There are several levels you can write to log (console)
			// The main ones are INFO, WARN, ERROR
			log.info("Did you forget the discord link boss?");
			log.info("It is https://discord.gg/BENtZp");
		}
	}
}
