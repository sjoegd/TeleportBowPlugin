package me.sjoegd.teleportbowplugin.listeners;

import me.sjoegd.teleportbowplugin.utilities.TeleportBow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.Inventory;

public class TeleportBowListener implements Listener {

    @EventHandler
    public void onLand(ProjectileHitEvent e) {

        if (e.getEntity().getShooter() instanceof Player p) {
            Inventory inventory = p.getInventory();
            if(inventory.contains(new TeleportBow().giveTeleportBow())) {
                System.out.println("Debug has teleport bow");
                p.teleport(e.getEntity().getLocation());
            }
            else {
                System.out.println("Debug no teleport bow");
            }
        }

    }

}
