package dev.criosage.simpleprogressions.item.custom;

import dev.criosage.simpleprogressions.block.custom.ContainerType;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class GenericBarrelItem extends BlockItem {
    public ContainerType type;

    public GenericBarrelItem(Block block, Item.Settings settings, ContainerType type){
        super(block, settings);
        this.type = type;
    }
}
