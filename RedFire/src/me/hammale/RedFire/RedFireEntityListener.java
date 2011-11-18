package me.hammale.RedFire;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Sign;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityListener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class RedFireEntityListener extends EntityListener {
    
    public final RedFire plugin;
	public FileConfiguration config;
	
	        public RedFireEntityListener(RedFire plugin)
	        {
	          this.plugin = plugin;
	        } 
	        
	        public void onEntityExplode(EntityExplodeEvent event){

	      	  //if(event.getEntity() instanceof TNTPrimed){
	      	  //event.setCancelled(true);
	      		  //if(plugin.shot == 1){			  
	      			  List<Block> block = event.blockList();			  
	      			  //for (Block target : block) {
	      				int ran = (int) (Math.random() * 14);
	      				  short damage = 1;
	      				if(ran == 0){
	      					  damage = 14;
	      				}
	      				if(ran == 1){
	      					  damage = 1;
	      				}
	      				if(ran == 2){
	      					  damage = 2;
	      				}
	      				if(ran == 3){
	      					  damage = 3;
	      				}
	      				if(ran == 4){
	      					  damage = 4;
	      				}
	      				if(ran == 5){
	      					  damage = 5;
	      				}
	      				if(ran == 6){
	      					  damage = 6;
	      				}
	      				if(ran == 7){
	      					  damage = 7;
	      				}
	      				if(ran == 8){
	      					  damage = 8;
	      				}
	      				if(ran == 9){
	      					  damage = 9;
	      				}
	      				if(ran == 10){
	      					  damage = 10;
	      				}
	      				if(ran == 11){
	      					  damage = 11;
	      				}
	      				if(ran == 12){
	      					  damage = 12;
	      				}
	      				if(ran == 13){
	      					  damage = 13;
	      				}			
	      					 ItemStack item1 = new ItemStack(35, 1, damage);
	      					 Location drop = event.getLocation();
	      					 Block b = drop.getBlock();
	      					 int x = 1;
	      					 while(x <= 10){
	      					Block b1 = b.getRelative(BlockFace.UP, x);
	      					//b1.setTypeId(20);
	      					Location l = b1.getLocation();
	      					b1.getWorld().dropItem(l, item1);
	      					x++;
	      					 }
	      					
	      		//}		  
	      	  //}
	      	//}	  
	        	
	        }
	        
//  public void onEntityExplode(EntityExplodeEvent e)
//  {
//	  if(e.getEntity() instanceof TNTPrimed){
//	  
//		  //if(plugin.shot == 1){			  
//			  List<Block> block = e.blockList();			  
//			  for (Block target : block) {
//				  target.setTypeId(5);
//				int ran = (int) (Math.random() * 14);
//				  short damage = 1;
//				if(ran == 0){
//					  damage = 14;
//				}
//				if(ran == 1){
//					  damage = 1;
//				}
//				if(ran == 2){
//					  damage = 2;
//				}
//				if(ran == 3){
//					  damage = 3;
//				}
//				if(ran == 4){
//					  damage = 4;
//				}
//				if(ran == 5){
//					  damage = 5;
//				}
//				if(ran == 6){
//					  damage = 6;
//				}
//				if(ran == 7){
//					  damage = 7;
//				}
//				if(ran == 8){
//					  damage = 8;
//				}
//				if(ran == 9){
//					  damage = 9;
//				}
//				if(ran == 10){
//					  damage = 10;
//				}
//				if(ran == 11){
//					  damage = 11;
//				}
//				if(ran == 12){
//					  damage = 12;
//				}
//				if(ran == 13){
//					  damage = 13;
//				}			
//					 ItemStack item1 = new ItemStack(35, 1, damage);
//					 Location drop = target.getLocation();
//			         target.getWorld().dropItemNaturally(drop, item1);	
//			         System.out.println("L<JGJHFJKHFKF");
//		//}		  
//	  }
//	}	  
//  }
}