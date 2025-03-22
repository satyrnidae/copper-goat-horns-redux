package dev.satyrn.copperhorns.item;

import dev.satyrn.copperhorns.data.CHTags;
import dev.satyrn.copperhorns.mixin.InstrumentItemAccessor;
import net.minecraft.core.Holder;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Optional;

public class CopperHorn extends InstrumentItem {
    public CopperHorn(Properties properties) {
        super(properties, CHTags.Instruments.COPPER_GOAT_HORN_MELODY);
    }

    @Override
    public void fillItemCategory(final @NotNull CreativeModeTab creativeModeTab,
                                 final @NotNull NonNullList<ItemStack> nonNullList) {
        if (this.allowedIn(creativeModeTab)) {
            var basses = Registry.INSTRUMENT.getTagOrEmpty(CHTags.Instruments.COPPER_GOAT_HORN_BASS).iterator();
            var melodies = Registry.INSTRUMENT.getTagOrEmpty(CHTags.Instruments.COPPER_GOAT_HORN_MELODY).iterator();
            var harmonies = Registry.INSTRUMENT.getTagOrEmpty(CHTags.Instruments.COPPER_GOAT_HORN_HARMONY).iterator();

            while (basses.hasNext() && melodies.hasNext() && harmonies.hasNext()) {
                var bass = basses.next();
                var melody = melodies.next();
                var harmony = harmonies.next();
                nonNullList.add(create(CHItems.COPPER_GOAT_HORN.get(), bass, melody, harmony));
            }
        }
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(final @NotNull Level level,
                                                           final @NotNull Player player,
                                                           final @NotNull InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        Optional<Holder<Instrument>> optional = this.getInstrument(player, itemStack);
        if (optional.isPresent()) {
            Instrument instrument = (Instrument) ((Holder<?>) optional.get()).value();
            player.startUsingItem(interactionHand);
            InstrumentItemAccessor.invokePlay(level, player, instrument);
            player.getCooldowns().addCooldown(this, instrument.useDuration());
            return InteractionResultHolder.consume(itemStack);
        } else {
            return InteractionResultHolder.fail(itemStack);
        }
    }

    private @NotNull Optional<Holder<Instrument>> getInstrument(final @NotNull Player player,
                                                                final @NotNull ItemStack itemStack) {
        CompoundTag compoundTag = itemStack.getTag();
        if (compoundTag != null) {
            ResourceLocation resourceLocation = ResourceLocation.tryParse(compoundTag.getString("instrument"));
            if (player.isCrouching()) {
                resourceLocation = ResourceLocation.tryParse(compoundTag.getString("bass"));
            } else if (player.getXRot() < -15F) {
                resourceLocation = ResourceLocation.tryParse(compoundTag.getString("harmony"));
            }

            if (resourceLocation != null) {
                return Registry.INSTRUMENT.getHolder(
                        ResourceKey.create(Registry.INSTRUMENT_REGISTRY, resourceLocation));
            }
        }

        Iterator<Holder<Instrument>> iterator = Registry.INSTRUMENT.getTagOrEmpty(
                CHTags.Instruments.COPPER_GOAT_HORN_MELODY).iterator();
        return iterator.hasNext() ? Optional.of(iterator.next()) : Optional.empty();
    }

    public static @NotNull ItemStack create(final @NotNull Item item,
                                            final @NotNull Holder<Instrument> bass,
                                            final @NotNull Holder<Instrument> melody,
                                            final @NotNull Holder<Instrument> harmony) {
        ItemStack itemStack = new ItemStack(item);
        setSoundVariantIds(itemStack, bass, melody, harmony);
        return itemStack;
    }

    private static void setSoundVariantIds(final @NotNull ItemStack itemStack,
                                           final @NotNull Holder<Instrument> bass,
                                           final @NotNull Holder<Instrument> melody,
                                           final @NotNull Holder<Instrument> harmony) {
        CompoundTag compoundTag = itemStack.getOrCreateTag();
        compoundTag.putString("instrument",
                (melody.unwrapKey().orElseThrow(() -> new IllegalStateException("Invalid instrument"))).location()
                        .toString());
        compoundTag.putString("bass",
                (bass.unwrapKey().orElseThrow(() -> new IllegalStateException("Invalid instrument"))).location()
                        .toString());
        compoundTag.putString("harmony",
                (harmony.unwrapKey().orElseThrow(() -> new IllegalStateException("Invalid instrument"))).location()
                        .toString());
    }
}
