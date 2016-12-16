package de.FlockenKind.LSS.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.FlockenKind.LSS.Main;
import net.md_5.bungee.api.ChatColor;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class JoinListener implements Listener{
	
	public void onJoin(PlayerJoinEvent e) {
		 Player p = (Player) e.getPlayer();
		 
		 String suffix = "§7";
			PermissionUser user = PermissionsEx.getPermissionManager().getUser(p);
			if(user != null) {
				suffix = ChatColor.translateAlternateColorCodes('&', user.getSuffix());
		}
		 
		 e.setJoinMessage(Main.conf23 + " " + suffix + p.getName() + " " + Main.conf25);
	}
	
}
