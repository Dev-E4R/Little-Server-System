	package de.FlockenKind.LSS.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.FlockenKind.LSS.Main;
import net.md_5.bungee.api.ChatColor;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

@SuppressWarnings("unused")
public class HealCommand implements CommandExecutor {
	
		private Main plugin;

		public HealCommand(Main main) {
			this.plugin = main;
		}

		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			
			 Player p = (Player)sender;
			 
			if(sender instanceof Player){
				
			if(p.hasPermission("system.heal")){
				if (args.length == 0)
				{	
					p.setHealth(20D);
					p.setFoodLevel(20);
					p.sendMessage(Main.pr + Main.conf10);
				}
				if (args.length == 1)
				{	String Name = args[0];
		      		if (Bukkit.getPlayer(Name) != null)
		      		{
		      			Player target = Bukkit.getPlayer(Name);

		      			String suffix = "§7";
		      			PermissionUser user = PermissionsEx.getPermissionManager().getUser(target);
		      			if(user != null) {
		      			suffix = ChatColor.translateAlternateColorCodes('&', user.getSuffix());
		      		}
		      		target.setHealth(20D);
		      		target.setFoodLevel(20);
					p.sendMessage(Main.pr + Main.conf13 + " " + suffix + target.getName() + " " + Main.conf14);
					target.sendMessage(Main.pr + Main.conf11 + " " + suffix + p.getName() + " " + Main.conf12);
		      		} else {
		      			p.sendMessage(Main.pr + "§7Error, please contact an §4Administrator §7 or §bDeveloper§7!");
		      		}
			}
			}else{
				sender.sendMessage(Main.pr + Main.conf1);
			}
			}else {
				sender.sendMessage(Main.pr + "§7You are not a Player");
			}
			return true;
		}
}
