package com.nyaneo.kp.kitpvp;


import com.nyaneo.kp.kitpvp.PlayerListeners;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class KITPVP extends JavaPlugin implements Listener {

    private static KITPVP instance;
    


    public void log(String string) {
        System.out.println(string);
    }

    public static KITPVP getInstance() {
        return instance;
    }

    public void registerListeners() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerListeners(this), this);

    }

    public void registerCommands() {
        //not using this yet!
    }


    FileConfiguration config = this.getConfig();

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("test was ???dsjf");
        instance = this;
        registerListeners();
        registerCommands();

        getServer().getPluginManager().registerEvents(this, this);
        getConfig().options().copyDefaults(true);
        saveConfig();
        
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("sffdsght");
        instance = null;

        getServer().getPluginManager().registerEvents(this, this);

        getConfig().options().copyDefaults(true);
        saveConfig();
    }




    public FileConfiguration getConfigFile() {
        return config;
    }

    int x;
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        //starter command
        if (cmd.getName().equalsIgnoreCase("swordkit") && sender instanceof Player) {
            Player p = (Player) sender;
            p.getInventory().clear();
            ItemStack swordkitSword = new ItemStack(Material.STONE_SWORD);
            ItemMeta m = swordkitSword.getItemMeta();
            m.setUnbreakable(true);
            m.setDisplayName("" + ChatColor.GRAY + "돌 검");
            swordkitSword.setItemMeta(m);
            swordkitSword.addEnchantment(Enchantment.DURABILITY, 2);


            ItemStack swordkitHelmet = new ItemStack(Material.DIAMOND_HELMET);
            ItemMeta mHelmet = swordkitHelmet.getItemMeta();
            mHelmet.setUnbreakable(true);
            mHelmet.setDisplayName("" + ChatColor.AQUA + "다이아 헬멧");
            swordkitHelmet.setItemMeta(mHelmet);
            swordkitHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack swordkitCP = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemMeta mCP = swordkitSword.getItemMeta();
            mCP.setUnbreakable(true);
            mCP.setDisplayName("" + ChatColor.AQUA + "다이아 갑옷");
            swordkitCP.setItemMeta(mCP);
            swordkitCP.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack swordkitLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);
            ItemMeta mL = swordkitSword.getItemMeta();
            mL.setUnbreakable(true);
            mL.setDisplayName("" + ChatColor.AQUA + "다이아 바지");
            swordkitLeggings.setItemMeta(mL);
            swordkitLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack swordkitBoots = new ItemStack(Material.DIAMOND_BOOTS);
            ItemMeta mB = swordkitSword.getItemMeta();
            mB.setUnbreakable(true);
            mB.setDisplayName("" + ChatColor.AQUA + "다이아 신발");
            swordkitBoots.setItemMeta(mB);
            swordkitBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            p.getInventory().addItem(swordkitSword);
            p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 1));

            p.getInventory().setHelmet(swordkitHelmet);
            p.getInventory().setChestplate(swordkitCP);
            p.getInventory().setLeggings(swordkitLeggings);
            p.getInventory().setBoots(swordkitBoots);
            p.setMaxHealth(20);
            p.setHealth(20);


        }
        //starter kit End!


        if (cmd.getName().equalsIgnoreCase("frkit") && sender instanceof Player) {
            Player p = (Player) sender;
            p.getInventory().clear();
            ItemStack swordkitSword = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta mm = swordkitSword.getItemMeta();
            mm.setUnbreakable(true);
            mm.setDisplayName("" + ChatColor.GRAY + "다이아 검");
            swordkitSword.setItemMeta(mm);
            swordkitSword.addEnchantment(Enchantment.DAMAGE_ALL, 1);

            ItemStack swordkitSword1 = new ItemStack(Material.DIAMOND_PICKAXE);
            ItemMeta m1 = swordkitSword1.getItemMeta();
            m1.setUnbreakable(true);
            m1.setDisplayName("" + ChatColor.GRAY + "다이아 곡괭이");
            swordkitSword1.setItemMeta(m1);
            swordkitSword1.addEnchantment(Enchantment.DIG_SPEED, 3);

            ItemStack swordkitSword2 = new ItemStack(Material.DIAMOND_AXE);
            ItemMeta m2 = swordkitSword2.getItemMeta();
            m2.setUnbreakable(true);
            m2.setDisplayName("" + ChatColor.GRAY + "다이아 도끼");
            swordkitSword2.setItemMeta(m2);

            ItemStack swordkitSword3 = new ItemStack(Material.BOW);
            ItemMeta m3 = swordkitSword3.getItemMeta();
            m3.setUnbreakable(true);
            m3.setDisplayName("" + ChatColor.GRAY + "활");
            swordkitSword3.setItemMeta(m3);
            swordkitSword3.addEnchantment(Enchantment.ARROW_DAMAGE, 1);

            ItemStack swordkitSword4 = new ItemStack(Material.SHIELD);
            ItemMeta m4 = swordkitSword4.getItemMeta();
            m4.setUnbreakable(true);
            m4.setDisplayName("" + ChatColor.GRAY + "방패");
            swordkitSword4.setItemMeta(m4);



            ItemStack swordkitHelmet = new ItemStack(Material.DIAMOND_HELMET);
            ItemMeta mHelmet = swordkitHelmet.getItemMeta();
            mHelmet.setUnbreakable(true);
            mHelmet.setDisplayName("" + ChatColor.AQUA + "다이아 헬멧");
            swordkitHelmet.setItemMeta(mHelmet);

            swordkitHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack swordkitCP = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemMeta mCP = swordkitCP.getItemMeta();
            mCP.setUnbreakable(true);
            mCP.setDisplayName("" + ChatColor.AQUA + "다이아 갑옷");
            swordkitCP.setItemMeta(mCP);
            swordkitCP.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack swordkitLeggings = new ItemStack(Material.IRON_LEGGINGS);
            ItemMeta mL = swordkitLeggings.getItemMeta();
            mL.setUnbreakable(true);
            mL.setDisplayName("" + ChatColor.AQUA + "철 바지");
            swordkitLeggings.setItemMeta(mL);
            swordkitLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack swordkitBoots = new ItemStack(Material.IRON_BOOTS);
            ItemMeta mB = swordkitBoots.getItemMeta();
            mB.setUnbreakable(true);
            mB.setDisplayName("" + ChatColor.AQUA + "철 신발");
            swordkitBoots.setItemMeta(mB);
            swordkitBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack ckit3 = new ItemStack(Material.DIAMOND_HELMET);
            ItemMeta mB13 = ckit3.getItemMeta();
            mB13.setUnbreakable(true);
            mB13.setDisplayName("" + ChatColor.AQUA + "다이아 헬멧");
            ckit3.setItemMeta(mB13);

            ItemStack ckit4 = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemMeta mB14 = ckit4.getItemMeta();
            mB14.setUnbreakable(true);
            mB14.setDisplayName("" + ChatColor.AQUA + "다이아 갑옷");
            ckit4.setItemMeta(mB14);

            ItemStack ckit5 = new ItemStack(Material.DIAMOND_LEGGINGS);
            ItemMeta mB15 = ckit5.getItemMeta();
            mB15.setUnbreakable(true);
            mB15.setDisplayName("" + ChatColor.AQUA + "다이아 바지");
            ckit5.setItemMeta(mB15);

            ItemStack ckit6 = new ItemStack(Material.DIAMOND_BOOTS);
            ItemMeta mB16 = ckit6.getItemMeta();
            mB16.setUnbreakable(true);
            mB16.setDisplayName("" + ChatColor.AQUA + "다이아 신발");
            ckit6.setItemMeta(mB16);

            ItemStack ckit31 = new ItemStack(Material.IRON_HELMET);
            ItemMeta mB131 = ckit31.getItemMeta();
            mB131.setUnbreakable(true);
            mB131.setDisplayName("" + ChatColor.AQUA + "철 헬멧");
            ckit31.setItemMeta(mB131);

            ItemStack ckit41 = new ItemStack(Material.IRON_CHESTPLATE);
            ItemMeta mB141 = ckit41.getItemMeta();
            mB141.setUnbreakable(true);
            mB141.setDisplayName("" + ChatColor.AQUA + "철 갑옷");
            ckit41.setItemMeta(mB141);

            ItemStack ckit51 = new ItemStack(Material.IRON_LEGGINGS);
            ItemMeta mB151 = ckit51.getItemMeta();
            mB151.setUnbreakable(true);
            mB151.setDisplayName("" + ChatColor.AQUA + "철 바지");
            ckit51.setItemMeta(mB151);

            ItemStack ckit61 = new ItemStack(Material.IRON_BOOTS);
            ItemMeta mB161 = ckit61.getItemMeta();
            mB161.setUnbreakable(true);
            mB161.setDisplayName("" + ChatColor.AQUA + "철 신발");
            ckit61.setItemMeta(mB161);

            p.getInventory().addItem(swordkitSword); //검

            p.getInventory().addItem(swordkitSword2); //도끼

            p.getInventory().addItem(new ItemStack(Material.COBBLESTONE, 64));
            p.getInventory().addItem(swordkitSword3); //활

            p.getInventory().addItem(new ItemStack(Material.WATER_BUCKET, 1));

            p.getInventory().addItem(new ItemStack(Material.LAVA_BUCKET, 1));
            p.getInventory().addItem(new ItemStack(Material.LAVA_BUCKET, 1));


            p.getInventory().addItem(swordkitSword1); //곡

            p.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 16));

            p.getInventory().addItem(new ItemStack(Material.ARROW, 24));

            p.getInventory().addItem(new ItemStack(Material.WATER_BUCKET, 3));



            p.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 2));
            p.getInventory().addItem(new ItemStack(Material.COBBLESTONE, 64));

            p.getInventory().setItem(18, ckit3);
            p.getInventory().setItem(19, ckit4);
            p.getInventory().setItem(20, ckit5);
            p.getInventory().setItem(21, ckit6);



            p.getInventory().setItem(27, ckit31);
            p.getInventory().setItem(28, ckit41);
            p.getInventory().setItem(29, ckit51);
            p.getInventory().setItem(30, ckit61);


            p.getInventory().setItemInOffHand(swordkitSword4);

            p.getInventory().setHelmet(swordkitHelmet);
            p.getInventory().setChestplate(swordkitCP);
            p.getInventory().setLeggings(swordkitLeggings);
            p.getInventory().setBoots(swordkitBoots);
            p.setMaxHealth(20);
            p.setHealth(20);


        }


        if (cmd.getName().equalsIgnoreCase("onlyaxe") && sender instanceof Player) {
            Player p = (Player) sender;
            p.getInventory().clear();
            ItemStack swordkitSword = new ItemStack(Material.DIAMOND_AXE);
            ItemMeta m = swordkitSword.getItemMeta();
            m.setUnbreakable(true);
            m.setDisplayName("" + ChatColor.GRAY + "다이아 도끼");
            swordkitSword.setItemMeta(m);
            swordkitSword.addEnchantment(Enchantment.DURABILITY, 2);


            ItemStack swordkitHelmet = new ItemStack(Material.DIAMOND_HELMET);
            ItemMeta mHelmet = swordkitHelmet.getItemMeta();
            mHelmet.setUnbreakable(true);
            mHelmet.setDisplayName("" + ChatColor.AQUA + "다이아 헬멧");
            swordkitHelmet.setItemMeta(mHelmet);
            swordkitHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack swordkitCP = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemMeta mCP = swordkitSword.getItemMeta();
            mCP.setUnbreakable(true);
            mCP.setDisplayName("" + ChatColor.AQUA + "다이아 갑옷");
            swordkitCP.setItemMeta(mCP);
            swordkitCP.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack swordkitLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);
            ItemMeta mL = swordkitSword.getItemMeta();
            mL.setUnbreakable(true);
            mL.setDisplayName("" + ChatColor.AQUA + "다이아 바지");
            swordkitLeggings.setItemMeta(mL);
            swordkitLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack swordkitBoots = new ItemStack(Material.DIAMOND_BOOTS);
            ItemMeta mB = swordkitSword.getItemMeta();
            mB.setUnbreakable(true);
            mB.setDisplayName("" + ChatColor.AQUA + "다이아 신발");
            swordkitBoots.setItemMeta(mB);
            swordkitBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            p.getInventory().addItem(swordkitSword);


            p.getInventory().setHelmet(swordkitHelmet);
            p.getInventory().setChestplate(swordkitCP);
            p.getInventory().setLeggings(swordkitLeggings);
            p.getInventory().setBoots(swordkitBoots);
            p.setMaxHealth(20);
            p.setHealth(20);
            p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 99999, 1));

        }


        if (cmd.getName().equalsIgnoreCase("diapot") && sender instanceof Player) {
            Player p = (Player) sender;
            p.getInventory().clear();
            ItemStack swordkitSword = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta m = swordkitSword.getItemMeta();
            m.setUnbreakable(true);
            m.setDisplayName("" + ChatColor.GRAY + "다이아 검");
            swordkitSword.setItemMeta(m);
            swordkitSword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
            swordkitSword.addEnchantment(Enchantment.DURABILITY, 3);
            swordkitSword.addEnchantment(Enchantment.FIRE_ASPECT, 2);


            ItemStack swordkitHelmet = new ItemStack(Material.DIAMOND_HELMET);
            ItemMeta mHelmet = swordkitHelmet.getItemMeta();
            mHelmet.setUnbreakable(true);
            mHelmet.setDisplayName("" + ChatColor.AQUA + "다이아 헬멧");
            swordkitHelmet.setItemMeta(mHelmet);
            swordkitHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            swordkitHelmet.addEnchantment(Enchantment.DURABILITY, 3);


            ItemStack swordkitCP = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemMeta mCP = swordkitCP.getItemMeta();
            mCP.setUnbreakable(true);
            mCP.setDisplayName("" + ChatColor.AQUA + "다이아 갑옷");
            swordkitCP.setItemMeta(mCP);
            swordkitCP.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            swordkitCP.addEnchantment(Enchantment.DURABILITY, 3);


            ItemStack swordkitLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);
            ItemMeta mL = swordkitLeggings.getItemMeta();
            mL.setUnbreakable(true);
            mL.setDisplayName("" + ChatColor.AQUA + "다이아 바지");
            swordkitLeggings.setItemMeta(mL);
            swordkitLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            swordkitLeggings.addEnchantment(Enchantment.DURABILITY, 3);


            ItemStack swordkitBoots = new ItemStack(Material.DIAMOND_BOOTS);
            ItemMeta mB = swordkitBoots.getItemMeta();
            mB.setUnbreakable(true);
            mB.setDisplayName("" + ChatColor.AQUA + "다이아 신발");
            swordkitBoots.setItemMeta(mB);
            swordkitBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            swordkitBoots.addEnchantment(Enchantment.DURABILITY, 3);


            ItemStack p1 = new ItemStack(Material.POTION, 1);
            PotionMeta m1 = (PotionMeta) p1.getItemMeta();
            m1.setDisplayName("" + ChatColor.GRAY + "속도 증가 포션");
            m1.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 1), true); //60 second duration, level 3, and true just overwrites an existing effect with whatever level/duration you give it
            p1.setItemMeta(m1);

            ItemStack p2 = new ItemStack(Material.POTION, 1);
            PotionMeta m2 = (PotionMeta) p2.getItemMeta();
            m2.setDisplayName("" + ChatColor.GRAY + "화염 저항 포션");
            m2.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1200, 1), true); //60 second duration, level 3, and true just overwrites an existing effect with whatever level/duration you give it
            p2.setItemMeta(m2);

            ItemStack p3 = new ItemStack(Material.SPLASH_POTION, 1);
            PotionMeta m3 = (PotionMeta) p3.getItemMeta();
            m3.setDisplayName("" + ChatColor.GRAY + "즉시 치유 포션");
            m3.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 20, 1), true); //60 second duration, level 3, and true just overwrites an existing effect with whatever level/duration you give it
            p3.setItemMeta(m3);

            p.getInventory().addItem(swordkitSword);


            p.getInventory().setHelmet(swordkitHelmet);
            p.getInventory().setChestplate(swordkitCP);
            p.getInventory().setLeggings(swordkitLeggings);
            p.getInventory().setBoots(swordkitBoots);
            p.getInventory().setItem(1, new ItemStack(Material.ENDER_PEARL, 16));
            p.getInventory().setItem(3, p1);
            p.getInventory().setItem(2, p2);

            p.getInventory().setItem(8, new ItemStack(Material.COOKED_BEEF, 64));

            p.getInventory().setItem(9, p1);
            p.getInventory().setItem(18, p1);
            p.getInventory().setItem(27, p1);
            p.getInventory().setItem(10, p3);
            p.getInventory().setItem(11, p3);
            p.getInventory().setItem(12, p3);
            p.getInventory().setItem(13, p3);
            p.getInventory().setItem(14, p3);
            p.getInventory().setItem(15, p3);
            p.getInventory().setItem(16, p3);
            p.getInventory().setItem(17, p3);
            p.getInventory().setItem(19, p3);
            p.getInventory().setItem(20, p3);
            p.getInventory().setItem(21, p3);
            p.getInventory().setItem(22, p3);
            p.getInventory().setItem(23, p3);
            p.getInventory().setItem(24, p3);
            p.getInventory().setItem(25, p3);
            p.getInventory().setItem(26, p3);
            p.getInventory().setItem(28, p3);
            p.getInventory().setItem(29, p3);
            p.getInventory().setItem(30, p3);

            p.getInventory().setItem(31, p3);

            p.getInventory().setItem(32, p3);

            p.getInventory().setItem(33, p3);

            p.getInventory().setItem(34, p3);

            p.getInventory().setItem(35, p3);
            p.setMaxHealth(20);
            p.setHealth(20);


        }






        //Amateur kit start!
        if (cmd.getName().equalsIgnoreCase("classickit") && sender instanceof Player) {

            Player p = (Player) sender;
            p.getInventory().clear();
            ItemStack classickitSword = new ItemStack(Material.STONE_SWORD);
            ItemMeta m = classickitSword.getItemMeta();
            m.setUnbreakable(true);
            m.setDisplayName("" + ChatColor.GRAY + "돌 검");
            classickitSword.setItemMeta(m);
            classickitSword.addEnchantment(Enchantment.DURABILITY, 2);


            ItemStack classickitHelmet = new ItemStack(Material.DIAMOND_HELMET);
            ItemMeta m1Helmet = classickitHelmet.getItemMeta();
            m1Helmet.setUnbreakable(true);
            m1Helmet.setDisplayName("" + ChatColor.AQUA + "다이아 헬멧");
            classickitHelmet.setItemMeta(m1Helmet);
            classickitHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack classickitCP = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemMeta mCP = classickitCP.getItemMeta();
            mCP.setUnbreakable(true);
            mCP.setDisplayName("" + ChatColor.AQUA + "다이아 갑옷");
            classickitCP.setItemMeta(mCP);
            classickitCP.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack cKL = new ItemStack(Material.DIAMOND_LEGGINGS);
            ItemMeta mL = cKL.getItemMeta();
            mL.setUnbreakable(true);
            mL.setDisplayName("" + ChatColor.AQUA + "다이아 바지");
            cKL.setItemMeta(mL);
            cKL.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack ckitBoots = new ItemStack(Material.DIAMOND_BOOTS);
            ItemMeta mB = ckitBoots.getItemMeta();
            mB.setUnbreakable(true);
            mB.setDisplayName("" + ChatColor.AQUA + "다이아 신발");
            ckitBoots.setItemMeta(mB);
            ckitBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            ItemStack ckitBow = new ItemStack(Material.BOW);
            ItemMeta mB2 = ckitBow.getItemMeta();
            mB2.setUnbreakable(true);
            mB2.setDisplayName("" + ChatColor.AQUA + "활");
            ckitBow.setItemMeta(mB2);

            ItemStack ckitCBow = new ItemStack(Material.CROSSBOW);
            ItemMeta mB21 = ckitCBow.getItemMeta();
            mB21.setUnbreakable(true);
            mB21.setDisplayName("" + ChatColor.AQUA + "쇠뇌");
            ckitCBow.setItemMeta(mB21);


            ItemStack ckitSheild = new ItemStack(Material.SHIELD);
            ItemMeta mB1 = ckitSheild.getItemMeta();
            mB1.setUnbreakable(true);
            mB1.setDisplayName("" + ChatColor.AQUA + "방패");
            ckitSheild.setItemMeta(mB1);

            ItemStack ckit1 = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta mB11 = ckit1.getItemMeta();
            mB11.setUnbreakable(true);
            mB11.setDisplayName("" + ChatColor.AQUA + "다검");
            ckitSheild.setItemMeta(mB11);

            ItemStack ckit2 = new ItemStack(Material.DIAMOND_AXE);
            ItemMeta mB12 = ckit2.getItemMeta();
            mB12.setUnbreakable(true);
            mB12.setDisplayName("" + ChatColor.AQUA + "다이아 도끼");
            ckitSheild.setItemMeta(mB12);

            ItemStack ckit3 = new ItemStack(Material.DIAMOND_HELMET);
            ItemMeta mB13 = ckit3.getItemMeta();
            mB13.setUnbreakable(true);
            mB13.setDisplayName("" + ChatColor.AQUA + "다이아 헬멧");
            ckitSheild.setItemMeta(mB13);

            ItemStack ckit4 = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemMeta mB14 = ckit4.getItemMeta();
            mB14.setUnbreakable(true);
            mB14.setDisplayName("" + ChatColor.AQUA + "다이아 갑옷");
            ckitSheild.setItemMeta(mB14);

            ItemStack ckit5 = new ItemStack(Material.DIAMOND_LEGGINGS);
            ItemMeta mB15 = ckit5.getItemMeta();
            mB15.setUnbreakable(true);
            mB15.setDisplayName("" + ChatColor.AQUA + "다이아 바지");
            ckitSheild.setItemMeta(mB15);

            ItemStack ckit6 = new ItemStack(Material.DIAMOND_BOOTS);
            ItemMeta mB16 = ckit6.getItemMeta();
            mB16.setUnbreakable(true);
            mB16.setDisplayName("" + ChatColor.AQUA + "다이아 신발");
            ckitSheild.setItemMeta(mB16);

            ItemStack ckit31 = new ItemStack(Material.IRON_HELMET);
            ItemMeta mB131 = ckit31.getItemMeta();
            mB131.setUnbreakable(true);
            mB131.setDisplayName("" + ChatColor.AQUA + "철 헬멧");
            ckitSheild.setItemMeta(mB131);

            ItemStack ckit41 = new ItemStack(Material.IRON_CHESTPLATE);
            ItemMeta mB141 = ckit41.getItemMeta();
            mB141.setUnbreakable(true);
            mB141.setDisplayName("" + ChatColor.AQUA + "철 갑옷");
            ckitSheild.setItemMeta(mB141);

            ItemStack ckit51 = new ItemStack(Material.IRON_LEGGINGS);
            ItemMeta mB151 = ckit51.getItemMeta();
            mB151.setUnbreakable(true);
            mB151.setDisplayName("" + ChatColor.AQUA + "철 바지");
            ckitSheild.setItemMeta(mB151);

            ItemStack ckit61 = new ItemStack(Material.IRON_BOOTS);
            ItemMeta mB161 = ckit61.getItemMeta();
            mB161.setUnbreakable(true);
            mB161.setDisplayName("" + ChatColor.AQUA + "철 신발");
            ckitSheild.setItemMeta(mB161);

            ItemStack ckit62 = new ItemStack(Material.IRON_AXE);
            ItemMeta mB162 = ckit62.getItemMeta();
            mB162.setUnbreakable(true);
            mB162.setDisplayName("" + ChatColor.AQUA + "철 도끼");
            ckit62.setItemMeta(mB162);

            ItemStack ckit63 = new ItemStack(Material.IRON_SWORD);
            ItemMeta mB163 = ckit63.getItemMeta();
            mB163.setUnbreakable(true);
            mB163.setDisplayName("" + ChatColor.AQUA + "철 검");
            ckit63.setItemMeta(mB163);

            p.getInventory().addItem(ckit1);
            p.getInventory().addItem(ckit2);
          //  p.getInventory().addItem(classickitSword);

            p.getInventory().addItem(ckitCBow);
            p.getInventory().addItem(ckitBow);
            p.getInventory().addItem(new ItemStack(Material.ARROW, 8));

            p.getInventory().setItem(9, ckit3);
            p.getInventory().setItem(10, ckit4);
            p.getInventory().setItem(11, ckit5);
            p.getInventory().setItem(12, ckit6);

            p.getInventory().setItem(8, ckit62);

            p.getInventory().setItem(18, ckit31);
            p.getInventory().setItem(19, ckit41);
            p.getInventory().setItem(20, ckit51);
            p.getInventory().setItem(21, ckit61);

            p.getInventory().setItem(26, ckit63);


            p.getInventory().setHelmet(classickitHelmet);
            p.getInventory().setChestplate(classickitCP);
            p.getInventory().setLeggings(cKL);
            p.getInventory().setBoots(ckitBoots);
            p.getInventory().setItemInOffHand(ckitSheild);
            p.setMaxHealth(20);
            p.setHealth(20); //amateur end


        }

        if (cmd.getName().equalsIgnoreCase("classickitnoprotect") && sender instanceof Player) {

            Player p = (Player) sender;
            p.getInventory().clear();
            ItemStack classickitSword = new ItemStack(Material.STONE_SWORD);
            ItemMeta m = classickitSword.getItemMeta();
            m.setUnbreakable(true);
            m.setDisplayName("" + ChatColor.GRAY + "돌 검");
            classickitSword.setItemMeta(m);
            classickitSword.addEnchantment(Enchantment.DURABILITY, 2);


            ItemStack classickitHelmet = new ItemStack(Material.DIAMOND_HELMET);
            ItemMeta m1Helmet = classickitHelmet.getItemMeta();
            m1Helmet.setUnbreakable(true);
            m1Helmet.setDisplayName("" + ChatColor.AQUA + "다이아 헬멧");
            classickitHelmet.setItemMeta(m1Helmet);


            ItemStack classickitCP = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemMeta mCP = classickitCP.getItemMeta();
            mCP.setUnbreakable(true);
            mCP.setDisplayName("" + ChatColor.AQUA + "다이아 갑옷");
            classickitCP.setItemMeta(mCP);


            ItemStack cKL = new ItemStack(Material.DIAMOND_LEGGINGS);
            ItemMeta mL = cKL.getItemMeta();
            mL.setUnbreakable(true);
            mL.setDisplayName("" + ChatColor.AQUA + "다이아 바지");
            cKL.setItemMeta(mL);


            ItemStack ckitBoots = new ItemStack(Material.DIAMOND_BOOTS);
            ItemMeta mB = ckitBoots.getItemMeta();
            mB.setUnbreakable(true);
            mB.setDisplayName("" + ChatColor.AQUA + "다이아 신발");
            ckitBoots.setItemMeta(mB);

            ItemStack ckitBow = new ItemStack(Material.BOW);
            ItemMeta mB2 = ckitBow.getItemMeta();
            mB2.setUnbreakable(true);
            mB2.setDisplayName("" + ChatColor.AQUA + "활");
            ckitBow.setItemMeta(mB2);

            ItemStack ckitCBow = new ItemStack(Material.CROSSBOW);
            ItemMeta mB21 = ckitCBow.getItemMeta();
            mB21.setUnbreakable(true);
            mB21.setDisplayName("" + ChatColor.AQUA + "쇠뇌");
            ckitCBow.setItemMeta(mB21);


            ItemStack ckitSheild = new ItemStack(Material.SHIELD);
            ItemMeta mB1 = ckitSheild.getItemMeta();
            mB1.setUnbreakable(true);
            mB1.setDisplayName("" + ChatColor.AQUA + "방패");
            ckitSheild.setItemMeta(mB1);

            ItemStack ckit1 = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta mB11 = ckit1.getItemMeta();
            mB11.setUnbreakable(true);
            mB11.setDisplayName("" + ChatColor.AQUA + "다검");
            ckit1.setItemMeta(mB11);

            ItemStack ckit2 = new ItemStack(Material.DIAMOND_AXE);
            ItemMeta mB12 = ckit2.getItemMeta();
            mB12.setUnbreakable(true);
            mB12.setDisplayName("" + ChatColor.AQUA + "다이아 도끼");
            ckit2.setItemMeta(mB12);



            p.getInventory().addItem(ckit1);
            p.getInventory().addItem(ckit2);
            //  p.getInventory().addItem(classickitSword);

            p.getInventory().addItem(ckitCBow);
            p.getInventory().addItem(ckitBow);
            p.getInventory().addItem(new ItemStack(Material.ARROW, 8));


            p.getInventory().setHelmet(classickitHelmet);
            p.getInventory().setChestplate(classickitCP);
            p.getInventory().setLeggings(cKL);
            p.getInventory().setBoots(ckitBoots);
            p.getInventory().setItemInOffHand(ckitSheild);
            p.setMaxHealth(20);
            p.setHealth(20); //amateur end


        }

        if (cmd.getName().equalsIgnoreCase("speedkit") && sender instanceof Player) {
            Player p = (Player) sender;
            p.getInventory().clear();
            ItemStack swordkitSword = new ItemStack(Material.WOODEN_SWORD);
            ItemMeta m = swordkitSword.getItemMeta();
            m.setUnbreakable(true);
            m.setDisplayName("" + ChatColor.GRAY + "나무 검");
            swordkitSword.setItemMeta(m);
            swordkitSword.addEnchantment(Enchantment.DURABILITY, 2);


            ItemStack swordkitHelmet = new ItemStack(Material.DIAMOND_HELMET);
            ItemMeta mHelmet = swordkitHelmet.getItemMeta();
            mHelmet.setUnbreakable(true);
            mHelmet.setDisplayName("" + ChatColor.AQUA + "다이아 헬멧");
            swordkitHelmet.setItemMeta(mHelmet);
            swordkitHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack swordkitCP = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemMeta mCP = swordkitSword.getItemMeta();
            mCP.setUnbreakable(true);
            mCP.setDisplayName("" + ChatColor.AQUA + "다이아 갑옷");
            swordkitCP.setItemMeta(mCP);
            swordkitCP.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack swordkitLeggings = new ItemStack(Material.IRON_LEGGINGS);
            ItemMeta mL = swordkitSword.getItemMeta();
            mL.setUnbreakable(true);
            mL.setDisplayName("" + ChatColor.AQUA + "철 바지");
            swordkitLeggings.setItemMeta(mL);
            swordkitLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);


            ItemStack swordkitBoots = new ItemStack(Material.DIAMOND_BOOTS);
            ItemMeta mB = swordkitSword.getItemMeta();
            mB.setUnbreakable(true);
            mB.setDisplayName("" + ChatColor.AQUA + "다이아 신발");
            swordkitBoots.setItemMeta(mB);
            swordkitBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            p.getInventory().addItem(swordkitSword);
            p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 1));

            p.getInventory().setHelmet(swordkitHelmet);
            p.getInventory().setChestplate(swordkitCP);
            p.getInventory().setLeggings(swordkitLeggings);
            p.getInventory().setBoots(swordkitBoots);
            p.setMaxHealth(20);
            p.setHealth(20);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 99999, 1));



            return false;
        }



        return false;
    }
//이거 뭔 생각으로 만들었던거냐도데체 ㅋㅋㅋㅋㅋㅋ
/**
    @EventHandler
    public void onCD(PlayerDeathEvent e) {
        Player p = e.getPlayer();
        Player k = p.getKiller();
        if (x == 3) {
            k.getInventory().setItem(5, new ItemStack(Material.ARROW, 7));
        }
    }
**/
}

