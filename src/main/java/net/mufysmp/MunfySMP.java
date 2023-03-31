package net.mufysmp;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MunfySMP implements ModInitializer {
	public static final String MOD_ID = "munfysmp-lib";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("MunfySMPLib Installed!");
	}
}