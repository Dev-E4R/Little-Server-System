package de.FlockenKind.LSS.Commands;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.FlockenKind.LSS.Main;

public class SpawnCommand implements CommandExecutor
{
	 public Main plugin;
	 
	   public SpawnCommand(Main Instance){
	       this.plugin = Instance;
	   }
	
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    
    File file = new File("plugins//Little-Server-System//locations.yml");
    if (!file.exists())
    {
      sender.sendMessage(Main.pr + Main.conf15);
      return true;
    }
    YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
    Location loc = p.getLocation();
    Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {

    	@Override
		public void run() {
   	
			World welt = Bukkit.getWorld(cfg.getString("Spawn.Welt"));
			loc.setWorld(welt);
			loc.setX(cfg.getDouble("Spawn.X"));
			loc.setY(cfg.getDouble("Spawn.Y"));
			loc.setZ(cfg.getDouble("Spawn.Z"));
			double yaw = cfg.getDouble("Spawn.Yaw");
			double pitch = cfg.getDouble("Spawn.Pitch");
			loc.setYaw((float)yaw);
			loc.setPitch((float)pitch);
			p.teleport(loc);

		}
    }, 1L);
    return false;
  }
}