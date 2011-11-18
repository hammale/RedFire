package me.hammale.RedFire;

import java.util.ArrayList;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.util.Vector;

public class RedFireBlockListener extends BlockListener
{
  private final RedFire plugin;
  ArrayList<Block> allowedBlocks = new ArrayList<Block>();
  
  public RedFireBlockListener(RedFire plugin)
  {
    this.plugin = plugin;
  }

  public void onBlockRedstoneChange(BlockRedstoneEvent event)
  {
      // Get the block that was changed by the current
      Block checkBlock = event.getBlock();

      // Check if it's a sign
      if ((checkBlock.getType() == Material.SIGN_POST) || (checkBlock.getType() == Material.WALL_SIGN))
      {
    	  plugin.shot = 0;
          if (event.getNewCurrent() > 0)
          {
        	    Sign s = (Sign)event.getBlock().getState();
                if (("<FIREWORK>").equals(s.getLine(0))){  
                	event.getBlock();
                	TNTPrimed tnt = event.getBlock().getLocation().getWorld().spawn(
                	event.getBlock().getLocation(), TNTPrimed.class);
                	tnt.setVelocity(new Vector((plugin.rand.nextFloat() - 0.5f) / plugin.angle, plugin.speed, (plugin.rand.nextFloat() - 0.5f)
                	/ plugin.angle));
                	tnt.setFuseTicks(plugin.time);
                	plugin.shot=1;
                }
                else{
                }
          }
          else if (event.getNewCurrent() == 0)
          {
//        	  System.out.println("SIGN NOT POWERED"); 
          }
      }}}
