package me.hammale.RedFire;


import me.hammale.RedFire.RedFireBlockListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Logger;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.config.Configuration;

public class RedFire extends JavaPlugin
{
	int shot = 0;
	Random rand = new Random();
	double speed = 1.5d;
	double angle = 3.0d;
	int time = 35;
	int item = 259;
	int radius;
  HashMap<String, Integer> cr = new HashMap();
  ArrayList<String> dw = new ArrayList();

  public boolean UsePermissions;
  boolean oldstyle;
  Logger log = Logger.getLogger("Minecraft");
  

  private final RedFireBlockListener blockListener = new RedFireBlockListener(this);
  private final RedFireEntityListener entityListener = new RedFireEntityListener(this);
  
  public void onEnable()
  {
	    PluginManager pm = getServer().getPluginManager();
	    pm.registerEvent(Event.Type.REDSTONE_CHANGE, this.blockListener, Event.Priority.Normal, this);
	    pm.registerEvent(Event.Type.BLOCK_PLACE, this.blockListener, Event.Priority.Normal, this);
	    pm.registerEvent(Event.Type.ENTITY_EXPLODE, this.entityListener, Event.Priority.Normal, this);
		System.out.println("REDFIRE is enabled!");
  }


public void onDisable() {
	System.out.println("REDFIRE disabled!!");
}}