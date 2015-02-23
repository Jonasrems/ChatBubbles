package com.hxlot.Jonasrems.chat.ChatBubbles;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;

public class chatRender {
	public final static BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
	private static String red = " particle reddust ~ ~2.2 ~ 1.5 0 0 01 0";
	private static String white = " particle reddust ~ ~2.2 ~ 1.5 1.5 1.5 01 0";
	private static String blue = " particle reddust ~ ~2.2 ~ -1 -1 1.5 01 0";
	
	
	
	
	
	
	
	
	
	public static void render(final Player p, final double x, final double y, String color){
		if(color == "red"){
			color = red;
		}else if(color == "blue"){
			color = blue;
		}else{
			color = white;
		}
		
		
		
		
		Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute " + p.getName() + " ~" + x + " ~" + y + " ~" + 0 + color);
	}
}
