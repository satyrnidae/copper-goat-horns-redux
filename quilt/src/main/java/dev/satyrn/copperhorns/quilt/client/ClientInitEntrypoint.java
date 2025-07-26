package dev.satyrn.copperhorns.quilt.client;

import dev.satyrn.copperhorns.fabriclike.client.FabricLikeClientMod;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.minecraft.ClientOnly;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

@ClientOnly
public class ClientInitEntrypoint implements ClientModInitializer {
    @Override
    public void onInitializeClient(ModContainer mod) {
        FabricLikeClientMod.onInitializeClient();
    }
}
