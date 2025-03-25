package dev.satyrn.copperhorns.forge.data;

import dev.satyrn.copperhorns.CHModCommon;
import dev.satyrn.copperhorns.forge.data.providers.client.CHLanguageProvider;
import dev.satyrn.copperhorns.forge.data.providers.client.CHModelProvider;
import dev.satyrn.copperhorns.forge.data.providers.client.CHSoundDefinitionProvider;
import dev.satyrn.copperhorns.forge.data.providers.server.CHTagProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(modid = CHModCommon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CHDataEvents {
    @SubscribeEvent
    public static void gatherData(final @NotNull GatherDataEvent event) {
        event.getGenerator()
                .addProvider(event.includeServer(), new CHTagProvider.CHInstrumentTagProvider(event.getGenerator(),
                        event.getModContainer().getModId(), event.getExistingFileHelper()));
        event.getGenerator()
                .addProvider(event.includeClient(),
                        new CHSoundDefinitionProvider(event.getGenerator(), event.getModContainer().getModId(),
                                event.getExistingFileHelper()));
        event.getGenerator()
                .addProvider(event.includeClient(),
                        new CHLanguageProvider(event.getGenerator(), event.getModContainer().getModId()));
        event.getGenerator()
                .addProvider(event.includeClient(), new CHModelProvider.CHItemModelProvider(event.getGenerator(),
                        event.getModContainer().getModId(), event.getExistingFileHelper()));
    }
}
