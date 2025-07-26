package dev.satyrn.copperhorns.fabriclike;

import dev.satyrn.copperhorns.CopperHorns;
import dev.satyrn.copperhorns.item.trading.CopperHornListing;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.world.entity.npc.VillagerProfession;

public final class FabricLikeMod {
    public static void init() {
        // Run our common setup.
        CopperHorns.init();

        // Register trade offers
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4,
                itemListings -> itemListings.add(new CopperHornListing()));
    }
}
