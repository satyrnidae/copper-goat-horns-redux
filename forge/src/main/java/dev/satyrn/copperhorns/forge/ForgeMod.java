package dev.satyrn.copperhorns.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.satyrn.copperhorns.CopperHorns;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(CopperHorns.MOD_ID)
public final class ForgeMod {
    public ForgeMod(final @NotNull FMLJavaModLoadingContext modLoadingContext) {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(CopperHorns.MOD_ID, modLoadingContext.getModEventBus());

        // Run our common setup.
        CopperHorns.init();
    }
}
