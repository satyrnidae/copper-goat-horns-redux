package dev.satyrn.copperhorns.forge.data.providers.server;

import com.google.common.collect.ImmutableList;
import dev.satyrn.copperhorns.data.CHTags;
import dev.satyrn.copperhorns.item.CHInstruments;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.item.Instrument;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CHTagProvider {

    public static class CHInstrumentTagProvider extends TagsProvider<Instrument> {

        public CHInstrumentTagProvider(final @NotNull DataGenerator arg,
                                       final @NotNull String modId,
                                       final @NotNull ExistingFileHelper existingFileHelper) {
            super(arg, Registry.INSTRUMENT, modId, existingFileHelper);
        }

        @Override
        protected void addTags() {
            var triples = ImmutableList.of(
                    CHInstruments.GREAT_SKY_FALLING_COPPER_HORN,
                    CHInstruments.OLD_HYMN_RESTING_COPPER_HORN,
                    CHInstruments.PURE_WATER_DESIRE_COPPER_HORN,
                    CHInstruments.MUMBLE_FIRE_MEMORY_COPPER_HORN,
                    CHInstruments.DRY_URGE_ANGER_COPPER_HORN,
                    CHInstruments.CLEAR_TEMPER_JOURNEY_COPPER_HORN,
                    CHInstruments.FRESH_NEST_THOUGHT_COPPER_HORN,
                    CHInstruments.SECRET_LAKE_TEAR_COPPER_HORN,
                    CHInstruments.FEARLESS_RIVER_GIFT_COPPER_HORN,
                    CHInstruments.SWEET_MOON_LOVE_COPPER_HORN
            );
            for (var triple : triples) {
                this.tag(CHTags.Instruments.COPPER_GOAT_HORN_BASS).add(triple.left.get());
                this.tag(CHTags.Instruments.COPPER_GOAT_HORN_MELODY).add(triple.middle.get());
                this.tag(CHTags.Instruments.COPPER_GOAT_HORN_HARMONY).add(triple.right.get());
            }
        }

        @Override
        public @NotNull String getName() {
            return "Copper Goat Horns Item Tags";
        }
    }
}
