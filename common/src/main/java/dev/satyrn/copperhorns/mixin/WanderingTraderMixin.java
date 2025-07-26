package dev.satyrn.copperhorns.mixin;

import dev.satyrn.copperhorns.item.trading.CopperHornListing;
import dev.satyrn.copperhorns.util.NotInitializable;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.item.trading.MerchantOffers;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Collections;

@Mixin(WanderingTrader.class)
public abstract class WanderingTraderMixin extends AbstractVillager {
    public WanderingTraderMixin(EntityType<? extends AbstractVillager> entityType, Level level) {
        super(entityType, level);
        NotInitializable.mixinClass(WanderingTraderMixin.class);
    }

    @Inject(method = "updateTrades", at = @At("HEAD"))
    private void copperHorns$updateTrades(CallbackInfo ci) {
        MerchantOffers merchantOffers = this.getOffers();
        this.addOffersFromItemListings(merchantOffers,
                Collections.nCopies(3, new CopperHornListing()).toArray(new VillagerTrades.ItemListing[0]),
                this.random.nextInt(1, 3));
    }
}