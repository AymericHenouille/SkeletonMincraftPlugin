package fr.huminecraft.testskeletonproject;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;

import fr.huminecraft.skeletonproject.SkeletonProject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestSkeletonProject {

    private ServerMock server;
    private SkeletonProject plugin;

    @Before
    public final void initServer() {
        server = MockBukkit.mock();
        plugin = MockBukkit.load(SkeletonProject.class);
    }

    @Test
    public final void testPluginName() {
        assertEquals(SkeletonProject.PLUGIN_NAME, "SkeletonProject");
    }

    @After
    public final void stopServer() {
        MockBukkit.unload();
    }


}

