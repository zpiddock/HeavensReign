package io.github.shadowchild.vdgame.handler;


import io.github.shadowchild.common.config.Config;
import io.github.shadowchild.common.config.Configuration;
import io.github.shadowchild.vdgame.utils.Settings;

/**
 * Created by Zach Piddock on 03/11/2015.
 */
public class ConfigurationHandler {

    private static Config conf = new Configuration(Configuration.ConfigType.INI,
            "config/General"
    ).load();

    public static void handle() {

        handleGeneral();
    }

    private static void handleGeneral() {

        Settings.lastWindowX = conf.getInteger("Window", "Last Window X Co-ords", 0, null);
        Settings.lastWindowY = conf.getInteger("Window", "Last Window Y Co-ords", 0, null);
        Settings.fullscreen = conf.getBoolean("Window", "Should Be Fullscreen?", true, null);
        Settings.vsync = conf.getBoolean("Window", "Use VSync?", true, null);
        Settings.aspectRatio = conf.getString("Window", "Aspect Ratio", "16:9",
                "Leave the backslash in or the game may crash"
        );
    }
}
