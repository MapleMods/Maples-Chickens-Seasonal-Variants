package io.github.maplemods.mapleschickencollection;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.mapleschickencollection.data.Constants;
import net.minecraft.world.entity.EntityType;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "autumn", "flannel_chicken", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "autumn", "orange_chicken", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "spring", "cherry_blossom_chicken", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "spring", "flower_chicken", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "summer", "midsommar_chicken", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "summer", "watermelon_chicken", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "winter", "frozen_chicken", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "winter", "snow_covered_chicken", 1);
    }
}
