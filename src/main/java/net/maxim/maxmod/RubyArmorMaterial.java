package net.maxim.maxmod;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public enum RubyArmorMaterial implements ArmorMaterial {
    INSTANCE;

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3}; // Как у алмаза

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * 35;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_VALUES[type.ordinal()];
    }

    @Override
    public int getEnchantability() { return 15; }

    @Override
    public SoundEvent getEquipSound() { return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND; }

    @Override
    public Ingredient getRepairIngredient() { return Ingredient.ofItems(Maxmod.RUBY); }

    @Override
    public String getName() { return "ruby"; }

    @Override
    public float getToughness() { return 2.0F; }

    @Override
    public float getKnockbackResistance() { return 0.0F; }
}