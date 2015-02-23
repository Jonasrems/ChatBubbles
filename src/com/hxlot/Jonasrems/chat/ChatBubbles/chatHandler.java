package com.hxlot.Jonasrems.chat.ChatBubbles;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitScheduler;

public class chatHandler {
	public final static BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
	private static int chatTime = 0;
	private static String color = "white";
	
	public static void handle(Player p, AsyncPlayerChatEvent e){
		String m = e.getMessage();
		
		int l = m.length();
		
		if(m.contains("§4")){
			color = "red";
		}else if(m.contains("§1")){
			color = "blue";
		}else{
			color = "white";
		}
		
		Char(p, m.charAt(0), 0, l);
		Char(p, m.charAt(1), 1.2, l);
		Char(p, m.charAt(2), 1.2*2, l);
		Char(p, m.charAt(3), 1.2*3, l);
		Char(p, m.charAt(4), 1.2*4, l);
		Char(p, m.charAt(5), 1.2*5, l);
		Char(p, m.charAt(6), 1.2*6, l);
		Char(p, m.charAt(7), 1.2*7, l);
		Char(p, m.charAt(8), 1.2*8, l);
		Char(p, m.charAt(9), 1.2*9, l);
		Char(p, m.charAt(10), 1.2*10, l);
		Char(p, m.charAt(11), 1.2*11, l);
		Char(p, m.charAt(12), 1.2*12, l);
		Char(p, m.charAt(13), 1.2*13, l);
		Char(p, m.charAt(14), 1.2*14, l);
		Char(p, m.charAt(15), 1.2*15, l);
		Char(p, m.charAt(16), 1.2*16, l);
		Char(p, m.charAt(17), 1.2*17, l);
		Char(p, m.charAt(18), 1.2*18, l);
		
		
		
		
		
		int me = m.charAt(0);
		p.sendMessage("Char: " + me);
	}
	
	
	
	
	
	
	
	
	
	public static void Char(Player p, int Char, double pos, int l){
		if(Char == 97){
			//a
			
			charAssembly(p,1,0,pos,l);
			charAssembly(p,2,0,pos,l);
			charAssembly(p,3,0,pos,l);
			charAssembly(p,4,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,1,2,pos,l);
			charAssembly(p,2,2,pos,l);
			charAssembly(p,3,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,1,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,3,4,pos,l);
		}
		if(Char == 98){
			//b
			
			charAssembly(p,0,0,pos,l);
			charAssembly(p,1,0,pos,l);
			charAssembly(p,2,0,pos,l);
			charAssembly(p,3,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,1,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,3,4,pos,l);
			charAssembly(p,0,5,pos,l);
			charAssembly(p,0,6,pos,l);
		}
		if(Char == 99){
			//c
			
			charAssembly(p,1,0,pos,l);
			charAssembly(p,2,0,pos,l);
			charAssembly(p,3,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,1,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,3,4,pos,l);
		}
		if(Char == 100){
			//d
			
			charAssembly(p,1,0,pos,l);
			charAssembly(p,2,0,pos,l);
			charAssembly(p,3,0,pos,l);
			charAssembly(p,4,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,3,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,1,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,4,4,pos,l);
			charAssembly(p,4,5,pos,l);
			charAssembly(p,4,6,pos,l);
		}
		if(Char == 101){
			//e
			
			charAssembly(p,1,0,pos,l);
			charAssembly(p,2,0,pos,l);
			charAssembly(p,3,0,pos,l);
			charAssembly(p,4,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,1,2,pos,l);
			charAssembly(p,2,2,pos,l);
			charAssembly(p,3,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,1,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,3,4,pos,l);
		}
		if(Char == 102){
			//f
			
			charAssembly(p,1,0,pos,l);
			charAssembly(p,1,1,pos,l);
			charAssembly(p,1,2,pos,l);
			charAssembly(p,1,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,1,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,3,4,pos,l);
			charAssembly(p,1,5,pos,l);
			charAssembly(p,2,6,pos,l);
			charAssembly(p,3,6,pos,l);
		}
		if(Char == 103){
			//g
			
			charAssembly(p,0,-1,pos,l);
			charAssembly(p,1,-1,pos,l);
			charAssembly(p,2,-1,pos,l);
			charAssembly(p,3,-1,pos,l);
			charAssembly(p,4,0,pos,l);
			charAssembly(p,1,1,pos,l);
			charAssembly(p,2,1,pos,l);
			charAssembly(p,3,1,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,1,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,3,4,pos,l);
			charAssembly(p,4,4,pos,l);
		}
		if(Char == 104){
			//h
			
			charAssembly(p,0,0,pos,l);
			charAssembly(p,4,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,1,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,3,4,pos,l);
			charAssembly(p,0,5,pos,l);
			charAssembly(p,0,6,pos,l);
		}
		if(Char == 105){
			//i
			
			charAssembly(p,0,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,0,6,pos,l);
		}
		if(Char == 106){
			//j
			
			charAssembly(p,1,-1,pos,l);
			charAssembly(p,2,-1,pos,l);
			charAssembly(p,3,-1,pos,l);
			charAssembly(p,0,0,pos,l);
			charAssembly(p,4,0,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,4,4,pos,l);
			charAssembly(p,4,6,pos,l);
		}
		if(Char == 107){
			//k
			
			charAssembly(p,0,0,pos,l);
			charAssembly(p,3,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,2,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,1,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,2,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,3,4,pos,l);
			charAssembly(p,0,5,pos,l);
			charAssembly(p,0,6,pos,l);
		}
		if(Char == 108){
			//l
			
			charAssembly(p,1,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,0,5,pos,l);
			charAssembly(p,0,6,pos,l);
		}
		if(Char == 109){
			//m
			
			charAssembly(p,0,0,pos,l);
			charAssembly(p,4,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,2,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,2,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,1,4,pos,l);
			charAssembly(p,3,4,pos,l);
		}
		if(Char == 110){
			//n
			
			charAssembly(p,0,0,pos,l);
			charAssembly(p,4,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,1,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,3,4,pos,l);
		}
		if(Char == 111){
			//o
			
			charAssembly(p,1,0,pos,l);
			charAssembly(p,2,0,pos,l);
			charAssembly(p,3,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,1,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,3,4,pos,l);
		}
		if(Char == 112){
			//p
			
			charAssembly(p,0,-1,pos,l);
			charAssembly(p,0,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,1,1,pos,l);
			charAssembly(p,2,1,pos,l);
			charAssembly(p,3,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,1,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,3,4,pos,l);
		}
		if(Char == 113){
			//q
			
			charAssembly(p,4,-1,pos,l);
			charAssembly(p,4,0,pos,l);
			charAssembly(p,1,1,pos,l);
			charAssembly(p,2,1,pos,l);
			charAssembly(p,3,1,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,3,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,1,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,4,4,pos,l);
		}
		if(Char == 114){
			//r
			
			charAssembly(p,0,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,1,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,3,4,pos,l);
		}
		if(Char == 115){
			//s
			
			charAssembly(p,0,0,pos,l);
			charAssembly(p,1,0,pos,l);
			charAssembly(p,2,0,pos,l);
			charAssembly(p,3,0,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,1,2,pos,l);
			charAssembly(p,2,2,pos,l);
			charAssembly(p,3,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,1,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,3,4,pos,l);
			charAssembly(p,4,4,pos,l);
		}
		if(Char == 116){
			//t
			
			charAssembly(p,2,0,pos,l);
			charAssembly(p,1,1,pos,l);
			charAssembly(p,1,2,pos,l);
			charAssembly(p,1,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,1,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,1,5,pos,l);
			charAssembly(p,1,6,pos,l);
		}
		if(Char == 117){
			//u
			
			charAssembly(p,1,0,pos,l);
			charAssembly(p,2,0,pos,l);
			charAssembly(p,3,0,pos,l);
			charAssembly(p,4,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,4,4,pos,l);
		}
		if(Char == 118){
			//v
			
			charAssembly(p,2,0,pos,l);
			charAssembly(p,1,1,pos,l);
			charAssembly(p,3,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,4,4,pos,l);
		}
		if(Char == 119){
			//w
			
			charAssembly(p,1,0,pos,l);
			charAssembly(p,2,0,pos,l);
			charAssembly(p,3,0,pos,l);
			charAssembly(p,4,0,pos,l);
			charAssembly(p,0,1,pos,l);
			charAssembly(p,2,1,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,4,4,pos,l);
		}
		if(Char == 120){
			//x
			
			charAssembly(p,0,0,pos,l);
			charAssembly(p,4,0,pos,l);
			charAssembly(p,1,1,pos,l);
			charAssembly(p,3,1,pos,l);
			charAssembly(p,2,2,pos,l);
			charAssembly(p,1,3,pos,l);
			charAssembly(p,3,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,4,4,pos,l);
		}
		if(Char == 121){
			//y
			
			charAssembly(p,0,-1,pos,l);
			charAssembly(p,1,-1,pos,l);
			charAssembly(p,2,-1,pos,l);
			charAssembly(p,3,-1,pos,l);
			charAssembly(p,4,0,pos,l);
			charAssembly(p,1,1,pos,l);
			charAssembly(p,2,1,pos,l);
			charAssembly(p,3,1,pos,l);
			charAssembly(p,4,1,pos,l);
			charAssembly(p,0,2,pos,l);
			charAssembly(p,4,2,pos,l);
			charAssembly(p,0,3,pos,l);
			charAssembly(p,4,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,4,4,pos,l);
		}
		if(Char == 122){
			//z
			
			charAssembly(p,0,0,pos,l);
			charAssembly(p,1,0,pos,l);
			charAssembly(p,2,0,pos,l);
			charAssembly(p,3,0,pos,l);
			charAssembly(p,4,0,pos,l);
			charAssembly(p,1,1,pos,l);
			charAssembly(p,2,2,pos,l);
			charAssembly(p,3,3,pos,l);
			charAssembly(p,0,4,pos,l);
			charAssembly(p,1,4,pos,l);
			charAssembly(p,2,4,pos,l);
			charAssembly(p,3,4,pos,l);
			charAssembly(p,4,4,pos,l);
		}
		
		
	}
	
	public static void charAssembly(final Player p, final double x, final double y, final double pos, final int l){
		final double x2 = (x/10)*2;
		final double y2 = (y/10)*2;
		
		chat.renderChat = scheduler.scheduleSyncRepeatingTask(chat.plugin, new Runnable() {
			
			public void run() {
				chatRender.render(p, x2+pos-l/2, y2, color);
				
				
				chatTime = chatTime + 1;
				
				if(chatTime >= (250 * l)*((1+l)/2)){
					scheduler.cancelAllTasks();
					chatTime = 0;
				}
			}
			
		}, 0, 1L);
	}
	
	
}
