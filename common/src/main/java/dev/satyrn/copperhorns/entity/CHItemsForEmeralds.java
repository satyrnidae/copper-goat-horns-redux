package dev.satyrn.copperhorns.entity;

import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;

public class CHItemsForEmeralds implements VillagerTrades.ItemListing {
    private final int maxUses;
    private final int numberOfItems;
    private final int emeraldCost;
    private final ItemStack itemStack;

    public CHItemsForEmeralds(ItemStack itemStack,
                              int emeraldCost,
                              int numberOfItems,
                              int maxUses) {
        this.itemStack = itemStack;
        this.emeraldCost = emeraldCost;
        this.numberOfItems = numberOfItems;
        this.maxUses = maxUses;
    }

    @Override
    public MerchantOffer getOffer(Entity entity, RandomSource randomSource) {
        return new MerchantOffer(new ItemStack(Items.EMERALD, this.emeraldCost),
                new ItemStack(this.itemStack.getItem(), this.numberOfItems), this.maxUses, 1, 0.05F);
    }
}
