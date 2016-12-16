package de.FlockenKind.LSS.Core;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class PermissionsConfig {
	
	public void setStandard(){
		FileConfiguration cfg = getFileConfiguration();
		
		cfg.options().copyDefaults(true);
		
		cfg.addDefault("Tp", "system.tp");
		cfg.addDefault("Tphere", "system.tphere");
		cfg.addDefault("Setspawn", "system.setspawn");
		
		try{
			cfg.save(getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private File getFile(){
		return new File("plugins/Little-Server-System", "Permissions.yml");
	}

	private FileConfiguration getFileConfiguration(){
		return YamlConfiguration.loadConfiguration(getFile());
	}
	
	public void readData(){
		FileConfiguration cfg = getFileConfiguration();
		
		cfg.getString("Tp");
		cfg.getString("Tphere");
		cfg.getString("Setspawn");
	}
}
