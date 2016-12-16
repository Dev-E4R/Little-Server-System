package de.FlockenKind.LSS.Commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.FlockenKind.LSS.Main;

public class GameModeCommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player)sender;
		
		if(sender instanceof Player)
		{
			if(p.hasPermission("system.gamemode"))
			{
				if(args.length == 0) 
				{
					p.sendMessage(Main.pr + Main.conf35 + " " + Main.conf36 + " 0, 1, 2 or 3");
				} 
				else if (args[0].equalsIgnoreCase("0"))
				{
					if (args.length == 1)
				    {
				        p.setGameMode(GameMode.SURVIVAL);
				        p.sendMessage(Main.pr + Main.conf37 + " " + Main.conf38);
				    }
				}
				else if (args[0].equalsIgnoreCase("1"))
				{
					if (args.length == 1)
				    {
				        p.setGameMode(GameMode.CREATIVE);
				        p.sendMessage(Main.pr + Main.conf37 + " " + Main.conf39);
				    }
				}
				else if (args[0].equalsIgnoreCase("2"))
				{
					if (args.length == 1)
				    {
				        p.setGameMode(GameMode.ADVENTURE);
				        p.sendMessage(Main.pr + Main.conf37 + " " + Main.conf40);
				    }
				}
				else if (args[0].equalsIgnoreCase("3"))
				{
					if (args.length == 1)
				    {
				        p.setGameMode(GameMode.SPECTATOR);
				        p.sendMessage(Main.pr + Main.conf37 + " " + Main.conf41);
				    }
				}
				else if (args[0].equalsIgnoreCase("4"))
				{
					if (args.length == 1)
				    {
				        p.sendMessage(Main.pr + Main.conf42);
				    }
				}
				else if (args[0].equalsIgnoreCase("5"))
				{
					if (args.length == 1)
				    {
				        p.sendMessage(Main.pr + Main.conf42);
				    }
				}
				else if (args[0].equalsIgnoreCase("6"))
				{
					if (args.length == 1)
				    {
				        p.sendMessage(Main.pr + Main.conf42);
				    }
				}
				else if (args[0].equalsIgnoreCase("7"))
				{
					if (args.length == 1)
				    {
				        p.sendMessage(Main.pr + Main.conf42);
				    }
				}
				else if (args[0].equalsIgnoreCase("8"))
				{
					if (args.length == 1)
				    {
				        p.sendMessage(Main.pr + Main.conf42);
				    }
				}
				else if (args[0].equalsIgnoreCase("9"))
				{
					if (args.length == 1)
				    {
				        p.sendMessage(Main.pr + Main.conf42);
				    }
				}
				else if (args[0].equalsIgnoreCase("10"))
				{
					if (args.length == 1)
				    {
				        p.sendMessage(Main.pr + Main.conf42);
				    }
				}
			}
		}
		
		return false;
	}
}
