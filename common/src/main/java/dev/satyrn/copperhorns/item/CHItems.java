package dev.satyrn.copperhorns.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.satyrn.copperhorns.CHModCommon;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class CHItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(CHModCommon.MOD_ID, Registry.ITEM_REGISTRY);

    public static final RegistrySupplier<Item> COPPER_GOAT_HORN = ITEMS.register("copper_goat_horn", () -> new CopperHorn(new Item.Properties().tab(
            CreativeModeTab.TAB_MISC).stacksTo(1).rarity(
            Rarity.UNCOMMON)));

    public static void register() {
        ITEMS.register();
    }
}
