package net.pardeus.moreadvancementsmod;

import net.fabricmc.api.ModInitializer;

public class MoreAdvancementsMod implements ModInitializer {
	@Override
	public void onInitialize() {
		MAMItems.register();
	}
}
