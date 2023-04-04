package net.munfysmp.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.munfysmp.MunfySMP;

public class MunfySMPPaintings {
    public static final PaintingVariant MUNFYSMP32X32 = registerPainting("munfysmp32", new PaintingVariant(32, 32));
    public static final PaintingVariant MUNFYSMP16X16 = registerPainting("munfysmp16", new PaintingVariant(16, 16));
    public static final PaintingVariant MUNFYSMP48X48 = registerPainting("munfysmp48", new PaintingVariant(48, 48));
    public static final PaintingVariant MUNFYSMP64X64 = registerPainting("munfysmp64", new PaintingVariant(64, 64));


    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(MunfySMP.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        MunfySMP.LOGGER.debug("Registering Paintings for " + MunfySMP.MOD_ID);
    }
}
