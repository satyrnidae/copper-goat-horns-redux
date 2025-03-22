package dev.satyrn.copperhorns.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.satyrn.copperhorns.CHModCommon;
import dev.satyrn.copperhorns.sound.CHSoundEvents;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Instrument;
import org.apache.commons.lang3.tuple.ImmutableTriple;

public class CHInstruments {
    public static final DeferredRegister<Instrument> INSTRUMENTS = DeferredRegister.create(CHModCommon.MOD_ID,
            Registry.INSTRUMENT_REGISTRY);

    public static final ImmutableTriple<RegistrySupplier<Instrument>, RegistrySupplier<Instrument>, RegistrySupplier<Instrument>> SWEET_MOON_LOVE_COPPER_HORN;
    public static final ImmutableTriple<RegistrySupplier<Instrument>, RegistrySupplier<Instrument>, RegistrySupplier<Instrument>> FEARLESS_RIVER_GIFT_COPPER_HORN;
    public static final ImmutableTriple<RegistrySupplier<Instrument>, RegistrySupplier<Instrument>, RegistrySupplier<Instrument>> SECRET_LAKE_TEAR_COPPER_HORN;
    public static final ImmutableTriple<RegistrySupplier<Instrument>, RegistrySupplier<Instrument>, RegistrySupplier<Instrument>> FRESH_NEST_THOUGHT_COPPER_HORN;
    public static final ImmutableTriple<RegistrySupplier<Instrument>, RegistrySupplier<Instrument>, RegistrySupplier<Instrument>> CLEAR_TEMPER_JOURNEY_COPPER_HORN;
    public static final ImmutableTriple<RegistrySupplier<Instrument>, RegistrySupplier<Instrument>, RegistrySupplier<Instrument>> DRY_URGE_ANGER_COPPER_HORN;
    public static final ImmutableTriple<RegistrySupplier<Instrument>, RegistrySupplier<Instrument>, RegistrySupplier<Instrument>> MUMBLE_FIRE_MEMORY_COPPER_HORN;
    public static final ImmutableTriple<RegistrySupplier<Instrument>, RegistrySupplier<Instrument>, RegistrySupplier<Instrument>> PURE_WATER_DESIRE_COPPER_HORN;
    public static final ImmutableTriple<RegistrySupplier<Instrument>, RegistrySupplier<Instrument>, RegistrySupplier<Instrument>> OLD_HYMN_RESTING_COPPER_HORN;
    public static final ImmutableTriple<RegistrySupplier<Instrument>, RegistrySupplier<Instrument>, RegistrySupplier<Instrument>> GREAT_SKY_FALLING_COPPER_HORN;

    private static final int COPPER_HORN_USE_TICKS = 80;  // Four seconds

    static {
        SWEET_MOON_LOVE_COPPER_HORN = new ImmutableTriple<>(
                INSTRUMENTS.register("sweet_moon_love_bass",
                        () -> new Instrument(CHSoundEvents.BASS_SOUND_EVENTS.get(9).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("sweet_moon_love_melody",
                        () -> new Instrument(CHSoundEvents.MELODY_SOUND_EVENTS.get(9).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("sweet_moon_love_harmony",
                        () -> new Instrument(CHSoundEvents.HARMONY_SOUND_EVENTS.get(9).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        FEARLESS_RIVER_GIFT_COPPER_HORN = new ImmutableTriple<>(
                INSTRUMENTS.register("fearless_river_gift_bass",
                        () -> new Instrument(CHSoundEvents.BASS_SOUND_EVENTS.get(8).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("fearless_river_gift_melody",
                        () -> new Instrument(CHSoundEvents.MELODY_SOUND_EVENTS.get(8).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("fearless_river_gift_harmony",
                        () -> new Instrument(CHSoundEvents.HARMONY_SOUND_EVENTS.get(8).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        SECRET_LAKE_TEAR_COPPER_HORN = new ImmutableTriple<>(
                INSTRUMENTS.register("secret_lake_tear_bass",
                        () -> new Instrument(CHSoundEvents.BASS_SOUND_EVENTS.get(7).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("secret_lake_tear_melody",
                        () -> new Instrument(CHSoundEvents.MELODY_SOUND_EVENTS.get(7).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("secret_lake_tear_harmony",
                        () -> new Instrument(CHSoundEvents.HARMONY_SOUND_EVENTS.get(7).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        FRESH_NEST_THOUGHT_COPPER_HORN = new ImmutableTriple<>(
                INSTRUMENTS.register("fresh_nest_thought_bass",
                        () -> new Instrument(CHSoundEvents.BASS_SOUND_EVENTS.get(6).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("fresh_nest_thought_melody",
                        () -> new Instrument(CHSoundEvents.MELODY_SOUND_EVENTS.get(6).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("fresh_nest_thought_harmony",
                        () -> new Instrument(CHSoundEvents.HARMONY_SOUND_EVENTS.get(6).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        CLEAR_TEMPER_JOURNEY_COPPER_HORN = new ImmutableTriple<>(
            INSTRUMENTS.register("clear_temper_journey_bass",
                    () -> new Instrument(CHSoundEvents.BASS_SOUND_EVENTS.get(5).get(), COPPER_HORN_USE_TICKS, 256.0F)),
            INSTRUMENTS.register("clear_temper_journey_melody",
                    () -> new Instrument(CHSoundEvents.MELODY_SOUND_EVENTS.get(5).get(), COPPER_HORN_USE_TICKS, 256.0F)),
            INSTRUMENTS.register("clear_temper_journey_harmony",
                    () -> new Instrument(CHSoundEvents.HARMONY_SOUND_EVENTS.get(5).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        DRY_URGE_ANGER_COPPER_HORN = new ImmutableTriple<>(
                INSTRUMENTS.register("dry_urge_anger_bass",
                        () -> new Instrument(CHSoundEvents.BASS_SOUND_EVENTS.get(4).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("dry_urge_anger_melody",
                        () -> new Instrument(CHSoundEvents.MELODY_SOUND_EVENTS.get(4).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("dry_urge_anger_harmony",
                        () -> new Instrument(CHSoundEvents.HARMONY_SOUND_EVENTS.get(4).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        MUMBLE_FIRE_MEMORY_COPPER_HORN = new ImmutableTriple<>(
                INSTRUMENTS.register("mumble_fire_memory_bass",
                        () -> new Instrument(CHSoundEvents.BASS_SOUND_EVENTS.get(3).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("mumble_fire_memory_melody",
                        () -> new Instrument(CHSoundEvents.MELODY_SOUND_EVENTS.get(3).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("mumble_fire_memory_harmony",
                        () -> new Instrument(CHSoundEvents.HARMONY_SOUND_EVENTS.get(3).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        PURE_WATER_DESIRE_COPPER_HORN = new ImmutableTriple<>(
            INSTRUMENTS.register("pure_water_desire_bass",
                    () -> new Instrument(CHSoundEvents.BASS_SOUND_EVENTS.get(2).get(), COPPER_HORN_USE_TICKS, 256.0F)),
            INSTRUMENTS.register("pure_water_desire_melody",
                    () -> new Instrument(CHSoundEvents.MELODY_SOUND_EVENTS.get(2).get(), COPPER_HORN_USE_TICKS, 256.0F)),
            INSTRUMENTS.register("pure_water_desire_harmony",
                    () -> new Instrument(CHSoundEvents.HARMONY_SOUND_EVENTS.get(2).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        OLD_HYMN_RESTING_COPPER_HORN = new ImmutableTriple<>(
                INSTRUMENTS.register("old_hymn_resting_bass",
                        () -> new Instrument(CHSoundEvents.BASS_SOUND_EVENTS.get(1).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("old_hymn_resting_melody",
                        () -> new Instrument(CHSoundEvents.MELODY_SOUND_EVENTS.get(1).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("old_hymn_resting_harmony",
                        () -> new Instrument(CHSoundEvents.HARMONY_SOUND_EVENTS.get(1).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        GREAT_SKY_FALLING_COPPER_HORN = new ImmutableTriple<>(
                INSTRUMENTS.register("great_sky_falling_bass",
                        () -> new Instrument(CHSoundEvents.BASS_SOUND_EVENTS.get(0).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("great_sky_falling_melody",
                        () -> new Instrument(CHSoundEvents.MELODY_SOUND_EVENTS.get(0).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("great_sky_falling_harmony",
                        () -> new Instrument(CHSoundEvents.HARMONY_SOUND_EVENTS.get(0).get(), COPPER_HORN_USE_TICKS, 256.0F)));
    }

    public static void register() {
        INSTRUMENTS.register();
    }
}
