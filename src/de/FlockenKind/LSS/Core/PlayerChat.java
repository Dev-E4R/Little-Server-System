package de.FlockenKind.LSS.Core;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.FlockenKind.LSS.Main;

public class PlayerChat implements Listener
{	
	 public Main plugin;
	   
	   public PlayerChat(Main Instance){
	       this.plugin = Instance;
	   }
	
	@EventHandler(priority=EventPriority.HIGHEST)
	public void on(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
			if(p.hasPermission("chat.owner")) {
				e.setFormat(Main.conf82 + p.getName() + Main.conf81 + e.getMessage());
			}
			else if(p.hasPermission("chat.coowner")) {
				e.setFormat(Main.conf83 + p.getName() + Main.conf81 + e.getMessage());
			}
			else if(p.hasPermission("chat.admin")) {
				e.setFormat(Main.conf84 + p.getName() + Main.conf81 + e.getMessage());
			}
			else if(p.hasPermission("chat.developer")) {
				e.setFormat(Main.conf85 + p.getName() + Main.conf81 + e.getMessage());
			}
			else if(p.hasPermission("chat.seniormoderator")) {
				e.setFormat(Main.conf86 + p.getName() + Main.conf81 + e.getMessage());
			}
			else if(p.hasPermission("chat.moderator")) {
				e.setFormat(Main.conf87 + p.getName() + Main.conf81 + e.getMessage());
			}
			else if(p.hasPermission("chat.supporter")) {
				e.setFormat(Main.conf88 + p.getName() + Main.conf81 + e.getMessage());
			}
			else if(p.hasPermission("chat.seniorbuilder")) {
				e.setFormat(Main.conf89 + p.getName() + Main.conf81 + e.getMessage());
			}
			else if(p.hasPermission("chat.builder")) {
				e.setFormat(Main.conf90 + p.getName() + Main.conf81 + e.getMessage());
			}
			else if(p.hasPermission("chat.designer")) {
				e.setFormat(Main.conf91 + p.getName() + Main.conf81 + e.getMessage());
			}
			else if(p.hasPermission("chat.vip")) {
				e.setFormat(Main.conf92 + p.getName() + Main.conf81 + e.getMessage());
			}
			else if(p.hasPermission("chat.premiumplus")) {
				e.setFormat(Main.conf93 + p.getName() + Main.conf81 + e.getMessage());
			}
			else if(p.hasPermission("chat.premium")) {
				e.setFormat(Main.conf94 + p.getName() + Main.conf81 + e.getMessage());
			}
			else 
				e.setFormat(Main.conf95 + p.getName() + Main.conf81 + e.getMessage());
		}
}
