package dev.satyrn.copperhorns.forge.data.providers.server;

import com.google.common.collect.ImmutableList;
import dev.satyrn.copperhorns.data.ModInstrumentTags;
import dev.satyrn.copperhorns.item.ModInstruments;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.item.Instrument;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

public class ModInstrumentTagProvider extends TagsProvider<Instrument> {

    public ModInstrumentTagProvider(final @NotNull DataGenerator arg,
                                    final @NotNull String modId,
                                    final @NotNull ExistingFileHelper existingFileHelper) {
        super(arg, Registry.INSTRUMENT, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        var instruments = ImmutableList.of(ModInstruments.GREAT_SKY_FALLING_COPPER_HORN,
                ModInstruments.OLD_HYMN_RESTING_COPPER_HORN, ModInstruments.PURE_WATER_DESIRE_COPPER_HORN,
                ModInstruments.MUMBLE_FIRE_MEMORY_COPPER_HORN, ModInstruments.DRY_URGE_ANGER_COPPER_HORN,
                ModInstruments.CLEAR_TEMPER_JOURNEY_COPPER_HORN, ModInstruments.FRESH_NEST_THOUGHT_COPPER_HORN,
                ModInstruments.SECRET_LAKE_TEAR_COPPER_HORN, ModInstruments.FEARLESS_RIVER_GIFT_COPPER_HORN,
                ModInstruments.SWEET_MOON_LOVE_COPPER_HORN);
        for (var instrument : instruments) {
            this.tag(ModInstrumentTags.COPPER_GOAT_HORN_BASS).add(instrument.bass().get());
            this.tag(ModInstrumentTags.COPPER_GOAT_HORN_MELODY).add(instrument.melody().get());
            this.tag(ModInstrumentTags.COPPER_GOAT_HORN_HARMONY).add(instrument.harmony().get());
        }
    }

    @Override
    public @NotNull String getName() {
        return "Copper Goat Horns Item Tags";
    }
}
