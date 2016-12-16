package de.FlockenKind.LSS.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import de.FlockenKind.LSS.Main;
import net.md_5.bungee.api.ChatColor;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class LeaveListener implements Listener{
	
	public void onLeave(PlayerQuitEvent e) {
		 Player p = (Player) e.getPlayer();
		 
		 String suffix = "§7";
			PermissionUser user = PermissionsEx.getPermissionManager().getUser(p);
			if(user != null) {
				suffix = ChatColor.translateAlternateColorCodes('&', user.getSuffix());
		}
		 
		 e.setQuitMessage(Main.conf24 + " " + suffix + p.getName() + " " + Main.conf26);
	}
	
}
