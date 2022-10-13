# KITPVP
코드 ㅈ같게 짜둔 V1버전.
## Kitpvp
- V2 개발 중..

```java
public void kit_test1(Player p)
{
    p.getInventory().addItem(new ItemStack(Material.ARROW, 8));
    p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    //가죽 갑바와 화살 8개
}
@EventHandler
public void npcRightClick(NPCRightClickEvent e) 
{
    Player player = e.getClicker;
    if (e.getNpc.getName().equalsIgnoreCase("pvp")
    {
         kit_test1(player);
    }
}
```
