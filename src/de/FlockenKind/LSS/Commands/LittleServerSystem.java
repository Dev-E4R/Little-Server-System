package de.FlockenKind.LSS.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.FlockenKind.LSS.Main;

public class LittleServerSystem implements CommandExecutor{
	
	private Main plugin;
	  
	public LittleServerSystem(Main main) {
		this.plugin = main;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player)sender;
		
		if(sender instanceof Player)
		{
				if(args.length == 0) 
				{
					p.sendMessage("");
					p.sendMessage("§eLittle Server System §8§l❘ §7Plugin §cHelp");
					p.sendMessage("");
					p.sendMessage("§7Teleport §8§l➜ " + Main.conf8);
					p.sendMessage("§7Teleports to You §8§l➜ " + Main.conf9);
					p.sendMessage("§7Heal §8§l➜ " + Main.conf17);
					p.sendMessage("§7Spawn §8§l➜ " + Main.conf18);
					p.sendMessage("§7Set Spawn §8§l➜ " + Main.conf19);
					p.sendMessage("§7Fly §8§l➜ " + Main.conf22);
					p.sendMessage("§7ChatClear §8§l➜ " + Main.conf30);
					p.sendMessage("§7Gamemode §8§l➜ " + Main.conf36);
					p.sendMessage("");
					p.sendMessage("§4Permissions §8§l➜ §7/lss perms §8[§7§lONLY §4ADMIN§8]");
					p.sendMessage("");
					p.sendMessage("§7Plugin Author §8§l➜ §e" + this.plugin.getDescription().getAuthors());
					p.sendMessage("§7Plugin Version §8§l➜ §ev" + this.plugin.getDescription().getVersion());
					p.sendMessage("§7Atuhor's Webiste §8§l➜ §e" + this.plugin.getDescription().getWebsite());
					p.sendMessage("");
				}else if (args[0].equalsIgnoreCase("perms")){
				if(args.length == 1)
				{
					if(p.hasPermission("system.admin")){
						p.sendMessage("");
						p.sendMessage("§eLittle Server System §8§l❘ §7Plugin §4Permissions");
						p.sendMessage("");
						p.sendMessage("§7TP §8§l➜ §csystem.tp");
						p.sendMessage("§7TPHere §8§l➜ §csystem.tphere");
						p.sendMessage("§7Heal §8§l➜ §csystem.heal");
						p.sendMessage("§7Spawn §8§l➜ §c§oNONE");
						p.sendMessage("§7SetSpawn §8§l➜ §csystem.setspawn");
						p.sendMessage("§7Fly §8§l➜ §csystem.fly");
						p.sendMessage("§7ChatClear §8§l➜ §csystem.chatclear");
						p.sendMessage("§7Gamemode §8§l➜ §csystem.gamemode");
						p.sendMessage("");
						p.sendMessage("§7Sorted Tab §8§l➜ §7/lss perms tab");
						p.sendMessage("§7Chat §8§l➜ §7/lss perms chat");
						p.sendMessage("");
					}
				}else if (args[1].equalsIgnoreCase("tab")){
					if(args.length == 2)
					{
						if(p.hasPermission("system.admin")){
							p.sendMessage("");
							p.sendMessage("§eLittle Server System §8§l❘ §7Tablist §4Permissions");
							p.sendMessage("");
							p.sendMessage("§7Owner §8§l➜ §ctab.owner");
							p.sendMessage("§7Co-Owner §8§l➜ §ctab.coowner");
							p.sendMessage("§7Admin §8§l➜ §ctab.admin");
							p.sendMessage("§7Developer §8§l➜ §ctab.developer");
							p.sendMessage("§7Sr.Moderator §8§l➜ §ctab.seniormoderator");
							p.sendMessage("§7Moderator §8§l➜ §ctab.moderator");
							p.sendMessage("§7Supporter §8§l➜ §ctab.supporter");
							p.sendMessage("§7Sr.Builder §8§l➜ §ctab.seniorbuilder");
							p.sendMessage("§7Builder §8§l➜ §ctab.builder");
							p.sendMessage("§7Designer §8§l➜ §ctab.designer");
							p.sendMessage("§7VIP §8§l➜ §ctab.vip");
							p.sendMessage("§7PremiumPlus §8§l➜ §ctab.premiumplus");
							p.sendMessage("§7Premium §8§l➜ §ctab.premium");
							p.sendMessage("§7Player §8§l➜ §c§oNONE");
							p.sendMessage("");
						}
					}
				}else if (args[1].equalsIgnoreCase("chat")){
					if(args.length == 2)
					{
						if(p.hasPermission("system.admin")){
							p.sendMessage("");
							p.sendMessage("§eLittle Server System §8§l❘ §7chatlist §4Permissions");
							p.sendMessage("");
							p.sendMessage("§7Owner §8§l➜ §cchat.owner");
							p.sendMessage("§7Co-Owner §8§l➜ §cchat.coowner");
							p.sendMessage("§7Admin §8§l➜ §cchat.admin");
							p.sendMessage("§7Developer §8§l➜ §cchat.developer");
							p.sendMessage("§7Sr.Moderator §8§l➜ §cchat.seniormoderator");
							p.sendMessage("§7Moderator §8§l➜ §cchat.moderator");
							p.sendMessage("§7Supporter §8§l➜ §cchat.supporter");
							p.sendMessage("§7Sr.Builder §8§l➜ §cchat.seniorbuilder");
							p.sendMessage("§7Builder §8§l➜ §cchat.builder");
							p.sendMessage("§7Designer §8§l➜ §cchat.designer");
							p.sendMessage("§7VIP §8§l➜ §cchat.vip");
							p.sendMessage("§7PremiumPlus §8§l➜ §cchat.premiumplus");
							p.sendMessage("§7Premium §8§l➜ §cchat.premium");
							p.sendMessage("§7Player §8§l➜ §c§oNONE");
							p.sendMessage("");
						}
					}
				}
			}
		}
		
		return false;
	}
	
}
