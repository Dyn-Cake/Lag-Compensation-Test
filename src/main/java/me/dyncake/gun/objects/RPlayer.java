package me.dyncake.gun.objects;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class RPlayer {

    List<Location> locations = new ArrayList<>();
    UUID uuid;

    public RPlayer(Player player) {
        uuid = player.getUniqueId();
    }

    public void addAndRemove(Location location) {
        locations.add(0, location);
        try {
            locations.remove(20);
        } catch (IndexOutOfBoundsException ignored) {

        }
    }

    public List<Location> getLocations() {
        return locations;
    }

    public UUID getUUID() {
        return uuid;
    }

    public Player getPlayer() {
        return Bukkit.getPlayer(uuid);
    }

    //==================================================//

    static HashMap<Player, RPlayer> map = new HashMap<>();
    static List<RPlayer> players = new ArrayList<>();

    public static HashMap<Player, RPlayer> getMap() {
        return map;
    }

    public static List<RPlayer> getPlayers() {
        return players;
    }

}
