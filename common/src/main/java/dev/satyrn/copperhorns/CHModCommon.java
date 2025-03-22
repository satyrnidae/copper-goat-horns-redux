package dev.satyrn.copperhorns;

import dev.satyrn.copperhorns.item.CHInstruments;
import dev.satyrn.copperhorns.item.CHItems;
import dev.satyrn.copperhorns.sound.CHSoundEvents;

public final class CHModCommon {
    public static final String MOD_ID = "copperhorns";

    public static void init() {
        CHSoundEvents.register();
        CHInstruments.register();
        CHItems.register();
    }
}
