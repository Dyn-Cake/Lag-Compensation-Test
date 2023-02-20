package me.dyncake.gun;

import me.dyncake.gun.commands.CMDMyPing;
import me.dyncake.gun.listeners.OnJoinObjects;
import me.dyncake.gun.listeners.OnLeaveObjects;
import me.dyncake.gun.runnables.RunAddSave;
import me.dyncake.gun.runnables.RunPlaceParticle;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new OnJoinObjects(), this);
        manager.registerEvents(new OnLeaveObjects(), this);

        getCommand("myping").setExecutor(new CMDMyPing());

        BukkitTask addPos = new RunAddSave().runTaskTimer(this, 0L, 1L);
        BukkitTask placeParticle = new RunPlaceParticle().runTaskTimer(this, 0L, 1L);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
