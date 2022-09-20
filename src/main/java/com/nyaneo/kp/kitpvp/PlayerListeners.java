package com.nyaneo.kp.kitpvp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static org.bukkit.Material.SHIELD;

public class PlayerListeners implements Listener {

    KITPVP plugin;

    public PlayerListeners(KITPVP instance) {
        this.plugin = instance;

    }

    //when player joins the server
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        String pname = p.getName();
        p.getInventory().clear();
        //msg to sv join
        Bukkit.broadcastMessage("" + ChatColor.AQUA + ChatColor.BOLD + pname + ChatColor.RESET + ChatColor.GOLD + " 님이  입장하셨어요!");




    }

    //end of player join sv
    //when player quit sv

    @EventHandler
    public  void PlayerLeave(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        String pname = p.getName();
        p.getInventory().clear();
        //msg to sv quit
        Bukkit.broadcastMessage("" + ChatColor.AQUA + ChatColor.BOLD + pname + ChatColor.RESET + ChatColor.GOLD + "님이 퇴장하셨어요!");

    }

    @EventHandler
    public void onDropItem(PlayerDropItemEvent event) {
        Material droppedItemType = event.getItemDrop().getItemStack().getType();
        if (droppedItemType == Material.DIAMOND_SWORD) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();

        }
        if (droppedItemType == Material.STONE_SWORD) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }

        if (droppedItemType == Material.BOW) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }

        if (droppedItemType == Material.CROSSBOW) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }
        if (droppedItemType == Material.DIAMOND_AXE) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }

        if (droppedItemType == Material.WOODEN_SWORD) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }
        if (droppedItemType == Material.ARROW) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }
        if (droppedItemType == Material.DIAMOND_BOOTS) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }

        if (droppedItemType == Material.DIAMOND_LEGGINGS) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }

        if (droppedItemType == Material.DIAMOND_HELMET) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }

        if (droppedItemType == Material.DIAMOND_CHESTPLATE) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }

        if (droppedItemType == Material.IRON_CHESTPLATE) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }
        if (droppedItemType == Material.IRON_HELMET) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }
        if (droppedItemType == Material.IRON_LEGGINGS) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }
        if (droppedItemType == Material.IRON_BOOTS) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }
        if (droppedItemType == Material.IRON_AXE) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }
        if (droppedItemType == Material.IRON_SWORD) {
            // Example is the diamond sword.
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.updateInventory ();
        }
    }



    //end of player quit sv
    @EventHandler
    public  void Death(PlayerDeathEvent e) {
        Player p = e.getPlayer();
        Player k = p.getKiller();
        e.getDrops().clear();
        double kH = k.getHealth();
        int kHH = (int) kH;
        e.setDeathMessage("" + ChatColor.BLUE + p.getName() + ChatColor.AQUA + " 님이 " + ChatColor.RED + k.getName() + ChatColor.AQUA + " 님 에게 죽었어요!\n" + ChatColor.RED + k.getName() + ChatColor.RED + " ❤ " + ChatColor.GREEN + kHH);
        k.setHealth(20);
        p.removePotionEffect(PotionEffectType.SPEED);
        if (k.getInventory().contains(Material.CROSSBOW)) {
            k.getInventory().setItem(4, new ItemStack(Material.ARROW, 8));

        }
        if (k.getInventory().contains(Material.BOW)) {
            k.getInventory().setItem(4, new ItemStack(Material.ARROW, 8));

        }
        if (k.getInventory().getItemInOffHand().equals(Material.SHIELD)) {
            k.getInventory().setItem(4, new ItemStack(Material.ARROW, 8));


        }

        if (k.getInventory().contains(Material.CROSSBOW)) {
            k.getInventory().setItem(4, new ItemStack(Material.ARROW, 8));

        }

        if (k.getInventory().contains(Material.DIAMOND_PICKAXE)) {

            Bukkit.dispatchCommand(k,"frkit");

        }
        if (k.getInventory().getItemInOffHand().equals(Material.BOW))  {
            k.getInventory().setItem(4, new ItemStack(Material.ARROW, 8));
        }




    }


/**
 @EventHandler
 public void Respawn(PlayerRespawnEvent e) {
 Player p = e.getPlayer();

 //give kit selecter inven
 ItemStack kitselector = new ItemStack(Material.COMPASS);
 ItemMeta m = kitselector.getItemMeta();
 m.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "KIT SELECTOR");
 kitselector.setItemMeta(m);



 }
 **/


}



