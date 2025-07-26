package dev.satyrn.copperhorns.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import dev.satyrn.copperhorns.fabriclike.FabricLikeMod;

public final class InitEntrypoint implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        // Run the Fabric-like setup.
        FabricLikeMod.init();
    }
}
