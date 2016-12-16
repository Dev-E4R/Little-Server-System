package de.FlockenKind.LSS.Commands;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.FlockenKind.LSS.Main;
import net.md_5.bungee.api.ChatColor;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class CCCommand implements CommandExecutor
{

	public static HashMap<String, Long> cooldown = new HashMap<>();
	
  public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args)
  {
    if ((args.length == 0) && 
      ((sender instanceof Player)))
    {
      Player p = (Player)sender;
     
      long jetzt = System.currentTimeMillis();
		
		if(cooldown.containsKey(p.getName())){
			long be = cooldown.get(p.getName());
			
			int rest = (int) ((be + (5*1000*60)) - jetzt);
			
			if(rest > 0){
				int minute = rest/1000/60;
				rest = rest-(minute*1000*60);
				int sekunde = rest/1000;
				
				p.sendMessage(Main.pr + Main.conf28 + " " + minute + (minute == 1 ? " " + Main.conf31 : " " + Main.conf32) +  " " + Main.conf34
						+ sekunde + (sekunde == 1 ? " " + Main.conf33 : " " + Main.conf34) + " " + Main.conf29);
				return true;
			}
		}
      
      String suffix = "§7";
		PermissionUser user = PermissionsEx.getPermissionManager().getUser(p);
		if(user != null) {
			suffix = ChatColor.translateAlternateColorCodes('&', user.getSuffix());
		}
      
      if (!p.hasPermission("system.chatclear"))
      {
        p.sendMessage(Main.pr + Main.conf1);
        return true;
      }
      for (int i = 0; i < 500; i++) {
        Bukkit.broadcastMessage(" ");
      }
      Bukkit.broadcastMessage(Main.pr + suffix + p.getName() + " " + Main.conf27);
    }
    return true;
  }
}