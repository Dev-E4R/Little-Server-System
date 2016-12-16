package de.FlockenKind.LSS.Listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import de.FlockenKind.LSS.Main;
import de.FlockenKind.LSS.Core.Board;
import net.md_5.bungee.api.ChatColor;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Listeners implements Listener {
	
	 public Main plugin;
	   
	   public Listeners(Main Instance){
	       this.plugin = Instance;
	   }
	
	 @SuppressWarnings("unused")
	@EventHandler
	   public void onJoin(PlayerJoinEvent e){
		   Player p = (Player) e.getPlayer();
		   
		   String suffix = "§7";
			PermissionUser user = PermissionsEx.getPermissionManager().getUser(p);
			if(user != null) {
				suffix = ChatColor.translateAlternateColorCodes('&', user.getSuffix());
			}
			for (Player player : Bukkit.getOnlinePlayers())
			{
				Board.setAllBoards();
			}
		   
	       e.setJoinMessage(Main.conf23 + " " + suffix + p.getName() + " " + Main.conf25);
		   
	   }

     @SuppressWarnings("unused")
	 @EventHandler
	   public void onQuit(PlayerQuitEvent e){
		   Player p = (Player) e.getPlayer();
	       
		String suffix = "§7";
			PermissionUser user = PermissionsEx.getPermissionManager().getUser(p);
			if(user != null) {
				suffix = ChatColor.translateAlternateColorCodes('&', user.getSuffix());
			}
	       
	       e.setQuitMessage(Main.conf24 + " " + suffix + p.getName() + " " + Main.conf26);
	       
	       Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {

				@Override
				public void run() {
					for (Player player : Bukkit.getOnlinePlayers())
					{
						Board.setAllBoards();
					}
				}
	       	
	       }, 1L);
	   }
	
}
