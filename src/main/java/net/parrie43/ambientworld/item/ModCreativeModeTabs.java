package net.parrie43.ambientworld.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static final CreativeModeTab AMBIENT_WORLD_TAB = new CreativeModeTab("ambient_world_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HIPPO_MEAT.get());
        }
    };
}
