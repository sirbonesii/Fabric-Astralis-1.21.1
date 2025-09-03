package com.bonesia.astralis;

import com.bonesia.astralis.item.ModItemGroups;
import com.bonesia.astralis.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Astralis implements ModInitializer {
	public static final String MOD_ID = "astralis";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
	}
}