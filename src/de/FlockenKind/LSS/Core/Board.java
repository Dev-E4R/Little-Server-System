package de.FlockenKind.LSS.Core;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

import de.FlockenKind.LSS.Main;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

@SuppressWarnings("unused")
public class Board
{
  public Main plugin;
  
  public Board(Main Instance)
  {
    this.plugin = Instance;
  }
  
public static void createBoard(Player p)
  {
    Scoreboard sb = Bukkit.getScoreboardManager().getNewScoreboard();
    
    Objective obj = sb.registerNewObjective("bbb", "ccc");
    obj.setDisplayName(Main.conf43);
    obj.setDisplaySlot(DisplaySlot.SIDEBAR);
    
    String prefix = "§7Spieler";
	PermissionUser user = PermissionsEx.getPermissionManager().getUser(p);
	if(user != null) {
		prefix = ChatColor.translateAlternateColorCodes('&', user.getPrefix());
	}
	
	//
	
		
	
	//
	
    //int streaks = ((Integer)Main.streak.get(p.getName())).intValue();

    Score s = obj.getScore("\u00A72");
    Score s1 = obj.getScore("\u00A74");
    Score s2 = obj.getScore("\u00A7e");
    Score s3 = obj.getScore("\u00A76");
    Score s4 = obj.getScore("\u00A77");
    Score s5 = obj.getScore("\u00A78");


    Score LINE1 = obj.getScore(Main.conf44);
    Score LINE2 = obj.getScore(Main.conf45);
    Score LINE3 = obj.getScore(Main.conf46);
    Score LINE4 = obj.getScore(Main.conf47);
    Score LINE5 = obj.getScore(Main.conf48);
    Score LINE6 = obj.getScore(Main.conf49);
    Score LINE7 = obj.getScore(Main.conf50);
    Score LINE8 = obj.getScore(Main.conf51);
    Score LINE9 = obj.getScore(Main.conf52);

    
    LINE1.setScore(8);
    LINE2.setScore(7);
    LINE3.setScore(6);
    LINE4.setScore(5);
    LINE5.setScore(4);
    LINE6.setScore(3);
    LINE7.setScore(2);
    LINE8.setScore(1);
    LINE9.setScore(0);
    
    joinTeam(sb);
    
    p.setScoreboard(sb);
  }
  
@SuppressWarnings({ "deprecation" })
static void joinTeam(Scoreboard sb)
{
  sb.registerNewTeam("14Spieler");
  sb.getTeam("14Spieler").setPrefix(Main.conf80);
  
  sb.registerNewTeam("13Premi");
  sb.getTeam("13Premi").setPrefix(Main.conf78);
  
  sb.registerNewTeam("12Premip");
  sb.getTeam("12Premip").setPrefix(Main.conf76);
  
  sb.registerNewTeam("11YouTuber");
  sb.getTeam("11YouTuber").setPrefix(Main.conf74);
  
  sb.registerNewTeam("10Designer");
  sb.getTeam("10Designer").setPrefix(Main.conf72);
  
  sb.registerNewTeam("09Builder");
  sb.getTeam("09Builder").setPrefix(Main.conf70);
  
  sb.registerNewTeam("08SrBuilder");
  sb.getTeam("08SrBuilder").setPrefix(Main.conf68);
  
  sb.registerNewTeam("07Supp");
  sb.getTeam("07Supp").setPrefix(Main.conf66);
  
  sb.registerNewTeam("06Mod");
  sb.getTeam("06Mod").setPrefix(Main.conf64);
  
  sb.registerNewTeam("05SrMod");
  sb.getTeam("05SrMod").setPrefix(Main.conf62);
  
  sb.registerNewTeam("04Dev");
  sb.getTeam("04Dev").setPrefix(Main.conf60);
  
  sb.registerNewTeam("03Admin");
  sb.getTeam("03Admin").setPrefix(Main.conf58);
  
  sb.registerNewTeam("02Leitung");
  sb.getTeam("02Leitung").setPrefix(Main.conf56);
  
  sb.registerNewTeam("01Inhaber");
  sb.getTeam("01Inhaber").setPrefix(Main.conf54);
 
  for (Player p : Bukkit.getOnlinePlayers())
  {
	  //& &8┃ &
      String team = "";
    	  if (p.hasPermission("tab.owner")) {
    	        team = "01Inhaber";
    	        p.setPlayerListName(Main.conf53 + p.getName());
    	      } else if (p.hasPermission("tab.coowner")) {
    	        team = "02Leitung";
    	        p.setPlayerListName(Main.conf55 + p.getName());
    	      } else if (p.hasPermission("tab.admin")) {
    	        team = "03Admin";
    	        p.setPlayerListName(Main.conf57 + p.getName());
    	      } else if (p.hasPermission("tab.developer")) {
    	        team = "04Dev";
    	        p.setPlayerListName(Main.conf59 + p.getName());
    	      } else if (p.hasPermission("tab.seniormoderator")) {
    	        team = "05SrMod";
    	        p.setPlayerListName(Main.conf61 + p.getName());
    	      } else if (p.hasPermission("tab.moderator")) {
    	        team = "06Mod";
    	        p.setPlayerListName(Main.conf63 + p.getName());
    	      } else if (p.hasPermission("tab.supporter")) {
    	        team = "07Supp";
    	        p.setPlayerListName(Main.conf65 + p.getName());
    	      } else if (p.hasPermission("tab.seniorbuilder")) {
    	        team = "08SrBuilder";
    	        p.setPlayerListName(Main.conf67 + p.getName());
    	      } else if (p.hasPermission("tab.builder")) {
    	        team = "09Builder";
    	        p.setPlayerListName(Main.conf69 + p.getName());
    	      } else if (p.hasPermission("tab.designer")) {
    	        team = "10Designer";
    	        p.setPlayerListName(Main.conf71 + p.getName());
    	      } else if (p.hasPermission("tab.vip")) {
    	        team = "11YouTuber";
    	        p.setPlayerListName(Main.conf73 + p.getName());
    	      } else if (p.hasPermission("tab.premiumplus")) {
    	        team = "12Premip";
    	        p.setPlayerListName(Main.conf75 + p.getName());
    	      } else if (p.hasPermission("tab.premium")) {
    	        team = "13Premi";
    	        p.setPlayerListName(Main.conf77 + p.getName());
    	      } else {
    	        team = "14Spieler";
    	        p.setPlayerListName(Main.conf79 + p.getName());
    	      }  
    if (sb == null) {
      Bukkit.broadcastMessage("");
    }
    if (team == null) {
      Bukkit.broadcastMessage("");
    }
    if (p == null) {
      Bukkit.broadcastMessage("");
    }
    if (sb.getTeam(team) == null) {
      Bukkit.broadcastMessage("");
    }
    
    sb.getTeam(team).addPlayer(p);
  }
}
  
  public static void setAllBoards()
  {
    for (Player p : Bukkit.getOnlinePlayers())
    {
      createBoard(p);
    }
  }
}
