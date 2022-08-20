package dev.criosage.simpleprogressions.item.custom;

import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public class CopperUpgradeItem extends Item {
    public CopperUpgradeItem(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().getBlockEntity(context.getBlockPos()) instanceof ChestBlockEntity) {
            context.getPlayer().sendMessage(Text.of("wow"));
            return ActionResult.PASS;
        }

        return ActionResult.FAIL;
    }
}
