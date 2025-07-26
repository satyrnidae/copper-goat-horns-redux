package dev.satyrn.copperhorns.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.satyrn.copperhorns.CopperHorns;
import dev.satyrn.copperhorns.sound.ModSoundEvents;
import dev.satyrn.copperhorns.util.NotInitializable;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Instrument;

public final class ModInstruments {
    public static final DeferredRegister<Instrument> INSTRUMENTS = DeferredRegister.create(CopperHorns.MOD_ID,
            Registry.INSTRUMENT_REGISTRY);

    public static final CopperHornInstruments SWEET_MOON_LOVE_COPPER_HORN;
    public static final CopperHornInstruments FEARLESS_RIVER_GIFT_COPPER_HORN;
    public static final CopperHornInstruments SECRET_LAKE_TEAR_COPPER_HORN;
    public static final CopperHornInstruments FRESH_NEST_THOUGHT_COPPER_HORN;
    public static final CopperHornInstruments CLEAR_TEMPER_JOURNEY_COPPER_HORN;
    public static final CopperHornInstruments DRY_URGE_ANGER_COPPER_HORN;
    public static final CopperHornInstruments MUMBLE_FIRE_MEMORY_COPPER_HORN;
    public static final CopperHornInstruments PURE_WATER_DESIRE_COPPER_HORN;
    public static final CopperHornInstruments OLD_HYMN_RESTING_COPPER_HORN;
    public static final CopperHornInstruments GREAT_SKY_FALLING_COPPER_HORN;

    private static final int COPPER_HORN_USE_TICKS = 80;  // Four seconds

    static {
        SWEET_MOON_LOVE_COPPER_HORN = new CopperHornInstruments(INSTRUMENTS.register("sweet_moon_love_bass",
                () -> new Instrument(ModSoundEvents.BASS_SOUND_EVENTS.get(9).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("sweet_moon_love_melody",
                        () -> new Instrument(ModSoundEvents.MELODY_SOUND_EVENTS.get(9).get(), COPPER_HORN_USE_TICKS,
                                256.0F)), INSTRUMENTS.register("sweet_moon_love_harmony",
                () -> new Instrument(ModSoundEvents.HARMONY_SOUND_EVENTS.get(9).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        FEARLESS_RIVER_GIFT_COPPER_HORN = new CopperHornInstruments(INSTRUMENTS.register("fearless_river_gift_bass",
                () -> new Instrument(ModSoundEvents.BASS_SOUND_EVENTS.get(8).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("fearless_river_gift_melody",
                        () -> new Instrument(ModSoundEvents.MELODY_SOUND_EVENTS.get(8).get(), COPPER_HORN_USE_TICKS,
                                256.0F)), INSTRUMENTS.register("fearless_river_gift_harmony",
                () -> new Instrument(ModSoundEvents.HARMONY_SOUND_EVENTS.get(8).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        SECRET_LAKE_TEAR_COPPER_HORN = new CopperHornInstruments(INSTRUMENTS.register("secret_lake_tear_bass",
                () -> new Instrument(ModSoundEvents.BASS_SOUND_EVENTS.get(7).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("secret_lake_tear_melody",
                        () -> new Instrument(ModSoundEvents.MELODY_SOUND_EVENTS.get(7).get(), COPPER_HORN_USE_TICKS,
                                256.0F)), INSTRUMENTS.register("secret_lake_tear_harmony",
                () -> new Instrument(ModSoundEvents.HARMONY_SOUND_EVENTS.get(7).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        FRESH_NEST_THOUGHT_COPPER_HORN = new CopperHornInstruments(INSTRUMENTS.register("fresh_nest_thought_bass",
                () -> new Instrument(ModSoundEvents.BASS_SOUND_EVENTS.get(6).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("fresh_nest_thought_melody",
                        () -> new Instrument(ModSoundEvents.MELODY_SOUND_EVENTS.get(6).get(), COPPER_HORN_USE_TICKS,
                                256.0F)), INSTRUMENTS.register("fresh_nest_thought_harmony",
                () -> new Instrument(ModSoundEvents.HARMONY_SOUND_EVENTS.get(6).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        CLEAR_TEMPER_JOURNEY_COPPER_HORN = new CopperHornInstruments(INSTRUMENTS.register("clear_temper_journey_bass",
                () -> new Instrument(ModSoundEvents.BASS_SOUND_EVENTS.get(5).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("clear_temper_journey_melody",
                        () -> new Instrument(ModSoundEvents.MELODY_SOUND_EVENTS.get(5).get(), COPPER_HORN_USE_TICKS,
                                256.0F)), INSTRUMENTS.register("clear_temper_journey_harmony",
                () -> new Instrument(ModSoundEvents.HARMONY_SOUND_EVENTS.get(5).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        DRY_URGE_ANGER_COPPER_HORN = new CopperHornInstruments(INSTRUMENTS.register("dry_urge_anger_bass",
                () -> new Instrument(ModSoundEvents.BASS_SOUND_EVENTS.get(4).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("dry_urge_anger_melody",
                        () -> new Instrument(ModSoundEvents.MELODY_SOUND_EVENTS.get(4).get(), COPPER_HORN_USE_TICKS,
                                256.0F)), INSTRUMENTS.register("dry_urge_anger_harmony",
                () -> new Instrument(ModSoundEvents.HARMONY_SOUND_EVENTS.get(4).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        MUMBLE_FIRE_MEMORY_COPPER_HORN = new CopperHornInstruments(INSTRUMENTS.register("mumble_fire_memory_bass",
                () -> new Instrument(ModSoundEvents.BASS_SOUND_EVENTS.get(3).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("mumble_fire_memory_melody",
                        () -> new Instrument(ModSoundEvents.MELODY_SOUND_EVENTS.get(3).get(), COPPER_HORN_USE_TICKS,
                                256.0F)), INSTRUMENTS.register("mumble_fire_memory_harmony",
                () -> new Instrument(ModSoundEvents.HARMONY_SOUND_EVENTS.get(3).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        PURE_WATER_DESIRE_COPPER_HORN = new CopperHornInstruments(INSTRUMENTS.register("pure_water_desire_bass",
                () -> new Instrument(ModSoundEvents.BASS_SOUND_EVENTS.get(2).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("pure_water_desire_melody",
                        () -> new Instrument(ModSoundEvents.MELODY_SOUND_EVENTS.get(2).get(), COPPER_HORN_USE_TICKS,
                                256.0F)), INSTRUMENTS.register("pure_water_desire_harmony",
                () -> new Instrument(ModSoundEvents.HARMONY_SOUND_EVENTS.get(2).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        OLD_HYMN_RESTING_COPPER_HORN = new CopperHornInstruments(INSTRUMENTS.register("old_hymn_resting_bass",
                () -> new Instrument(ModSoundEvents.BASS_SOUND_EVENTS.get(1).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("old_hymn_resting_melody",
                        () -> new Instrument(ModSoundEvents.MELODY_SOUND_EVENTS.get(1).get(), COPPER_HORN_USE_TICKS,
                                256.0F)), INSTRUMENTS.register("old_hymn_resting_harmony",
                () -> new Instrument(ModSoundEvents.HARMONY_SOUND_EVENTS.get(1).get(), COPPER_HORN_USE_TICKS, 256.0F)));
        GREAT_SKY_FALLING_COPPER_HORN = new CopperHornInstruments(INSTRUMENTS.register("great_sky_falling_bass",
                () -> new Instrument(ModSoundEvents.BASS_SOUND_EVENTS.get(0).get(), COPPER_HORN_USE_TICKS, 256.0F)),
                INSTRUMENTS.register("great_sky_falling_melody",
                        () -> new Instrument(ModSoundEvents.MELODY_SOUND_EVENTS.get(0).get(), COPPER_HORN_USE_TICKS,
                                256.0F)), INSTRUMENTS.register("great_sky_falling_harmony",
                () -> new Instrument(ModSoundEvents.HARMONY_SOUND_EVENTS.get(0).get(), COPPER_HORN_USE_TICKS, 256.0F)));
    }

    private ModInstruments() {
        NotInitializable.staticClass(ModInstruments.class);
    }

    public static void register() {
        INSTRUMENTS.register();
    }

    public record CopperHornInstruments(RegistrySupplier<Instrument> bass, RegistrySupplier<Instrument> melody,
                                        RegistrySupplier<Instrument> harmony) {
    }
}
