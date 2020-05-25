package fr.huminecraft.skeletonproject;

import fr.huminecraft.skeletonproject.manager.ListenerManager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;

import java.io.File;

public class SkeletonProject extends JavaPlugin {

    public static final String PLUGIN_NAME = "SkeletonProject";
	
	public SkeletonProject() { super(); }
    protected SkeletonProject(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) { super(loader, description, dataFolder, file); }

    @Override
    public void onEnable() {
        super.onEnable();
		
		ListenerManager listenerManager = new ListenerManager(this);
        listenerManager.registerListener();
		
        Bukkit.getLogger().info(PLUGIN_NAME + "is loaded !");
    }

    @Override
    public void onDisable() {
        super.onDisable();
        Bukkit.getLogger().info(PLUGIN_NAME + "is unloaded !");
    }

}

