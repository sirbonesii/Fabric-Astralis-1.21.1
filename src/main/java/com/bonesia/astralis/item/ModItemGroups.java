package com.bonesia.astralis.item;

import com.bonesia.astralis.Astralis;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GRAVE_SCYTHE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Astralis.MOD_ID, "grave_scythe_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GRAVE_SCYTHE))
                    .displayName(Text.translatable("itemgroup.astralis.grave_scythe_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GRAVE_SCYTHE);
                    }).build());


    public static void registerItemGroups() {
        Astralis.LOGGER.info("Registering Item Groups for " + Astralis.MOD_ID);
    }
}