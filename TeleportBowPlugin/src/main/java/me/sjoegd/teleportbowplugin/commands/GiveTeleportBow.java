package me.sjoegd.teleportbowplugin.commands;

import me.sjoegd.teleportbowplugin.utilities.TeleportBow;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GiveTeleportBow implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player player) {
            player.getInventory().addItem(new TeleportBow().giveTeleportBow());
            player.getInventory().addItem(new ItemStack(Material.ARROW, 1));
            player.sendMessage(ChatColor.RED + "TeleportBow given");
        }

        return true;
    }
}
