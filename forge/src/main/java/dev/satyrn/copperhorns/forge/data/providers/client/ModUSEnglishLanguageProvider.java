package dev.satyrn.copperhorns.forge.data.providers.client;

import dev.architectury.registry.registries.RegistrySupplier;
import dev.satyrn.copperhorns.CopperHorns;
import dev.satyrn.copperhorns.item.ModInstruments;
import dev.satyrn.copperhorns.item.ModItems;
import net.minecraft.Util;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Instrument;
import net.minecraftforge.common.data.LanguageProvider;
import org.jetbrains.annotations.NotNull;

public class ModUSEnglishLanguageProvider extends LanguageProvider {
    public ModUSEnglishLanguageProvider(final @NotNull DataGenerator gen, final @NotNull String modId) {
        super(gen, modId, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add(ModItems.COPPER_GOAT_HORN.get(), "Copper Goat Horn");

        this.addCopperHorns(ModInstruments.GREAT_SKY_FALLING_COPPER_HORN, "Great Sky Falling");
        this.addCopperHorns(ModInstruments.OLD_HYMN_RESTING_COPPER_HORN, "Old Hymn Resting");
        this.addCopperHorns(ModInstruments.PURE_WATER_DESIRE_COPPER_HORN, "Pure Water Desire");
        this.addCopperHorns(ModInstruments.MUMBLE_FIRE_MEMORY_COPPER_HORN, "Mumble Fire Memory");
        this.addCopperHorns(ModInstruments.DRY_URGE_ANGER_COPPER_HORN, "Dry Urge Anger");
        this.addCopperHorns(ModInstruments.CLEAR_TEMPER_JOURNEY_COPPER_HORN, "Clear Temper Journey");
        this.addCopperHorns(ModInstruments.FRESH_NEST_THOUGHT_COPPER_HORN, "Fresh Nest Thought");
        this.addCopperHorns(ModInstruments.SECRET_LAKE_TEAR_COPPER_HORN, "Secret Lake Tear");
        this.addCopperHorns(ModInstruments.FEARLESS_RIVER_GIFT_COPPER_HORN, "Fearless River Gift");
        this.addCopperHorns(ModInstruments.SWEET_MOON_LOVE_COPPER_HORN, "Sweet Moon Love");

        this.add(Util.makeDescriptionId("subtitles.item", ModItems.COPPER_GOAT_HORN.getId()) + ".play_bass",
                "Horn bassline plays");
        this.add(Util.makeDescriptionId("subtitles.item", ModItems.COPPER_GOAT_HORN.getId()) + ".play_melody",
                "Horn melody plays");
        this.add(Util.makeDescriptionId("subtitles.item", ModItems.COPPER_GOAT_HORN.getId()) + ".play_harmony",
                "Horn harmony plays");
    }

    private void addCopperHorns(ModInstruments.CopperHornInstruments instruments, String name) {
        this.add(instruments.bass(), name);
        this.add(instruments.melody(), name);
        this.add(instruments.harmony(), name);
    }

    private void add(final @NotNull RegistrySupplier<Instrument> instrument, final @NotNull String tx) {
        this.add(Util.makeDescriptionId("instrument", instrument.getId()), tx);
    }

    @Override
    public @NotNull String getName() {
        return CopperHorns.MOD_FRIENDLY_NAME + " US English Language Provider";
    }
}
