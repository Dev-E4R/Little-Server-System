package de.FlockenKind.LSS;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.FlockenKind.LSS.Commands.CCCommand;
import de.FlockenKind.LSS.Commands.FlyCommand;
import de.FlockenKind.LSS.Commands.GameModeCommand;
import de.FlockenKind.LSS.Commands.HealCommand;
import de.FlockenKind.LSS.Commands.LittleServerSystem;
import de.FlockenKind.LSS.Commands.SetspawnCommand;
import de.FlockenKind.LSS.Commands.SpawnCommand;
import de.FlockenKind.LSS.Commands.tpCommand;
import de.FlockenKind.LSS.Commands.tphereCommand;
import de.FlockenKind.LSS.Core.PlayerChat;
import de.FlockenKind.LSS.Listener.JoinListener;
import de.FlockenKind.LSS.Listener.LeaveListener;
import de.FlockenKind.LSS.Listener.Listeners;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Main extends JavaPlugin{

	public static Main plugin;
	public static Main conf;
	public static String pr;
	public static String conf1;
	public static String conf2;
	public static String conf3;
	public static String conf4;
	public static String conf5;
	public static String conf6;
	public static String conf7;
	public static String conf8;
	public static String conf9;
	public static String conf10;
	public static String conf11;
	public static String conf12;
	public static String conf13;
	public static String conf14;
	public static String conf15;
	public static String conf16;
	public static String conf17;
	public static String conf18;
	public static String conf19;
	public static String conf20;
	public static String conf21;
	public static String conf22;
	public static String conf23;
	public static String conf24;
	public static String conf25;
	public static String conf26;
	public static String conf27;
	public static String conf28;
	public static String conf29;
	public static String conf30;
	public static String conf31;
	public static String conf32;
	public static String conf33;
	public static String conf34;
	public static String conf35;
	public static String conf36;
	public static String conf37;
	public static String conf38;
	public static String conf39;
	public static String conf40;
	public static String conf41;
	public static String conf42;
	public static String conf43;
	public static String conf44;
	public static String conf45;
	public static String conf46;
	public static String conf47;
	public static String conf48;
	public static String conf49;
	public static String conf50;
	public static String conf51;
	public static String conf52;
	public static String conf53;
	public static String conf54;
	public static String conf55;
	public static String conf56;
	public static String conf57;
	public static String conf58;
	public static String conf59;
	public static String conf60;
	public static String conf61;
	public static String conf62;
	public static String conf63;
	public static String conf64;
	public static String conf65;
	public static String conf66;
	public static String conf67;
	public static String conf68;
	public static String conf69;
	public static String conf70;
	public static String conf71;
	public static String conf72;
	public static String conf73;
	public static String conf74;
	public static String conf75;
	public static String conf76;
	public static String conf77;
	public static String conf78;
	public static String conf79;
	public static String conf80;
	public static String conf81;
	public static String conf82;
	public static String conf83;
	public static String conf84;
	public static String conf85;
	public static String conf86;
	public static String conf87;
	public static String conf88;
	public static String conf89;
	public static String conf90;
	public static String conf91;
	public static String conf92;
	public static String conf93;
	public static String conf94;
	public static String conf95;
	public static String conf96;
	public static String cmd1;
	public static String cmd2;
	public static String cmd3;
	public static String cmd4;
	 
	FileConfiguration config;
	File cfile;
	
	@SuppressWarnings("unused")
	public void onEnable(){
		/*loadMySQL();
		
		mysql.update("CREATE TABLE IF NOT EXISTS Stats(Name VARCHAR(64), Kills int, Deaths int);");*/
		 
		File file = new File("plugins/Little-Server-System", "config.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
		
		registerEvents();

		plugin = this;	
	    conf = this;
	    loadConfig();
	}

	/*private void loadMySQL() {
		MySQLFile file = new MySQLFile();
		file.setStandard();
		file.readData();
		MySQL.connect();
	}*/

	public void onDisable(){
	}
	
	private void loadConfig() {
		
	    
		conf.getConfig().options().copyHeader(true);
	    conf.getConfig().options().copyHeader();
	    conf.getConfig().options().copyDefaults(true);
		
	    conf.getConfig().addDefault("Prefix", "&cYour &lPrefix &8❘ &7");
	    conf.getConfig().addDefault("JoinPrefix", "&8[&a&l+&8]");
	    conf.getConfig().addDefault("LeavePrefix", "&8[&c&l-&8]");
	    conf.getConfig().addDefault("NeededPermission", "&7You do not have these Permissions!");
	    conf.getConfig().addDefault("JoinMessage", "&7has &ajoined &7the Server!");
	    conf.getConfig().addDefault("LeaveMessage", "&7has &cdisconnected &7the Server!");
	    conf.getConfig().addDefault("Minute", "Minute");
	    conf.getConfig().addDefault("Minutes", "Minutes");
	    conf.getConfig().addDefault("Second", "Second");
	    conf.getConfig().addDefault("Seconds", "Sekonds");
	    
	    conf.getConfig().addDefault("TeleportMessagebeforethename", "&7Message before the Name");
	    conf.getConfig().addDefault("TeleportMessageafterthename", "&7Message after the Name");
	    conf.getConfig().addDefault("TeleporthereMessagebeforethename", "&7TphereMessage before the Name");
	    conf.getConfig().addDefault("TeleporthereMessageafterthename", "&7TphereMessage after the Name");
	    conf.getConfig().addDefault("UnknownPlayer", "&7The Player UUID is &cunknown&7!");
	    conf.getConfig().addDefault("UnknownCommand", "&7Please Use");
	    conf.getConfig().addDefault("Selfheal", "&7You have been healed &cyourself&7!");
	    conf.getConfig().addDefault("HealMessagebeforethename", "&7Healmessage before the Name");
	    conf.getConfig().addDefault("HealMessageafterthename", "&7Healmessage after the Name");
	    conf.getConfig().addDefault("HealedMessagebeforethename", "&7Healedmessage before the Name");
	    conf.getConfig().addDefault("HealedMessageafterthename", "&7Healedmessage after the Name");
	    conf.getConfig().addDefault("SpawnNotExist", "&7The spawn &cdoes not &7exist!");
	    conf.getConfig().addDefault("SpawnWasSet", "&7You have &aset &7the spawn point&7!");
	    conf.getConfig().addDefault("FlyActivate", "&7Flight mode &7is now &aactivated&7!");
	    conf.getConfig().addDefault("FlyDeactivate", "&7Flight mode &7is now &cdectivated&7!");
	    conf.getConfig().addDefault("ChatClear", "&7has &ccleared &7the chat!");
	    conf.getConfig().addDefault("Youneedtowaitbeforethecountdown", "&7You need to wait &c");
	    conf.getConfig().addDefault("Youneedtowaitbetweenthecountdown", "&7and &c");
	    conf.getConfig().addDefault("Youneedtowaitafterthecountdown", "&7to perform this Command!");
	    conf.getConfig().addDefault("ChangeGameMode", "&7Change your Gamemode with");
	    conf.getConfig().addDefault("GameModeChange", "&7Your Gamemode changed to");
	    conf.getConfig().addDefault("SurvivalGamemode", "&aSurvival");
	    conf.getConfig().addDefault("CreativeGamemode", "&cCreative");
	    conf.getConfig().addDefault("AdventureGamemode", "&eAdventure");
	    conf.getConfig().addDefault("SpectatorGamemode", "&4Spectator");
	    conf.getConfig().addDefault("UnknownGamemode", "&7The Gamemode is &cunknown&7!");
	    
	    conf.getConfig().addDefault("TP-Command", "&e/tp <Player>");
	    conf.getConfig().addDefault("TPHere-Command", "&e/tphere <Player>");
	    conf.getConfig().addDefault("Heal-Command", "&e/heal &7or &e/heal <Player>");
	    conf.getConfig().addDefault("Spawn-Command", "&e/spawn");
	    conf.getConfig().addDefault("SetSpawn-Command", "&e/setspawn");
	    conf.getConfig().addDefault("Fly-Command", "&e/fly");
	    conf.getConfig().addDefault("ChatClear-Command", "&e/cc");
	    conf.getConfig().addDefault("GameMode-Command", "&e/gm");
	    
	    conf.getConfig().addDefault("Scoreboard-Title", "&e&lYOUR SERVER");
	    conf.getConfig().addDefault("LINE1", "&aLINE 1");
	    conf.getConfig().addDefault("LINE2", "&bLINE 2");
	    conf.getConfig().addDefault("LINE3", "&cLINE 3");
	    conf.getConfig().addDefault("LINE4", "&dLINE 4");
	    conf.getConfig().addDefault("LINE5", "&eLINE 5");
	    conf.getConfig().addDefault("LINE6", "&fLINE 6");
	    conf.getConfig().addDefault("LINE7", "&1LINE 7");
	    conf.getConfig().addDefault("LINE8", "&2LINE 8");
	    conf.getConfig().addDefault("LINE9", "&3LINE 9");
	    
	    conf.getConfig().addDefault("Chatformat-Owner", "&8[&4Owner&8] &4");
	    conf.getConfig().addDefault("Chatformat-CoOwner", "&8[&4Co-Owner&8] &4");
	    conf.getConfig().addDefault("Chatformat-Admin", "&8[&4Admin&8] &4");
	    conf.getConfig().addDefault("Chatformat-Developer", "&8[&bDeveloper&8] &b");
	    conf.getConfig().addDefault("Chatformat-SeniorModerator", "&8[&cSr.Moderator&8] &c");
	    conf.getConfig().addDefault("Chatformat-Moderator", "&8[&cModerator&8] &c");
	    conf.getConfig().addDefault("Chatformat-Supporter", "&8[&9Supporter&8] &9");
	    conf.getConfig().addDefault("Chatformat-SeniorBuilder", "&8[&eSr.Builder&8] &a");
	    conf.getConfig().addDefault("Chatformat-Builder", "&8[&aBuilder&8] &a");
	    conf.getConfig().addDefault("Chatformat-Designer", "&8[&dDesigner&8] &d");
	    conf.getConfig().addDefault("Chatformat-VIP", "&8[&5BIP&8] &5");
	    conf.getConfig().addDefault("Chatformat-PremiumPlus", "&8[&6PremiumPlus&8] &6");
	    conf.getConfig().addDefault("Chatformat-Premium", "&8[&6Premium&8] &6");
	    conf.getConfig().addDefault("Chatformat-Player", "&8[&ePlayer&8] &e");
	    conf.getConfig().addDefault("Chatformat-Messageoutput", " &8> &7");
	    
	    
	    conf.getConfig().addDefault("TAB-HeadName-Owner", "&4");
	    conf.getConfig().addDefault("TAB-Name-Owner", "&4");
	    
	    conf.getConfig().addDefault("TAB-HeadName-CoOwner", "&4");
	    conf.getConfig().addDefault("TAB-Name-CoOwner", "&4");
	    
	    conf.getConfig().addDefault("TAB-HeadName-Admin", "&c");
	    conf.getConfig().addDefault("TAB-Name-Admin", "&c");
	    
	    conf.getConfig().addDefault("TAB-HeadName-Developer", "&b");
	    conf.getConfig().addDefault("TAB-Name-Developer", "&b");
	    
	    conf.getConfig().addDefault("TAB-HeadName-SeniorModerator", "&c");
	    conf.getConfig().addDefault("TAB-Name-SeniorModerator", "&c");
	    
	    conf.getConfig().addDefault("TAB-HeadName-Moderator", "&c");
	    conf.getConfig().addDefault("TAB-Name-Moderator", "&c");
	    
	    conf.getConfig().addDefault("TAB-HeadName-Supporter", "&9");
	    conf.getConfig().addDefault("TAB-Name-Supporter", "&9");
	    
	    conf.getConfig().addDefault("TAB-HeadName-SeniorBuilder", "&a");
	    conf.getConfig().addDefault("TAB-Name-SeniorBuilder", "&a");
	    
	    conf.getConfig().addDefault("TAB-HeadName-Builder", "&a");
	    conf.getConfig().addDefault("TAB-Name-Builder", "&a");
	    
	    conf.getConfig().addDefault("TAB-HeadName-Designer", "&d");
	    conf.getConfig().addDefault("TAB-Name-Designer", "&d");
	    
	    conf.getConfig().addDefault("TAB-HeadName-VIP", "&5");
	    conf.getConfig().addDefault("TAB-Name-VIP", "&5");
	    
	    conf.getConfig().addDefault("TAB-HeadName-PremiumPlus", "&6");
	    conf.getConfig().addDefault("TAB-Name-PremiumPlus", "&6");
	    
	    conf.getConfig().addDefault("TAB-HeadName-Premium", "&6");
	    conf.getConfig().addDefault("TAB-Name-Premium", "&6");
	    
	    conf.getConfig().addDefault("TAB-HeadName-Player", "&e");
	    conf.getConfig().addDefault("TAB-Name-Player", "&e");
	    
	    
	    pr = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Prefix"));
	    conf1 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("NeededPermission"));
	    conf2 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("TeleportMessagebeforethename"));
	    conf3 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("TeleportMessageafterthename"));
	    conf4 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("TeleporthereMessagebeforethename"));
	    conf5 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("TeleporthereMessageafterthename"));
	    conf6 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("UnknownPlayer"));
	    conf7 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("UnknownCommand"));
	    conf8 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("TP-Command"));
	    conf9 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("TPHere-Command"));
	    conf10 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Selfheal"));
	    conf11 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("HealMessagebeforethename"));
	    conf12 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("HealMessageafterthename"));
	    conf13 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("HealedMessagebeforethename"));
	    conf14 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("HealedMessageafterthename"));
	    conf15 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("SpawnNotExist"));
	    conf16 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("SpawnWasSet"));
	    conf17 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Heal-Command"));
	    conf18 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Spawn-Command"));
	    conf19 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("SetSpawn-Command"));
	    conf20 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("FlyActivate"));
	    conf21 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("FlyDeactivate"));
	    conf22 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Fly-Command"));
	    conf23 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("JoinPrefix"));
	    conf24 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("LeavePrefix"));
	    conf25 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("JoinMessage"));
	    conf26 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("LeaveMessage"));
	    conf27 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("ChatClear"));
	    conf28 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Youneedtowaitbeforethecountdown"));
	    conf29 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Youneedtowaitafterthecountdown"));
	    conf30 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("ChatClear-Command"));
	    conf31 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Minute"));
	    conf32 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Minutes"));
	    conf33 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Second"));
	    conf34 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Seconds"));
	    conf34 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Youneedtowaitbetweenthecountdown"));
	    conf35 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("ChangeGameMode"));
	    conf36 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("GameMode-Command"));
	    conf37 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("GameModeChange"));
	    conf38 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("SurvivalGamemode"));
	    conf39 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("CreativeGamemode"));
	    conf40 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("AdventureGamemode"));
	    conf41 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("SpectatorGamemode"));
	    conf42 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("UnknownGamemode"));
	    conf43 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Scoreboard-Title"));
	    conf44 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("LINE1"));
	    conf45 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("LINE2"));
	    conf46 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("LINE3"));
	    conf47 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("LINE4"));
	    conf48 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("LINE5"));
	    conf49 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("LINE6"));
	    conf50 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("LINE7"));
	    conf51 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("LINE8"));
	    conf52 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("LINE9"));
	    conf53 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-HeadName-Owner"));
	    conf54 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-Name-Owner"));
	    conf55 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-HeadName-CoOwner"));
	    conf56 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-Name-CoOwner"));
	    conf57 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-HeadName-Admin"));
	    conf58 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-Name-Admin"));
	    conf59 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-HeadName-Developer"));
	    conf60 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-Name-Developer"));
	    conf61 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-HeadName-SeniorModerator"));
	    conf62 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-Name-SeniorModerator"));
	    conf63 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-HeadName-Moderator"));
	    conf64 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-Name-Moderator"));
	    conf65 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-HeadName-Supporter"));
	    conf66 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-Name-Supporter"));
	    conf67 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-HeadName-SeniorBuilder"));
	    conf68 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-Name-SeniorBuilder"));
	    conf69 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-HeadName-Builder"));
	    conf70 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-Name-Builder"));
	    conf71 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-HeadName-Designer"));
	    conf72 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-Name-Designer"));
	    conf73 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-HeadName-VIP"));
	    conf74 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-Name-VIP"));
	    conf75 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-HeadName-Premiumplus"));
	    conf76 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-Name-Premiumplus"));
	    conf77 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-HeadName-Premium"));
	    conf78 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-Name-Premium"));
	    conf79 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-HeadName-Player"));
	    conf80 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Tab-Name-Player"));
	    conf81 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-Messageoutput"));
	    conf82 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-Owner"));
	    conf83 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-CoOwner"));
	    conf84 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-Admin"));
	    conf85 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-Developer"));
	    conf86 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-SeniorModerator"));
	    conf87 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-Moderator"));
	    conf88 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-Supporter"));
	    conf89 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-SeniorBuilder"));
	    conf90 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-Builder"));
	    conf91 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-Designer"));
	    conf92 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-VIP"));
	    conf93 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-PremiumPlus"));
	    conf94 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-Premium"));
	    conf95 = ChatColor.translateAlternateColorCodes('&', getConfig().getString("Chatformat-Player"));
	    
	    conf.saveDefaultConfig();

		
		//
	    
	    String prefix = "§7Spieler";
		PermissionUser user = PermissionsEx.getPermissionManager().getUser(Bukkit.getPlayer(getName()));
		if(user != null) {
			prefix = ChatColor.translateAlternateColorCodes('&', user.getPrefix());
		}
		
		String msg = conf.getConfig().getString("LINE1");
		String msg2 = conf.getConfig().getString("LINE2");
		String msg3 = conf.getConfig().getString("LINE3");
		String msg4 = conf.getConfig().getString("LINE4");
		String msg5 = conf.getConfig().getString("LINE5");
		String msg6 = conf.getConfig().getString("LINE6");
		String msg7 = conf.getConfig().getString("LINE7");
		String msg8 = conf.getConfig().getString("LINE8");
		String msg9 = conf.getConfig().getString("LINE9");
		
		msg = msg.replace("%rank%", prefix);
		msg2 = msg.replace("%rank%", prefix);
		msg3 = msg.replace("%rank%", prefix);
		msg4 = msg.replace("%rank%", prefix);
		msg5 = msg.replace("%rank%", prefix);
		msg6 = msg.replace("%rank%", prefix);
		msg7 = msg.replace("%rank%", prefix);
		msg8 = msg.replace("%rank%", prefix);
		msg9 = msg.replace("%rank%", prefix);
		
		//
	}
	
	public void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();

	    pm.registerEvents(new JoinListener(), this);
	    pm.registerEvents(new LeaveListener(), this);
	    pm.registerEvents(new Listeners(this), this);
	    pm.registerEvents(new PlayerChat(this), this);
		
		getCommand("tp").setExecutor(new tpCommand());
		getCommand("tphere").setExecutor(new tphereCommand());
		getCommand("heal").setExecutor(new HealCommand(this));
		getCommand("spawn").setExecutor(new SpawnCommand(this));
		getCommand("setspawn").setExecutor(new SetspawnCommand());
		getCommand("lss").setExecutor(new LittleServerSystem(this));
		getCommand("fly").setExecutor(new FlyCommand());
		getCommand("cc").setExecutor(new CCCommand());
		getCommand("gm").setExecutor(new GameModeCommand());
	}
}
