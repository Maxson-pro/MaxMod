package net.maxim.maxmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class Maxmod implements ModInitializer {
    public static final String MOD_ID = "maxmod";

    public static final Item RUBY = new Item(new Item.Settings());
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK));
    public static final ItemGroup RUBY_GROUP = FabricItemGroup.builder().icon(() -> new ItemStack(RUBY))
            .displayName(Text.translatable("itemGroup.maxmod.ruby_group"))
            .entries((context, entries) -> {
                entries.add(RUBY);
                entries.add(RUBY_BLOCK);
            }).build();

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby"), RUBY);
        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "ruby_group"), RUBY_GROUP);
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings()));
    }
}