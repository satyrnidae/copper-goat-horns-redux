package dev.satyrn.copperhorns.fabric;

import net.fabricmc.api.ModInitializer;

import dev.satyrn.copperhorns.fabriclike.CHModFabricLike;

public final class CHModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run the Fabric-like setup.
        CHModFabricLike.init();
    }
}
