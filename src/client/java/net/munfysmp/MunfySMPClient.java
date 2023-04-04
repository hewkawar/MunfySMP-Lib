package net.munfysmp;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.munfysmp.block.MunfySMPBlocks;

public class MunfySMPClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(MunfySMPBlocks.LECTERN, RenderLayer.getCutout());


	}
}