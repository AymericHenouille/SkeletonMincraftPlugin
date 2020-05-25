package fr.huminecraft.testskeletonproject.listener;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import be.seeseemelk.mockbukkit.entity.PlayerMock;

import fr.huminecraft.skeletonproject.SkeletonProject;
import fr.huminecraft.skeletonproject.listener.PlayerJoinListener;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.player.PlayerJoinEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPlayerJoinListener {

    private ServerMock server;
    private SkeletonProject plugin;

    private PlayerMock player;
    private PlayerJoinEvent playerJoinEvent;
    private PlayerJoinListener playerJoinListener;

    @Before
    public final void initServer() {
        server = MockBukkit.mock();
        plugin = MockBukkit.load(SkeletonProject.class);
    }

    @Before
    public final void initListener() {
        player = server.addPlayer("Wicket");
        playerJoinEvent = new PlayerJoinEvent(player, "");
        playerJoinListener = new PlayerJoinListener();
    }

    @Test
    public final void testPlayerJoinTeleport() {
        World mainWorld = server.getWorlds().get(0);
        Location spawn = new Location(mainWorld, 0, 100, 0);
        playerJoinListener.onPlayerJoin(playerJoinEvent);
        assertEquals(player.getLocation(), player.getLocation());
    }

    @Test
    public final void testPlayerWelcomeMessage() {
        playerJoinListener.onPlayerJoin(playerJoinEvent);
        assertEquals(player.nextMessage(), "Yub nub Wicket !");
    }

    @After
    public final void stopServer() {
        MockBukkit.unload();
    }

}

