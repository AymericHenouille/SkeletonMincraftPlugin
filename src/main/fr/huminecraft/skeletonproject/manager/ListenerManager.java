package fr.huminecraft.skeletonproject.manager;

import fr.huminecraft.skeletonproject.listener.PlayerJoinListener;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ListenerManager {

    private JavaPlugin plugin;

    public ListenerManager(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void registerListener() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PlayerJoinListener(), plugin);
    }
}

