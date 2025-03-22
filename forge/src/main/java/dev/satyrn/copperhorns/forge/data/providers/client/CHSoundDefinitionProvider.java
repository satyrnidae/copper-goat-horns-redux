package dev.satyrn.copperhorns.forge.data.providers.client;

import dev.satyrn.copperhorns.CHModCommon;
import dev.satyrn.copperhorns.item.CHItems;
import dev.satyrn.copperhorns.sound.CHSoundEvents;
import net.minecraft.Util;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.common.data.SoundDefinitionsProvider;

public class CHSoundDefinitionProvider extends SoundDefinitionsProvider {
    /**
     * Creates a new instance of this data provider.
     *
     * @param generator The data generator instance provided by the event you are initializing this provider in.
     * @param modId     The mod ID of the current mod.
     * @param helper    The existing file helper provided by the event you are initializing this provider in.
     */
    protected CHSoundDefinitionProvider(DataGenerator generator, String modId, ExistingFileHelper helper) {
        super(generator, modId, helper);
    }

    @Override
    public void registerSounds() {
        for (int i = 0; i < CHSoundEvents.BASS_SOUND_EVENTS.size(); i++) {
            this.add(CHSoundEvents.BASS_SOUND_EVENTS.get(i), SoundDefinition.definition()
                    .subtitle(Util.makeDescriptionId("subtitles.item", CHItems.COPPER_GOAT_HORN.getId()) + ".play_bass")
                    .with(SoundDefinition.Sound.sound(
                            new ResourceLocation(CHModCommon.MOD_ID, "item/copper_goat_horn/bass" + i),
                            SoundDefinition.SoundType.SOUND).stream()));
        }

        for (int i = 0; i < CHSoundEvents.MELODY_SOUND_EVENTS.size(); i++) {
            this.add(CHSoundEvents.MELODY_SOUND_EVENTS.get(i), SoundDefinition.definition()
                    .subtitle(Util.makeDescriptionId("subtitles.item", CHItems.COPPER_GOAT_HORN.getId()) + ".play_melody")
                    .with(SoundDefinition.Sound.sound(
                            new ResourceLocation(CHModCommon.MOD_ID, "item/copper_goat_horn/melody" + i),
                            SoundDefinition.SoundType.SOUND).stream()));
        }

        for (int i = 0; i < CHSoundEvents.HARMONY_SOUND_EVENTS.size(); i++) {
            this.add(CHSoundEvents.HARMONY_SOUND_EVENTS.get(i), SoundDefinition.definition()
                    .subtitle(Util.makeDescriptionId("subtitles.item", CHItems.COPPER_GOAT_HORN.getId()) + ".play_harmony")
                    .with(SoundDefinition.Sound.sound(
                            new ResourceLocation(CHModCommon.MOD_ID, "item/copper_goat_horn/harmony" + i),
                            SoundDefinition.SoundType.SOUND).stream()));
        }
    }
}
