package dev.satyrn.copperhorns.fabric.client;

import dev.satyrn.copperhorns.fabriclike.client.CHClientFabricLike;
import net.fabricmc.api.ClientModInitializer;

public class CHClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CHClientFabricLike.onInitializeClient();
    }
}
