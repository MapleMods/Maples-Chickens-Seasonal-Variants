package io.github.maplemods.mapleschickensseasonalvariants;


import io.github.maplemods.mapleschickensseasonalvariants.data.Constants;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class NeoForgeMod {

    public NeoForgeMod(IEventBus eventBus) {
        CommonMod.init();
    }
}