package net.munfysmp.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.munfysmp.MunfySMP;
import net.munfysmp.block.munfysmp.LecternBlock;

public class MunfySMPBlocks {
    public static final Block LECTERN = registerBlock("lectern", new LecternBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).nonOpaque()), ItemGroup.DECORATIONS);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(MunfySMP.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup tab) {
        Registry.register(Registry.ITEM, new Identifier(MunfySMP.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        MunfySMP.LOGGER.debug("Registering ModBlocks for " + MunfySMP.MOD_ID);
    }
}