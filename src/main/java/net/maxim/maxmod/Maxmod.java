package net.maxim.maxmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maxim.maxmod.block.ModBlocks; // Импорт твоего нового класса
import net.maxim.maxmod.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class Maxmod implements ModInitializer {
    public static final String MOD_ID = "maxmod";

    public static final Item RUBY = Registry.register(Registries.ITEM,
            new Identifier(MOD_ID, "ruby"), new Item(new Item.Settings()));

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "ruby_group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.maxmod.ruby_group"))
                    .icon(() -> new ItemStack(RUBY))
                    .entries((displayContext, entries) -> {
                        entries.add(RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);
                    }).build());

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}