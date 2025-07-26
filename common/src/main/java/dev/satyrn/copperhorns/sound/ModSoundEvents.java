package dev.satyrn.copperhorns.sound;

import com.google.common.collect.ImmutableList;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.satyrn.copperhorns.CopperHorns;
import dev.satyrn.copperhorns.util.NotInitializable;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.stream.IntStream;

public final class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(CopperHorns.MOD_ID,
            Registry.SOUND_EVENT_REGISTRY);

    public static final ImmutableList<RegistrySupplier<SoundEvent>> HARMONY_SOUND_EVENTS;
    public static final ImmutableList<RegistrySupplier<SoundEvent>> MELODY_SOUND_EVENTS;
    public static final ImmutableList<RegistrySupplier<SoundEvent>> BASS_SOUND_EVENTS;

    static {
        HARMONY_SOUND_EVENTS = registerHornSoundEvents("harmony");
        MELODY_SOUND_EVENTS = registerHornSoundEvents("melody");
        BASS_SOUND_EVENTS = registerHornSoundEvents("bass");
    }

    private ModSoundEvents() {
        NotInitializable.staticClass(ModSoundEvents.class);
    }

    private static ImmutableList<RegistrySupplier<SoundEvent>> registerHornSoundEvents(final String type) {
        return IntStream.range(0, 10).mapToObj(i -> {
            final String resourceName = "item.copper_goat_horn." + type + "." + i;
            return SOUND_EVENTS.register(resourceName,
                    () -> new SoundEvent(new ResourceLocation(CopperHorns.MOD_ID, resourceName)));
        }).collect(ImmutableList.toImmutableList());
    }

    public static void register() {
        SOUND_EVENTS.register();
    }
}
