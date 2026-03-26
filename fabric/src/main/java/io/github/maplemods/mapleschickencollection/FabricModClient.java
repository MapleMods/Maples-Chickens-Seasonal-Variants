package io.github.maplemods.mapleschickencollection;

import net.fabricmc.api.ClientModInitializer;

public class FabricModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		CommonMod.init();
	}
}
