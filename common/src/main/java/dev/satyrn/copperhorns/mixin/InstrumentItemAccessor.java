package dev.satyrn.copperhorns.mixin;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Instrument;
import net.minecraft.world.item.InstrumentItem;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(InstrumentItem.class)
public interface InstrumentItemAccessor {
    @Invoker
    static void invokePlay(Level level, Player player, Instrument instrument) {}
}
