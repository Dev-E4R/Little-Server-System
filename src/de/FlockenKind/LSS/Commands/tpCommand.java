package de.FlockenKind.LSS.Commands;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.FlockenKind.LSS.Main;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class tpCommand implements CommandExecutor
{
	
  HashMap<Player, Long> CoolDown = new HashMap<Player, Long>();
	
  @SuppressWarnings("unused")
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender; 
	   
    if ((!(sender instanceof Player)) || 
    	      (!p.hasPermission("system.tp")))
    {
      sender.sendMessage(Main.pr + Main.conf1);
    }
    else if (args.length == 1)
    {
      String Name = args[0];
      if (Bukkit.getPlayer(Name) != null)
      {
    	  if(CoolDown.containsKey(p)) {
    	       if(CoolDown.get(p) > System.currentTimeMillis()) {
    	        return true;
    	       } else {
    	        CoolDown.remove(p);
    	       }
    	      }
    	      
    	
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
    		
        p.teleport(target);
        sender.sendMessage(Main.pr + Main.conf2 + " " + suffix + target.getName() + " " + Main.conf3);
        return true;
      }
      sender.sendMessage(Main.pr + Main.conf6);
    }
    else
    {
      sender.sendMessage(Main.pr + Main.conf7 + " " + Main.conf8);
      return false;
    }
    return false;
  }
}
