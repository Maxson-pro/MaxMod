package net.maxim.maxmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class Maxmod implements ModInitializer {
    public static final String MOD_ID = "maxmod";
    public static final Item RUBY_SWORD = new SwordItem(RubyToolMaterial.INSTANCE,3,-2.4F,new Item.Settings());
    public static final Item RUBY_PICKAXE = new PickaxeItem(RubyToolMaterial.INSTANCE,1,-2.8F,new Item.Settings());
    public static final Item RUBY_SHOVEL = new ShovelItem(RubyToolMaterial.INSTANCE,1.5F,-3F,new Item.Settings());
    public static final Item RUBY_AXE = new AxeItem(RubyToolMaterial.INSTANCE, 5, -3.0F, new Item.Settings());
    public static final Item RUBY_HOE = new HoeItem(RubyToolMaterial.INSTANCE,-1,-2.0F,new Item.Settings());
    public static final Item RUBY_HELMET = new ArmorItem(RubyArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item RUBY_CHESTPLATE = new ArmorItem(RubyArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item RUBY_LEGGINGS = new ArmorItem(RubyArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item RUBY_BOOTS = new ArmorItem(RubyArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new Item.Settings());



    public static final Item RUBY = new Item(new Item.Settings());
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK));
    public static final ItemGroup RUBY_GROUP = FabricItemGroup.builder().icon(() -> new ItemStack(RUBY))
            .displayName(Text.translatable("itemGroup.maxmod.ruby_group"))
            .entries((context, entries) -> {
                entries.add(RUBY);
                entries.add(RUBY_BLOCK);
                entries.add(RUBY_SWORD);
                entries.add(RUBY_PICKAXE);
                entries.add(RUBY_SHOVEL);
                entries.add(RUBY_AXE);
                entries.add(RUBY_HOE);
                entries.add(RUBY_BOOTS);
                entries.add(RUBY_CHESTPLATE);
                entries.add(RUBY_LEGGINGS);
                entries.add(RUBY_HELMET);

            }).build();

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby"), RUBY);
        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "ruby_group"), RUBY_GROUP);
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings()));
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"ruby_sword"),RUBY_SWORD);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID, "ruby_pickaxe"),RUBY_PICKAXE);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID, "ruby_axe"),RUBY_AXE);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID, "ruby_shovel"), RUBY_SHOVEL);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID, "ruby_hoe"),RUBY_HOE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_helmet"), RUBY_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_leggings"), RUBY_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_boots"), RUBY_BOOTS);

    }
}