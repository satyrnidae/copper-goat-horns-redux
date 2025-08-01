package dev.satyrn.copperhorns.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.satyrn.copperhorns.CopperHorns;
import dev.satyrn.copperhorns.util.NotInitializable;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(CopperHorns.MOD_ID,
            Registry.ITEM_REGISTRY);

    public static final RegistrySupplier<Item> COPPER_GOAT_HORN = ITEMS.register("copper_goat_horn",
            () -> new CopperHorn(
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.UNCOMMON)));

    public ModItems() {
        NotInitializable.staticClass(ModItems.class);
    }

    public static void register() {
        ITEMS.register();
    }
}
