package dev.satyrn.copperhorns.fabric.client;

import dev.satyrn.copperhorns.fabriclike.client.FabricLikeClientMod;
import net.fabricmc.api.ClientModInitializer;

public class ClientEntrypoint implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FabricLikeClientMod.onInitializeClient();
    }
}
