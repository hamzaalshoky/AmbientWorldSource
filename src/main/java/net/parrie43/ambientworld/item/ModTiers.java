package net.parrie43.ambientworld.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier HIPPO_TEETH = new ForgeTier(1, 1500, 1f,
            5f, 10, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.HIPPO_TOOTH.get()));
}
