package net.maxim.maxmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maxim.maxmod.Maxmod;
import net.maxim.maxmod.RubyToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(RubyToolMaterial.INSTANCE, 3, -2.4f, new Item.Settings()));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(RubyToolMaterial.INSTANCE, 1, -2.8f, new Item.Settings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(RubyToolMaterial.INSTANCE, 5, -3.0f, new Item.Settings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(RubyToolMaterial.INSTANCE, 1.5f, -3.0f, new Item.Settings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(RubyToolMaterial.INSTANCE, -1, -2.0f, new Item.Settings()));


    public static final Item RUBY_HELMET = registerItem("ruby_helmet", new ArmorItem(net.maxim.maxmod.item.RubyArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(net.maxim.maxmod.item.RubyArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(net.maxim.maxmod.item.RubyArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(net.maxim.maxmod.item.RubyArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Maxmod.MOD_ID, name), item);
    }

    public static void registerModItems() {

    }
}