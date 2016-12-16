package de.FlockenKind.LSS.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.FlockenKind.LSS.Main;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class tphereCommand implements CommandExecutor
{
  @SuppressWarnings("unused")
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
	
    if ((!(sender instanceof Player)) || 
      (!p.hasPermission("system.tphere")))
    {
        sender.sendMessage(Main.pr + Main.conf1);
    }
    else if (args.length == 1)
    {
      String Name = args[0];
      if (Bukkit.getPlayer(Name) != null)
      {
        Player target = Bukkit.getPlayer(Name);
        
        String prefix = "§7Spieler";
        PermissionUser user = PermissionsEx.getPermissionManager().getUser(target);
    	if(user != null) {
    		prefix = ChatColor.translateAlternateColorCodes('&', user.getPrefix());
    	}
    	   
        String suffix = "§7";
        PermissionUser user2 = PermissionsEx.getPermissionManager().getUser(target);
    	if(user2 != null) {
    		suffix = ChatColor.translateAlternateColorCodes('&', user2.getSuffix());
    	}
    	
        target.teleport(p);
        sender.sendMessage(Main.pr + Main.conf4 + " " + suffix + target.getName() + " " + Main.conf5);
        return true;
      }
      sender.sendMessage(Main.pr + Main.conf6);
    }
    else
    {
        sender.sendMessage(Main.pr + Main.conf7 + " " + Main.conf9);
      return false;
    }
    return false;
  }
}
