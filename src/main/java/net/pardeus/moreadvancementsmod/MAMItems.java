package net.pardeus.moreadvancementsmod;


import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class MAMItems extends Items {

    public static final Item GUARDIAN_FACE = register("guardian_face", Item::new, new Item.Settings());
    public static final Item ELDER_GUARDIAN_FACE = register("elder_guardian_face", Item::new, new Item.Settings());
    public static final Item DOLPHINS_GRACE = register("dolphins_grace", Item::new, new Item.Settings());
    public static final Item CONDUIT_ICON = register("conduit_icon", Item::new, new Item.Settings());
    public static final Item RAVAGER_FACE = register("ravager_face", Item::new, new Item.Settings());
    public static final Item HERO_ICON = register("hero_icon", Item::new, new Item.Settings());

    public static Item register(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of("moreadvancementsmod", path));
        return Items.register(registryKey, factory, settings);
    }

    public static void register() {

    }
}
