package dev.criosage.simpleprogressions.item;

import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.item.custom.CopperUpgradeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static CopperUpgradeItem COPPER_UPGRADE_ITEM = new CopperUpgradeItem(
            new FabricItemSettings().group(SimpleProgressions.SimpleProgressionsItemGroup));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("simpleprogressions", "copper_upgrade_item"), COPPER_UPGRADE_ITEM);
    }
}
