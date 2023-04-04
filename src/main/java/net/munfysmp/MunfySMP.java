package net.munfysmp;

import net.fabricmc.api.ModInitializer;

import net.munfysmp.block.MunfySMPBlocks;
import net.munfysmp.items.MunfySMPGroups;
import net.munfysmp.items.MunfySMPItems;
import net.munfysmp.painting.MunfySMPPaintings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MunfySMP implements ModInitializer {
	public static final String MOD_ID = "munfysmp";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MunfySMPBlocks.registerModBlocks();
		MunfySMPPaintings.registerPaintings();
		MunfySMPItems.registerModItems();

		LOGGER.info("MunfySMPLib Installed!");
	}
}