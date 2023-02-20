package me.dyncake.gun.runnables;

import me.dyncake.gun.objects.RPlayer;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Map;

public class RunAddSave extends BukkitRunnable {

    @Override
    public void run() {

        for (Map.Entry<Player, RPlayer> set : RPlayer.getMap().entrySet()) {
            RPlayer wPlayer = set.getValue();
            wPlayer.addAndRemove(set.getKey().getLocation());

        }
    }
}
