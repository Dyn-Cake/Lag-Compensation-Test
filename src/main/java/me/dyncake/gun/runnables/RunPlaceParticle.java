package me.dyncake.gun.runnables;

import me.dyncake.gun.objects.RPlayer;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.scheduler.BukkitRunnable;

public class RunPlaceParticle extends BukkitRunnable {
    @Override
    public void run() {
        for (RPlayer rPlayer : RPlayer.getPlayers()) {
            Location oldLoc;
            try {
                oldLoc = rPlayer.getLocations().get(19);
            } catch (IndexOutOfBoundsException ex) {
                continue;
            }
            if (oldLoc.getWorld() == null) continue;

            oldLoc.getWorld().spawnParticle(Particle.FLAME, oldLoc, 0);

            Location loc = rPlayer.getPlayer().getLocation();
            World world = loc.getWorld();
            if (world == null) continue;
            world.spawnParticle(Particle.SOUL_FIRE_FLAME, loc, 0);


        }
    }
}
