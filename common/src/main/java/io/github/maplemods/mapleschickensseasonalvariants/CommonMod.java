package io.github.maplemods.mapleschickensseasonalvariants;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.mapleschickensseasonalvariants.data.Constants;
import net.minecraft.world.entity.EntityType;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerCategory(Constants.MOD_ID, "spring", "season", 3, 1, 5, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "summer", "season", 6, 1, 8, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "autumn", "season", 9, 1, 11, 30);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "winter", "season", 12, 1, 2, 28);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "autumn", "flannel_chicken", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CHICKEN, "autumn", "flannel_chicken", "*", "flannel_chicken");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "autumn", "orange_chicken", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CHICKEN, "autumn", "orange_chicken", "*", "orange_chicken");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "spring", "cherry_blossom_chicken", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CHICKEN, "spring", "cherry_blossom_chicken", "*", "cherry_blossom_chicken");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "spring", "flower_chicken", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CHICKEN, "spring", "flower_chicken", "*", "flower_chicken");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "summer", "midsommar_chicken", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CHICKEN, "summer", "midsommar_chicken", "*", "midsommar_chicken");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "summer", "watermelon_chicken", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CHICKEN, "summer", "watermelon_chicken", "*", "watermelon_chicken");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "winter", "frozen_chicken", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CHICKEN, "winter", "frozen_chicken", "*", "frozen_chicken");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "winter", "snow_covered_chicken", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CHICKEN, "winter", "snow_covered_chicken", "*", "snow_covered_chicken");
    }
}
