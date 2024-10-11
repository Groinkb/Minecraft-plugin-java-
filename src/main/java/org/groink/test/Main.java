package org.groink.test;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Wooho my plugin has started ¨¨");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
