package me.sjoegd.teleportbowplugin.utilities;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

public class TeleportBow {

    public ItemStack giveTeleportBow() {

        ItemStack teleportBow = new ItemStack(Material.BOW,1);
        ItemMeta teleportBowMeta = teleportBow.getItemMeta();
        teleportBowMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "[TeleportBow]");
        teleportBowMeta.addEnchant(Enchantment.ARROW_INFINITE,1, true);
        teleportBowMeta.setUnbreakable(true);
        teleportBowMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        teleportBowMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        teleportBowMeta.setLore(new ArrayList<>(Arrays.asList("Bow that", "teleports :)")));
        teleportBow.setItemMeta(teleportBowMeta);
        return teleportBow;

    }



}
