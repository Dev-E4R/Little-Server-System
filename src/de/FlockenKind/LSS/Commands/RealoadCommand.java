package de.FlockenKind.LSS.Commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import de.FlockenKind.LSS.Main;

public class RealoadCommand implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if ((sender instanceof Player))
    {
      if (!p.hasPermission("system.setspawn"))
      {
        sender.sendMessage(Main.pr + Main.conf1);
        return true;
      }
      File ordner = new File("plugins//Little-Server-System");
      File file = new File("plugins//Little-Server-System//locations.yml");
      if (!ordner.exists()) {
        ordner.mkdirs();
      }
      if (!file.exists()) {
        try
        {
          file.createNewFile();
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
      }
      YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
      
      Location loc = p.getLocation();
      
      String welt = loc.getWorld().getName();
      double X = loc.getX();
      double Y = loc.getY();
      double Z = loc.getZ();
      double Pitch = loc.getPitch();
      double Yaw = loc.getYaw();
      
      cfg.set("Spawn.Welt", welt);
      cfg.set("Spawn.X", Double.valueOf(X));
      cfg.set("Spawn.Y", Double.valueOf(Y));
      cfg.set("Spawn.Z", Double.valueOf(Z));
      cfg.set("Spawn.Pitch", Double.valueOf(Pitch));
      cfg.set("Spawn.Yaw", Double.valueOf(Yaw));
      try
      {
        cfg.save(file);
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
      sender.sendMessage(Main.pr + Main.conf16);
    }
    return false;
  }
}
