package dev.satyrn.copperhorns.quilt.client;

import dev.satyrn.copperhorns.fabriclike.client.CHClientFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.minecraft.ClientOnly;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

@ClientOnly
public class CHClientQuilt implements ClientModInitializer {
    @Override
    public void onInitializeClient(ModContainer mod) {
        CHClientFabricLike.onInitializeClient();
    }
}
