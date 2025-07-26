package dev.satyrn.copperhorns.forge.data.providers.client;

import dev.satyrn.copperhorns.CopperHorns;
import dev.satyrn.copperhorns.item.ModItems;
import dev.satyrn.copperhorns.sound.ModSoundEvents;
import net.minecraft.Util;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.common.data.SoundDefinitionsProvider;
import org.jetbrains.annotations.NotNull;

public class ModSoundDefinitionProvider extends SoundDefinitionsProvider {
    /**
     * Creates a new instance of this data provider.
     *
     * @param generator The data generator instance provided by the event you are initializing this provider in.
     * @param modId     The mod ID of the current mod.
     * @param helper    The existing file helper provided by the event you are initializing this provider in.
     */
    public ModSoundDefinitionProvider(final @NotNull DataGenerator generator,
                                      final @NotNull String modId,
                                      final @NotNull ExistingFileHelper helper) {
        super(generator, modId, helper);
    }

    @Override
    public void registerSounds() {
        for (int i = 0; i < ModSoundEvents.BASS_SOUND_EVENTS.size(); i++) {
            this.add(ModSoundEvents.BASS_SOUND_EVENTS.get(i), SoundDefinition.definition()
                    .subtitle(
                            Util.makeDescriptionId("subtitles.item", ModItems.COPPER_GOAT_HORN.getId()) + ".play_bass")
                    .with(SoundDefinition.Sound.sound(
                            new ResourceLocation(CopperHorns.MOD_ID, "item/copper_goat_horn/bass" + i),
                            SoundDefinition.SoundType.SOUND).stream()));
        }

        for (int i = 0; i < ModSoundEvents.MELODY_SOUND_EVENTS.size(); i++) {
            this.add(ModSoundEvents.MELODY_SOUND_EVENTS.get(i), SoundDefinition.definition()
                    .subtitle(Util.makeDescriptionId("subtitles.item", ModItems.COPPER_GOAT_HORN.getId()) +
                            ".play_melody")
                    .with(SoundDefinition.Sound.sound(
                            new ResourceLocation(CopperHorns.MOD_ID, "item/copper_goat_horn/melody" + i),
                            SoundDefinition.SoundType.SOUND).stream()));
        }

        for (int i = 0; i < ModSoundEvents.HARMONY_SOUND_EVENTS.size(); i++) {
            this.add(ModSoundEvents.HARMONY_SOUND_EVENTS.get(i), SoundDefinition.definition()
                    .subtitle(Util.makeDescriptionId("subtitles.item", ModItems.COPPER_GOAT_HORN.getId()) +
                            ".play_harmony")
                    .with(SoundDefinition.Sound.sound(
                            new ResourceLocation(CopperHorns.MOD_ID, "item/copper_goat_horn/harmony" + i),
                            SoundDefinition.SoundType.SOUND).stream()));
        }
    }

    @Override
    public @NotNull String getName() {
        return CopperHorns.MOD_FRIENDLY_NAME + " Sound Definitions Provider";
    }
}
