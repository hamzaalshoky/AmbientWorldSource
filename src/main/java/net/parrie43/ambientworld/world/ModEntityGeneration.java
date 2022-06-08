package net.parrie43.ambientworld.world;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.parrie43.ambientworld.entity.ModEntityTypes;

public class ModEntityGeneration {
    public static void onEntitySpawn(final BiomeLoadingEvent event) {
        if(doesBiomeMatch(event.getName(), Biomes.SWAMP)) {
            event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(ModEntityTypes.HIPPO.get(), 6, 1, 3));
        }
        if(doesBiomeMatch(event.getName(), Biomes.SAVANNA)) {
            event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(ModEntityTypes.HIPPO.get(), 6, 1, 3));
        }
        if(doesBiomeMatch(event.getName(), Biomes.SAVANNA_PLATEAU)) {
            event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(ModEntityTypes.HIPPO.get(), 6, 1, 3));
        }
        if(doesBiomeMatch(event.getName(), Biomes.WINDSWEPT_SAVANNA)) {
            event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(ModEntityTypes.HIPPO.get(), 6, 1, 3));
        }
        if(doesBiomeMatch(event.getName(), Biomes.OCEAN)) {
            event.getSpawns().getSpawner(MobCategory.WATER_AMBIENT).add(new MobSpawnSettings.SpawnerData(ModEntityTypes.OPAH.get(), 6, 1, 3));
        }
        if(doesBiomeMatch(event.getName(), Biomes.WARM_OCEAN)) {
            event.getSpawns().getSpawner(MobCategory.WATER_AMBIENT).add(new MobSpawnSettings.SpawnerData(ModEntityTypes.OPAH.get(), 6, 1, 3));
        }
        if(doesBiomeMatch(event.getName(), Biomes.LUKEWARM_OCEAN)) {
            event.getSpawns().getSpawner(MobCategory.WATER_AMBIENT).add(new MobSpawnSettings.SpawnerData(ModEntityTypes.OPAH.get(), 6, 1, 3));
        }
        if(doesBiomeMatch(event.getName(), Biomes.DEEP_LUKEWARM_OCEAN)) {
            event.getSpawns().getSpawner(MobCategory.WATER_AMBIENT).add(new MobSpawnSettings.SpawnerData(ModEntityTypes.OPAH.get(), 6, 1, 3));
        }
        if(doesBiomeMatch(event.getName(), Biomes.BEACH)) {
            event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(ModEntityTypes.FLAMINGO.get(), 6, 1, 3));
        }
        if(doesBiomeMatch(event.getName(), Biomes.RIVER)) {
            event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(ModEntityTypes.FLAMINGO.get(), 6, 1, 3));
        }
        if(doesBiomeMatch(event.getName(), Biomes.SWAMP)) {
            event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(ModEntityTypes.FLAMINGO.get(), 6, 1, 3));
        }
    }

    public static boolean doesBiomeMatch(ResourceLocation biomeNameIn, ResourceKey<Biome> biomeIn) {
        return biomeNameIn.getPath().matches(biomeIn.location().getPath());
    }
}
