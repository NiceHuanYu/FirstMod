package com.bilibili.huanyu.tutorial;

import com.bilibili.huanyu.tutorial.block.ModBlocks;
import com.bilibili.huanyu.tutorial.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorial implements ModInitializer {
	public static final String MOD_ID = "tutorial";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.ModItemRegister();
		ModBlocks.ModBlocksRegister();
	}
}
