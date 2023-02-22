package net.prangellplays.originsweaponries;

import net.fabricmc.api.ModInitializer;
import net.prangellplays.originsweaponries.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OriginsWeaponries implements ModInitializer {
	public static final String MOD_ID = "originsweaponries";
	public static final Logger LOGGER = LoggerFactory.getLogger("originsweaponries");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
