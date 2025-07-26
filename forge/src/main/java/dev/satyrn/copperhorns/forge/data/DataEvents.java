package dev.satyrn.copperhorns.forge.data;

import dev.satyrn.copperhorns.CopperHorns;
import dev.satyrn.copperhorns.forge.data.providers.client.ModItemModelProvider;
import dev.satyrn.copperhorns.forge.data.providers.client.ModSoundDefinitionProvider;
import dev.satyrn.copperhorns.forge.data.providers.client.ModUSEnglishLanguageProvider;
import dev.satyrn.copperhorns.forge.data.providers.server.ModInstrumentTagProvider;
import dev.satyrn.copperhorns.util.NotInitializable;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(modid = CopperHorns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataEvents {
    private DataEvents() {
        NotInitializable.staticClass(DataEvents.class);
    }

    @SubscribeEvent
    public static void gatherData(final @NotNull GatherDataEvent event) {
        final var generator = event.getGenerator();
        final var modId = event.getModContainer().getModId();
        final var existingFilesHelper = event.getExistingFileHelper();

        if (event.includeServer()) {
            generator.addProvider(true, new ModInstrumentTagProvider(generator, modId, existingFilesHelper));
        }
        if (event.includeClient()) {
            generator.addProvider(true, new ModSoundDefinitionProvider(generator, modId, existingFilesHelper));
            generator.addProvider(true, new ModUSEnglishLanguageProvider(generator, modId));
            generator.addProvider(true, new ModItemModelProvider(generator, modId, existingFilesHelper));
        }
    }
}
