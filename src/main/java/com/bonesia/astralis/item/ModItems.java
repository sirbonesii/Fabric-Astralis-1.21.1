package com.bonesia.astralis.item;

import com.bonesia.astralis.Astralis;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GRAVE_SCYTHE = registerItem("grave_scythe", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Astralis.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Astralis.LOGGER.info("Registering Mod Items for " + Astralis.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
           entries.add(GRAVE_SCYTHE);
        });

    }
}
