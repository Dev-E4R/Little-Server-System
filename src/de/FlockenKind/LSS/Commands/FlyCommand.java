package de.FlockenKind.LSS.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.FlockenKind.LSS.Main;

public class FlyCommand implements CommandExecutor {
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    
    if (!p.hasPermission("system.fly"))
    {
      p.sendMessage(Main.pr + Main.conf1);
      return true;
    }
    if (p.getAllowFlight())
    {
      p.setAllowFlight(false);
      p.setFlying(false);
      
      p.sendMessage(Main.pr + Main.conf21);
    }
    else
    {
      p.setAllowFlight(true);
      
      p.sendMessage(Main.pr + Main.conf20);
    }
    return true;
  }
}
