package dev.satyrn.copperhorns.mixin;

import dev.satyrn.copperhorns.CHModCommon;
import dev.satyrn.copperhorns.data.CHTags;
import dev.satyrn.copperhorns.item.CHItems;
import dev.satyrn.copperhorns.item.CopperHorn;
import net.minecraft.core.Registry;
import net.minecraft.tags.InstrumentTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.item.InstrumentItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.trading.MerchantOffers;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;

@Mixin(WanderingTrader.class)
public abstract class WanderingTraderMixin extends AbstractVillager {

    public WanderingTraderMixin(EntityType<? extends AbstractVillager> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "updateTrades", at = @At("HEAD"))
    private void copperhorns$updateTrades(CallbackInfo ci) {
        List<VillagerTrades.ItemListing> itemListings = new ArrayList<>();
        var basses = Registry.INSTRUMENT.getTagOrEmpty(CHTags.Instruments.COPPER_GOAT_HORN_BASS).iterator();
        var melodies = Registry.INSTRUMENT.getTagOrEmpty(CHTags.Instruments.COPPER_GOAT_HORN_MELODY).iterator();
        var harmonies = Registry.INSTRUMENT.getTagOrEmpty(CHTags.Instruments.COPPER_GOAT_HORN_HARMONY).iterator();

        while (basses.hasNext() && melodies.hasNext() && harmonies.hasNext()) {
            var bass = basses.next();
            var melody = melodies.next();
            var harmony = harmonies.next();

            for (net.minecraft.core.Holder<net.minecraft.world.item.Instrument> horn : Registry.INSTRUMENT.getTagOrEmpty(
                    InstrumentTags.REGULAR_GOAT_HORNS)) {
                itemListings.add((entity, randomSource) -> new MerchantOffer(
                        new ItemStack(Items.COPPER_INGOT, this.random.nextInt(1, 6)),
                        InstrumentItem.create(Items.GOAT_HORN, horn),
                        CopperHorn.create(CHItems.COPPER_GOAT_HORN.get(), bass, melody, harmony), 1, 1,
                        0.05F));
            }
        }

        if (!itemListings.isEmpty()) {
            MerchantOffers merchantOffers = this.getOffers();
            this.addOffersFromItemListings(merchantOffers, itemListings.toArray(new VillagerTrades.ItemListing[0]), this.random.nextInt(1,3));
        }
    }
}