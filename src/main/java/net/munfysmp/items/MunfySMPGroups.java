package net.munfysmp.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.munfysmp.MunfySMP;

public class MunfySMPGroups {
    public static final ItemGroup MUNFYSMP = FabricItemGroupBuilder.build(
            new Identifier(MunfySMP.MOD_ID, "tanzanite"), () -> new ItemStack(MunfySMPItems.MUNFYSMP));
}
