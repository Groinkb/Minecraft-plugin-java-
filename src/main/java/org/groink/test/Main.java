package org.groink.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Enregistre la classe Main comme Listener pour capter les événements
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e){
        // Empêche le joueur de bouger
        e.setCancelled(true);
        // Envoie un message au joueur
        e.getPlayer().sendMessage(ChatColor.GREEN + "stopmoving petit pied");
    }

    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent e){
        // Envoie un message au joueur qui a lancé un œuf
        e.getPlayer().sendMessage(ChatColor.YELLOW + "Tu as lancé un oeuf tête de noeil");
    }
}
