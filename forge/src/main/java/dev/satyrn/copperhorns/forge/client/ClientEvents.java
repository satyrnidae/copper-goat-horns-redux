package dev.satyrn.copperhorns.forge.client;

import dev.satyrn.copperhorns.CopperHorns;
import dev.satyrn.copperhorns.item.ModItems;
import dev.satyrn.copperhorns.util.NotInitializable;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = CopperHorns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientEvents {
    private ClientEvents() {
        NotInitializable.staticClass(ClientEvents.class);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() ->
            ItemProperties.register(ModItems.COPPER_GOAT_HORN.get(),
                    new ResourceLocation("tooting"),
                    (stack, level, living, id) -> living != null && living.isUsingItem() && living.getUseItem() == stack ? 1 : 0));
    }
}
