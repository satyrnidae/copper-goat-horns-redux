package dev.satyrn.copperhorns.data;

import dev.satyrn.copperhorns.CopperHorns;
import dev.satyrn.copperhorns.util.NotInitializable;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Instrument;

public final class ModInstrumentTags {
    private ModInstrumentTags() {
        NotInitializable.staticClass(ModInstrumentTags.class);
    }

    public static TagKey<Instrument> COPPER_GOAT_HORN_BASS = TagKey.create(Registry.INSTRUMENT_REGISTRY,
            new ResourceLocation(CopperHorns.MOD_ID, "copper_goat_horn/bass"));
    public static TagKey<Instrument> COPPER_GOAT_HORN_MELODY = TagKey.create(Registry.INSTRUMENT_REGISTRY,
            new ResourceLocation(CopperHorns.MOD_ID, "copper_goat_horn/melody"));
    public static TagKey<Instrument> COPPER_GOAT_HORN_HARMONY = TagKey.create(Registry.INSTRUMENT_REGISTRY,
            new ResourceLocation(CopperHorns.MOD_ID, "copper_goat_horn/harmony"));
}
