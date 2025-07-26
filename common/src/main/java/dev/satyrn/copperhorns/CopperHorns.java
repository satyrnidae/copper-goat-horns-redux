package dev.satyrn.copperhorns;

import dev.satyrn.copperhorns.item.ModInstruments;
import dev.satyrn.copperhorns.item.ModItems;
import dev.satyrn.copperhorns.sound.ModSoundEvents;

public final class CopperHorns {
    public static final String MOD_ID = "copperhorns";
    public static final String MOD_FRIENDLY_NAME = "Copper Horns";

    public static void init() {
        ModSoundEvents.register();
        ModInstruments.register();
        ModItems.register();
    }
}
