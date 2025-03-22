package dev.satyrn.copperhorns.data;

import dev.satyrn.copperhorns.CHModCommon;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Instrument;

public class CHTags {

    public interface Instruments {
        TagKey<Instrument> COPPER_GOAT_HORN_BASS = TagKey.create(Registry.INSTRUMENT_REGISTRY,
                new ResourceLocation(CHModCommon.MOD_ID, "copper_goat_horn/bass"));
        TagKey<Instrument> COPPER_GOAT_HORN_MELODY = TagKey.create(Registry.INSTRUMENT_REGISTRY,
                new ResourceLocation(CHModCommon.MOD_ID, "copper_goat_horn/melody"));
        TagKey<Instrument> COPPER_GOAT_HORN_HARMONY = TagKey.create(Registry.INSTRUMENT_REGISTRY,
                new ResourceLocation(CHModCommon.MOD_ID, "copper_goat_horn/harmony"));
    }
}
