package net.niicolabs.elementalcrops.item.Custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ConversionCrystalItem extends Item
{
    private final boolean bCanBeDamaged;
    private final boolean bCanBeDestroyed;

    public ConversionCrystalItem(Properties pProperties, int maxDurability, boolean bCanBeDamaged, boolean bCanBeDestroyed)
    {
        super(pProperties.stacksTo(1).defaultDurability(maxDurability));
        this.bCanBeDamaged = bCanBeDamaged;
        this.bCanBeDestroyed = bCanBeDestroyed;
    }

    @Override
    public Item asItem()
    {
        return this;
    }

    @Override
    public int getMaxDamage(ItemStack stack)
    {
        return super.getMaxDamage(stack);
    }

    @Override
    public boolean isDamageable(ItemStack stack)
    {
        return true;
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack)
    {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack)
    {
            var copy = itemStack.copy();

            copy.setCount(1);

            if (!this.bCanBeDamaged) { return copy; }

            copy.setDamageValue(copy.getDamageValue() + 1);

            ConversionCrystalItem temp = (ConversionCrystalItem) itemStack.getItem();

            if (copy.getDamageValue() > itemStack.getMaxDamage() ||  ((ConversionCrystalItem) itemStack.getItem()).bCanBeDestroyed)
            {
                return ItemStack.EMPTY;
            }

            isBarVisible(itemStack);
            return copy;
    }
}

