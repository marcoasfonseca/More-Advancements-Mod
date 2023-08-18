package net.pardeus.moreadvancementsmod;


import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MAMItems extends Items {
    public static final Item CONDUIT_ICON = new Item(new Item.Settings());
    public static final Item DOLPHINS_GRACE = new Item(new Item.Settings());
    public static final Item ELDER_GUARDIAN_FACE = new Item(new Item.Settings());
    public static final Item GUARDIAN_FACE = new Item(new Item.Settings());
    public static final Item HERO_ICON = new Item(new Item.Settings());
    public static final Item RAVAGER_FACE = new Item(new Item.Settings());


    public static void register() {
        Registry.register(Registries.ITEM, new Identifier("moreadvancementsmod", "conduit_icon"), CONDUIT_ICON);
        Registry.register(Registries.ITEM, new Identifier("moreadvancementsmod", "dolphins_grace"), DOLPHINS_GRACE);
        Registry.register(Registries.ITEM, new Identifier("moreadvancementsmod", "elder_guardian_face"), ELDER_GUARDIAN_FACE);
        Registry.register(Registries.ITEM, new Identifier("moreadvancementsmod", "guardian_face"), GUARDIAN_FACE);
        Registry.register(Registries.ITEM, new Identifier("moreadvancementsmod", "hero_icon"), HERO_ICON);
        Registry.register(Registries.ITEM, new Identifier("moreadvancementsmod", "ravager_face"), RAVAGER_FACE);
    }
}
