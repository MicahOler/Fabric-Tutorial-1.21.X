package net.micah.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.micah.tutorialmod.block.ModBlocks;
import net.micah.tutorialmod.item.ModItemGroups;
import net.micah.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}