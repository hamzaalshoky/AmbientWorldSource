package net.parrie43.ambientworld.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.parrie43.ambientworld.AmbientWorld;
import net.parrie43.ambientworld.entity.ModEntityTypes;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AmbientWorld.MOD_ID);

    public static final RegistryObject<Item> HIPPO_SPAWN_EGG = ITEMS.register("hippo_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.HIPPO,5982784, 4797748,
                    new Item.Properties().tab(ModCreativeModeTabs.AMBIENT_WORLD_TAB)));

    public static final RegistryObject<Item> HIPPO_TOOTH = ITEMS.register("hippo_tooth",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.AMBIENT_WORLD_TAB)));

    public static final RegistryObject<Item> HIPPO_TOOTH_DAGGER = ITEMS.register("hippo_tooth_dagger",
            () -> new SwordItem(ModTiers.HIPPO_TEETH, 3, 5f,
                    new Item.Properties().tab(ModCreativeModeTabs.AMBIENT_WORLD_TAB)));

    public static final RegistryObject<Item> HIPPO_MEAT = ITEMS.register("hippo_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.AMBIENT_WORLD_TAB).food(ModFoods.HIPPO_MEAT)));

    public static final RegistryObject<Item> COOKED_HIPPO_MEAT = ITEMS.register("cooked_hippo_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.AMBIENT_WORLD_TAB).food(ModFoods.COOKED_HIPPO_MEAT)));

    public static final RegistryObject<Item> OPAH_SPAWN_EGG = ITEMS.register("opah_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.OPAH,3891452, 14286848,
                    new Item.Properties().tab(ModCreativeModeTabs.AMBIENT_WORLD_TAB)));

    public static final RegistryObject<Item> FLAMINGO_SPAWN_EGG = ITEMS.register("flamingo_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.FLAMINGO,14839920, 14766659,
                    new Item.Properties().tab(ModCreativeModeTabs.AMBIENT_WORLD_TAB)));

    public static final RegistryObject<Item> SHRIMP = ITEMS.register("shrimp",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.AMBIENT_WORLD_TAB).food(ModFoods.SHRIMP)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
