package dev.satyrn.copperhorns.forge.data.providers.client;

import dev.architectury.registry.registries.RegistrySupplier;
import dev.satyrn.copperhorns.item.CHInstruments;
import dev.satyrn.copperhorns.item.CHItems;
import net.minecraft.Util;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Instrument;
import net.minecraftforge.common.data.LanguageProvider;
import org.jetbrains.annotations.NotNull;

public class CHLanguageProvider extends LanguageProvider {
    public CHLanguageProvider(DataGenerator gen, String modid) {
        super(gen, modid, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add(CHItems.COPPER_GOAT_HORN.get(), "Copper Goat Horn");

        this.add(CHInstruments.GREAT_SKY_FALLING_COPPER_HORN.middle, "Great Sky Falling");
        this.add(CHInstruments.OLD_HYMN_RESTING_COPPER_HORN.middle, "Old Hymn Resting");
        this.add(CHInstruments.PURE_WATER_DESIRE_COPPER_HORN.middle, "Pure Water Desire");
        this.add(CHInstruments.MUMBLE_FIRE_MEMORY_COPPER_HORN.middle, "Mumble Fire Memory");
        this.add(CHInstruments.DRY_URGE_ANGER_COPPER_HORN.middle, "Dry Urge Anger");
        this.add(CHInstruments.CLEAR_TEMPER_JOURNEY_COPPER_HORN.middle, "Clear Temper Journey");
        this.add(CHInstruments.FRESH_NEST_THOUGHT_COPPER_HORN.middle, "Fresh Nest Thought");
        this.add(CHInstruments.SECRET_LAKE_TEAR_COPPER_HORN.middle, "Secret Lake Tear");
        this.add(CHInstruments.FEARLESS_RIVER_GIFT_COPPER_HORN.middle, "Fearless River Gift");
        this.add(CHInstruments.SWEET_MOON_LOVE_COPPER_HORN.middle, "Sweet Moon Love");

        this.add(Util.makeDescriptionId("subtitles.item", CHItems.COPPER_GOAT_HORN.getId()) + ".play_bass", "Horn bassline plays");
        this.add(Util.makeDescriptionId("subtitles.item", CHItems.COPPER_GOAT_HORN.getId()) + ".play_melody", "Horn melody plays");
        this.add(Util.makeDescriptionId("subtitles.item", CHItems.COPPER_GOAT_HORN.getId()) + ".play_harmony", "Horn harmony plays");
    }

    private void add(RegistrySupplier<Instrument> instrument, String tx) {
        this.add(Util.makeDescriptionId("instrument", instrument.getId()), tx);
    }

    @Override
    public @NotNull String getName() {
        return "Copper Goat Horns Language";
    }
}
