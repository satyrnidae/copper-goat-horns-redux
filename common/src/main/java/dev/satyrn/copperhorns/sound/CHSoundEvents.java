package dev.satyrn.copperhorns.sound;

import com.google.common.collect.ImmutableList;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.satyrn.copperhorns.CHModCommon;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.stream.IntStream;

public class CHSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(CHModCommon.MOD_ID,
            Registry.SOUND_EVENT_REGISTRY);

    public static final ImmutableList<RegistrySupplier<SoundEvent>> HARMONY_SOUND_EVENTS = IntStream.range(0, 10)
            .mapToObj(i -> {
                final String resourceName = "item.copper_goat_horn.harmony." + i;
                return SOUND_EVENTS.register(resourceName, () -> new SoundEvent(new ResourceLocation(CHModCommon.MOD_ID, resourceName)));
            })
            .collect(ImmutableList.toImmutableList());
    public static final ImmutableList<RegistrySupplier<SoundEvent>> MELODY_SOUND_EVENTS = IntStream.range(0, 10)
            .mapToObj(i -> {
                final String resourceName = "item.copper_goat_horn.melody." + i;
                return SOUND_EVENTS.register(resourceName, () -> new SoundEvent(new ResourceLocation(CHModCommon.MOD_ID, resourceName)));
            })
            .collect(ImmutableList.toImmutableList());
    public static final ImmutableList<RegistrySupplier<SoundEvent>> BASS_SOUND_EVENTS = IntStream.range(0, 10)
            .mapToObj(i -> {
                final String resourceName = "item.copper_goat_horn.bass." + i;
                return SOUND_EVENTS.register(resourceName, () -> new SoundEvent(new ResourceLocation(CHModCommon.MOD_ID, resourceName)));
            })
            .collect(ImmutableList.toImmutableList());

    public static void register() {
        SOUND_EVENTS.register();
    }
}
