package dev.satyrn.copperhorns.fabriclike.client;

import dev.satyrn.copperhorns.item.CHItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class CHClientFabricLike {
    public static void onInitializeClient() {
        ItemProperties.register(CHItems.COPPER_GOAT_HORN.get(),
                new ResourceLocation("tooting"),
                (stack, level, living, id) -> living != null && living.isUsingItem() && living.getUseItem() == stack ? 1 : 0);
    }
}
