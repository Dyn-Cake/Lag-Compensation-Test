package me.dyncake.gun.listeners;

import me.dyncake.gun.objects.RPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnLeaveObjects implements Listener {
    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        RPlayer.getPlayers().remove(RPlayer.getMap().get(event.getPlayer()));
        RPlayer.getMap().remove(event.getPlayer());
    }
}
