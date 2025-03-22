package dev.satyrn.copperhorns.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.satyrn.copperhorns.CHModCommon;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(CHModCommon.MOD_ID)
public final class CHModForge {
    public CHModForge(final @NotNull FMLJavaModLoadingContext modLoadingContext) {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(CHModCommon.MOD_ID, modLoadingContext.getModEventBus());

        // Run our common setup.
        CHModCommon.init();
    }
}
