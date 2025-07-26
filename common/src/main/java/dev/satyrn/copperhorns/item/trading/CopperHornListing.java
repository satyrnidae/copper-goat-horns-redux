package dev.satyrn.copperhorns.item.trading;

import com.google.common.collect.ImmutableList;
import dev.satyrn.copperhorns.data.ModInstrumentTags;
import dev.satyrn.copperhorns.item.CopperHorn;
import dev.satyrn.copperhorns.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.tags.InstrumentTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Instrument;
import net.minecraft.world.item.InstrumentItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CopperHornListing implements VillagerTrades.ItemListing {
    @Override
    public @Nullable MerchantOffer getOffer(Entity entity, RandomSource randomSource) {
        final List<Holder<Instrument>> upgradeHorns = ImmutableList.copyOf(
                Registry.INSTRUMENT.getTagOrEmpty(InstrumentTags.REGULAR_GOAT_HORNS));
        var basses = ImmutableList.copyOf(
                Registry.INSTRUMENT.getTagOrEmpty(ModInstrumentTags.COPPER_GOAT_HORN_BASS));
        var melodies = ImmutableList.copyOf(
                Registry.INSTRUMENT.getTagOrEmpty(ModInstrumentTags.COPPER_GOAT_HORN_MELODY));
        var harmonies = ImmutableList.copyOf(
                Registry.INSTRUMENT.getTagOrEmpty(ModInstrumentTags.COPPER_GOAT_HORN_HARMONY));
        var instrumentsCount = Math.min(basses.size(), Math.min(melodies.size(), harmonies.size()));
        var instrumentIdx = randomSource.nextInt(instrumentsCount);

        return new MerchantOffer(new ItemStack(Items.COPPER_INGOT, randomSource.nextInt(1, 6)),
                InstrumentItem.create(Items.GOAT_HORN, upgradeHorns.get(randomSource.nextInt(upgradeHorns.size()))),
                CopperHorn.create(ModItems.COPPER_GOAT_HORN.get(), basses.get(instrumentIdx),
                        melodies.get(instrumentIdx), harmonies.get(instrumentIdx)), 1, 0, 0.05F);
    }
}
