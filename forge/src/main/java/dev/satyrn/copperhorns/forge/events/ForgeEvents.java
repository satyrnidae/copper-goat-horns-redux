package dev.satyrn.copperhorns.forge.events;

import dev.satyrn.copperhorns.CopperHorns;
import dev.satyrn.copperhorns.item.trading.CopperHornListing;
import dev.satyrn.copperhorns.util.NotInitializable;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CopperHorns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ForgeEvents {
    private ForgeEvents() {
        NotInitializable.staticClass(ForgeEvents.class);
    }

    @SubscribeEvent
    static void onVillagerTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.SHEPHERD) {
            // Add copper horn to shepherd iv trades
            event.getTrades().get(4).add(new CopperHornListing());
        }
    }
}
