package com.badlogic.dd.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.dd.DD;

/**
 * Created by evolerup on 3/13/16.
 */
public class DesktopLauncher {

    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "DD";
        config.width = 800;
        config.height = 480;
        new LwjglApplication(new DD(), config);
    }
}
