package net.pardeus.moreadvancementsmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreAdvancementsMod implements ModInitializer {
	public static final String MOD_ID = "moreadvancementsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {
		MAMItems.register();
	}
}
