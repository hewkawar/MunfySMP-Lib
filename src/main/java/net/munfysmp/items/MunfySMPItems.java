package net.munfysmp.items;

import net.munfysmp.MunfySMP;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;


public class MunfySMPItems {
    public static final Item MUNFYSMP = registerItem("munfysmp", new Item(new FabricItemSettings()));
    public static final Item NONE = registerItem("none", new Item(new FabricItemSettings().group(MunfySMPGroups.MUNFYSMP)));
    public static final Item ARROW_LEFT = registerItem("arrow_left", new Item(new FabricItemSettings().group(MunfySMPGroups.MUNFYSMP)));
    public static final Item ARROW_RIGHT = registerItem("arrow_right", new Item(new FabricItemSettings().group(MunfySMPGroups.MUNFYSMP)));
    public static final Item ARROW_UP = registerItem("arrow_up", new Item(new FabricItemSettings().group(MunfySMPGroups.MUNFYSMP)));
    public static final Item ARROW_DOWN = registerItem("arrow_down", new Item(new FabricItemSettings().group(MunfySMPGroups.MUNFYSMP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MunfySMP.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MunfySMP.LOGGER.debug("Registering Mod Items for " + MunfySMP.MOD_ID);
    }
}
