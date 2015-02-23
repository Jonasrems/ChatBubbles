package com.hxlot.Jonasrems.chat.ChatBubbles;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.fusesource.jansi.Ansi.Color;


public class chat extends JavaPlugin implements Listener
{
	public static Logger log = Bukkit.getLogger();
	public static int renderChat;
	public final static BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
	public static chat plugin;
	public static List<Player> chatBubbleList = new ArrayList<Player>();
	
	public static void out(String string){
		log.info("[Chat Bubbles] " + string);
	}
	
	
	public void onEnable()
	{
		out("Plugin enabled!");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
		plugin = this;
	}
	
	public void onDisable()
	{
		out("Plugin disabled!");
	}
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e){
		Player p = e.getPlayer();
		if(chatBubbleList.contains(p)){
			chatHandler.handle(p, e);
		}
	}

	
	
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player p = (Player)sender;
		if (commandLabel.equalsIgnoreCase("chatbubble")){
			if(p.isOp() || p.hasPermission("chatbubble.use")){
				if(chatBubbleList.contains(p) == false){
					chatBubbleList.add(p);
					p.sendMessage(ChatColor.GREEN + "You can now use chat bubbles.");
				}else{
					chatBubbleList.remove(p);
					p.sendMessage(ChatColor.RED + "You can no longer use chat bubbles.");
				}
				return true;
			}else{
				p.sendMessage(ChatColor.RED + "You do not have permission to use chat bubbles.");
			}
		}
		return false;
	}
	
	
	
}
