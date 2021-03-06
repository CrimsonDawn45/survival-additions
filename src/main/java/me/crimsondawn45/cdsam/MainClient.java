package me.crimsondawn45.cdsam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.crimsondawn45.cdsam.registry.MBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MainClient implements ClientModInitializer {
	
	private static final Logger logger = LogManager.getLogger("Survival Additions");

	@Override
	public void onInitializeClient() {
		
		logger.info("Initializing Client...");
		BlockRenderLayerMap renderMap = BlockRenderLayerMap.INSTANCE;
		renderMap.putBlock(MBlocks.obsidian_glass.getBlock(), RenderLayer.getTranslucent());
		renderMap.putBlock(MBlocks.obsidian_glass_pane.getBlock(), RenderLayer.getTranslucent());
		logger.info("1/1 Initializing: Glass RenderLayer...");
		logger.info("Finished Client Initialization...");
	}
}
