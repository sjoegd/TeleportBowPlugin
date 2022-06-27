package me.sjoegd.teleportbowplugin;

import me.sjoegd.teleportbowplugin.commands.GiveTeleportBow;
import me.sjoegd.teleportbowplugin.listeners.TeleportBowListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TeleportBowPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("teleportbow").setExecutor(new GiveTeleportBow());
        getServer().getPluginManager().registerEvents(new TeleportBowListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
