package me.dyncake.gun.listeners;

import me.dyncake.gun.objects.RPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoinObjects implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        RPlayer.getMap().put(event.getPlayer(), new RPlayer(event.getPlayer()));
        RPlayer.getPlayers().add(RPlayer.getMap().get(event.getPlayer()));
    }

}
