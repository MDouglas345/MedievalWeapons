package net.medievalweapons.init;

import java.util.LinkedHashMap;
import java.util.Map;

import net.medievalweapons.MedievalMain;
import net.medievalweapons.compat.CompatItems;
import net.medievalweapons.compat.CompatRecipes;
import net.medievalweapons.item.Big_Axe_Item;
import net.medievalweapons.item.Dagger_Item;
import net.medievalweapons.item.Francisca_HT_Item;
import net.medievalweapons.item.Francisca_LT_Item;
import net.medievalweapons.item.Healing_Staff_Item;
import net.medievalweapons.item.Javelin_Item;
import net.medievalweapons.item.Lance_Item;
import net.medievalweapons.item.Long_Bow_Item;
import net.medievalweapons.item.Long_Sword_Item;
import net.medievalweapons.item.Mace_Item;
import net.medievalweapons.item.Recurve_Bow_Item;
import net.medievalweapons.item.Small_Axe_Item;
import net.medievalweapons.item.Thalleous_Sword_Item;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit {
    // Map
    public static final Map<Identifier, Item> ITEMS = new LinkedHashMap<>();
    // Small Axe
    public static final Small_Axe_Item WOOD_SMALL_AXE_ITEM = register("wooden_small_axe", new Small_Axe_Item(ToolMaterials.WOOD, 5, -2.9F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Small_Axe_Item STONE_SMALL_AXE_ITEM = register("stone_small_axe", new Small_Axe_Item(ToolMaterials.STONE, 5, -2.9F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Small_Axe_Item IRON_SMALL_AXE_ITEM = register("iron_small_axe", new Small_Axe_Item(ToolMaterials.IRON, 5, -2.9F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Small_Axe_Item GOLDEN_SMALL_AXE_ITEM = register("golden_small_axe", new Small_Axe_Item(ToolMaterials.GOLD, 5, -2.9F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Small_Axe_Item DIAMOND_SMALL_AXE_ITEM = register("diamond_small_axe", new Small_Axe_Item(ToolMaterials.DIAMOND, 5, -2.9F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Small_Axe_Item NETHERITE_SMALL_AXE_ITEM = register("netherite_small_axe",
            new Small_Axe_Item(ToolMaterials.NETHERITE, 5, -2.9F, new Item.Settings().group(MedievalMain.GROUP).fireproof()));
    // Long Sword
    public static final Long_Sword_Item WOOD_LONG_SWORD_ITEM = register("wooden_long_sword", new Long_Sword_Item(ToolMaterials.WOOD, 5, -3.0F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Long_Sword_Item STONE_LONG_SWORD_ITEM = register("stone_long_sword", new Long_Sword_Item(ToolMaterials.STONE, 5, -3.0F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Long_Sword_Item IRON_LONG_SWORD_ITEM = register("iron_long_sword", new Long_Sword_Item(ToolMaterials.IRON, 5, -3.0F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Long_Sword_Item GOLDEN_LONG_SWORD_ITEM = register("golden_long_sword", new Long_Sword_Item(ToolMaterials.GOLD, 5, -3.0F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Long_Sword_Item DIAMOND_LONG_SWORD_ITEM = register("diamond_long_sword", new Long_Sword_Item(ToolMaterials.DIAMOND, 5, -3.0F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Long_Sword_Item NETHERITE_LONG_SWORD_ITEM = register("netherite_long_sword",
            new Long_Sword_Item(ToolMaterials.NETHERITE, 5, -3.0F, new Item.Settings().group(MedievalMain.GROUP).fireproof()));
    // Dagger
    public static final Dagger_Item WOOD_DAGGER_ITEM = register("wooden_dagger", new Dagger_Item(ToolMaterials.WOOD, 2, -2.0F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Dagger_Item STONE_DAGGER_ITEM = register("stone_dagger", new Dagger_Item(ToolMaterials.STONE, 2, -2.0F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Dagger_Item IRON_DAGGER_ITEM = register("iron_dagger", new Dagger_Item(ToolMaterials.IRON, 2, -2.0F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Dagger_Item GOLDEN_DAGGER_ITEM = register("golden_dagger", new Dagger_Item(ToolMaterials.GOLD, 2, -2.0F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Dagger_Item DIAMOND_DAGGER_ITEM = register("diamond_dagger", new Dagger_Item(ToolMaterials.DIAMOND, 2, -2.0F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Dagger_Item NETHERITE_DAGGER_ITEM = register("netherite_dagger",
            new Dagger_Item(ToolMaterials.NETHERITE, 2, -2.0F, new Item.Settings().group(MedievalMain.GROUP).fireproof()));
    // Francisca
    public static final Francisca_LT_Item WOODEN_FRANCISCA_LT_ITEM = register("wooden_francisca",
            new Francisca_LT_Item(ToolMaterials.WOOD, 2.0F, -2.6F, () -> EntityInit.WOODEN_FRANCISCA_LT, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Francisca_LT_Item STONE_FRANCISCA_LT_ITEM = register("stone_francisca",
            new Francisca_LT_Item(ToolMaterials.STONE, 2.0F, -2.6F, () -> EntityInit.STONE_FRANCISCA_LT, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Francisca_HT_Item IRON_FRANCISCA_HT_ITEM = register("iron_francisca",
            new Francisca_HT_Item(ToolMaterials.IRON, 2.0F, -2.6F, () -> EntityInit.IRON_FRANCISCA_HT, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Francisca_HT_Item GOLDEN_FRANCISCA_HT_ITEM = register("golden_francisca",
            new Francisca_HT_Item(ToolMaterials.GOLD, 2.0F, -2.6F, () -> EntityInit.GOLDEN_FRANCISCA_HT, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Francisca_HT_Item DIAMOND_FRANCISCA_HT_ITEM = register("diamond_francisca",
            new Francisca_HT_Item(ToolMaterials.DIAMOND, 2.0F, -2.6F, () -> EntityInit.DIAMOND_FRANCISCA_HT, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Francisca_HT_Item NETHERITE_FRANCISCA_HT_ITEM = register("netherite_francisca",
            new Francisca_HT_Item(ToolMaterials.NETHERITE, 2.0F, -2.6F, () -> EntityInit.NETHERITE_FRANCISCA_HT, new Item.Settings().group(MedievalMain.GROUP).fireproof()));
    // Big Axe
    public static final Big_Axe_Item WOODEN_BIG_AXE_ITEM = register("wooden_big_axe", new Big_Axe_Item(ToolMaterials.WOOD, 6, -3.4F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Big_Axe_Item STONE_BIG_AXE_ITEM = register("stone_big_axe", new Big_Axe_Item(ToolMaterials.STONE, 6, -3.4F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Big_Axe_Item IRON_BIG_AXE_ITEM = register("iron_big_axe", new Big_Axe_Item(ToolMaterials.IRON, 6, -3.4F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Big_Axe_Item GOLDEN_BIG_AXE_ITEM = register("golden_big_axe", new Big_Axe_Item(ToolMaterials.GOLD, 6, -3.4F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Big_Axe_Item DIAMOND_BIG_AXE_ITEM = register("diamond_big_axe", new Big_Axe_Item(ToolMaterials.DIAMOND, 6, -3.4F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Big_Axe_Item NETHERITE_BIG_AXE_ITEM = register("netherite_big_axe",
            new Big_Axe_Item(ToolMaterials.NETHERITE, 6, -3.4F, new Item.Settings().group(MedievalMain.GROUP).fireproof()));
    // Javelin
    public static final Javelin_Item WOODEN_JAVELIN_ITEM = register("wooden_javelin",
            new Javelin_Item(ToolMaterials.WOOD, 2.2F, -2.7F, () -> EntityInit.WOODEN_JAVELIN, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Javelin_Item STONE_JAVELIN_ITEM = register("stone_javelin",
            new Javelin_Item(ToolMaterials.STONE, 2.2F, -2.7F, () -> EntityInit.STONE_JAVELIN, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Javelin_Item IRON_JAVELIN_ITEM = register("iron_javelin",
            new Javelin_Item(ToolMaterials.IRON, 2.2F, -2.7F, () -> EntityInit.IRON_JAVELIN, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Javelin_Item GOLDEN_JAVELIN_ITEM = register("golden_javelin",
            new Javelin_Item(ToolMaterials.GOLD, 2.2F, -2.7F, () -> EntityInit.GOLDEN_JAVELIN, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Javelin_Item DIAMOND_JAVELIN_ITEM = register("diamond_javelin",
            new Javelin_Item(ToolMaterials.DIAMOND, 2.2F, -2.7F, () -> EntityInit.DIAMOND_JAVELIN, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Javelin_Item NETHERITE_JAVELIN_ITEM = register("netherite_javelin",
            new Javelin_Item(ToolMaterials.NETHERITE, 2.2F, -2.7F, () -> EntityInit.NETHERITE_JAVELIN, new Item.Settings().group(MedievalMain.GROUP).fireproof()));
    // Lance
    public static final Lance_Item WOODEN_LANCE_ITEM = register("wooden_lance", new Lance_Item(ToolMaterials.WOOD, 3, -3.2F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Lance_Item STONE_LANCE_ITEM = register("stone_lance", new Lance_Item(ToolMaterials.STONE, 3, -3.2F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Lance_Item IRON_LANCE_ITEM = register("iron_lance", new Lance_Item(ToolMaterials.IRON, 3, -3.2F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Lance_Item GOLDEN_LANCE_ITEM = register("golden_lance", new Lance_Item(ToolMaterials.GOLD, 3, -3.2F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Lance_Item DIAMOND_LANCE_ITEM = register("diamond_lance", new Lance_Item(ToolMaterials.DIAMOND, 3, -3.2F, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Lance_Item NETHERITE_LANCE_ITEM = register("netherite_lance", new Lance_Item(ToolMaterials.NETHERITE, 3, -3.2F, new Item.Settings().group(MedievalMain.GROUP).fireproof()));
    // Healing Staff
    public static final Healing_Staff_Item WOODEN_HEALING_STAFF_ITEM = register("wooden_healing_staff",
            new Healing_Staff_Item(ToolMaterials.WOOD, 1, -3.3F, 1, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Healing_Staff_Item STONE_HEALING_STAFF_ITEM = register("stone_healing_staff",
            new Healing_Staff_Item(ToolMaterials.STONE, 1, -3.3F, 2, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Healing_Staff_Item IRON_HEALING_STAFF_ITEM = register("iron_healing_staff",
            new Healing_Staff_Item(ToolMaterials.IRON, 1, -3.3F, 3, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Healing_Staff_Item GOLDEN_HEALING_STAFF_ITEM = register("golden_healing_staff",
            new Healing_Staff_Item(ToolMaterials.GOLD, 1, -3.3F, 3, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Healing_Staff_Item DIAMOND_HEALING_STAFF_ITEM = register("diamond_healing_staff",
            new Healing_Staff_Item(ToolMaterials.DIAMOND, 1, -3.3F, 4, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Healing_Staff_Item NETHERITE_HEALING_STAFF_ITEM = register("netherite_healing_staff",
            new Healing_Staff_Item(ToolMaterials.NETHERITE, 1, -3.3F, 5, new Item.Settings().group(MedievalMain.GROUP).fireproof()));
    // Mace
    public static final Mace_Item WOODEN_MACE_ITEM = register("wooden_mace", new Mace_Item(ToolMaterials.WOOD, 4, -3.0F, 0, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Mace_Item STONE_MACE_ITEM = register("stone_mace", new Mace_Item(ToolMaterials.STONE, 4, -3.0F, 0, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Mace_Item IRON_MACE_ITEM = register("iron_mace", new Mace_Item(ToolMaterials.IRON, 4, -3.0F, 1, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Mace_Item GOLDEN_MACE_ITEM = register("golden_mace", new Mace_Item(ToolMaterials.GOLD, 4, -3.0F, 2, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Mace_Item DIAMOND_MACE_ITEM = register("diamond_mace", new Mace_Item(ToolMaterials.DIAMOND, 3, -3.0F, 2, new Item.Settings().group(MedievalMain.GROUP)));
    public static final Mace_Item NETHERITE_MACE_ITEM = register("netherite_mace", new Mace_Item(ToolMaterials.NETHERITE, 4, -3.0F, 3, new Item.Settings().group(MedievalMain.GROUP).fireproof()));
    // Long Bow
    public static final Long_Bow_Item LONG_BOW_ITEM = register("long_bow", new Long_Bow_Item(new Item.Settings().maxDamage(443).group(MedievalMain.GROUP)));
    // Recurve Bow
    public static final Recurve_Bow_Item RECURVE_BOW_ITEM = register("recurve_bow", new Recurve_Bow_Item(new Item.Settings().maxDamage(361).group(MedievalMain.GROUP)));
    // Thalleous Sword
    public static final Thalleous_Sword_Item THALLEOUS_SWORD = register("thalleous_sword", new Thalleous_Sword_Item(ToolMaterials.DIAMOND, 10, -3.0F, new Item.Settings().group(MedievalMain.GROUP)));

    public static <I extends Item> I register(String name, I item) {
        ITEMS.put(new Identifier("medievalweapons", name), item);
        return item;
    }

    public static void init() {
        CompatItems.loadItems();
        CompatRecipes.createRecipes();
        CompatRecipes.loadRecipes();
        for (Identifier id : ITEMS.keySet()) {
            Registry.register(Registry.ITEM, id, ITEMS.get(id));
        }
    }

}