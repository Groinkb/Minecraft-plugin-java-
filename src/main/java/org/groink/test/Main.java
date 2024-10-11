package org.groink.test;

import com.groink.test.Events;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Events(), plugin:this);
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e){
        e.getTo()
    }
}
