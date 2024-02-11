package net.blyrium.crueltyfreeslimeballs;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrueltyFreeSlimeballs implements ModInitializer {
	public static final String MOD_ID = "crueltyfreeslimeballs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Cruelty Free Slimeballs initialized.");
	}
}