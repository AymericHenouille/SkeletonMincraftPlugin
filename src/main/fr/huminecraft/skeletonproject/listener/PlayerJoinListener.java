package fr.huminecraft.skeletonproject.listener;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public final void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Bukkit.getLogger().info(player.getDisplayName() + " join the game !");
        player.sendMessage("Yub nub " + player.getName() + " !");
        Location spawn = new Location(Bukkit.getWorlds().get(0), 0 ,100, 0);
        player.teleport(spawn);
    }

}

