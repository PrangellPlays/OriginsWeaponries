package net.prangellplays.originsweaponries.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prangellplays.originsweaponries.OriginsWeaponries;

public class ModItems {

        public static final Item INFINITY_GEM = registerItem("infinity_gem",
                new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OriginsWeaponries.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OriginsWeaponries.LOGGER.debug("Register Mod Item For" + OriginsWeaponries.MOD_ID);
    }
}
