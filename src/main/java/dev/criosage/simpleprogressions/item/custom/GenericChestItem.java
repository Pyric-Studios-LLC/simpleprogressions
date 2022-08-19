package dev.criosage.simpleprogressions.item.custom;

import dev.criosage.simpleprogressions.block.custom.ChestType;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class GenericChestItem extends BlockItem implements IAnimatable {
    public AnimationFactory factory = new AnimationFactory(this);
    public ChestType type;

    public GenericChestItem(Block block, Settings settings, ChestType type){
        super(block, settings);
        this.type = type;
    }
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        return PlayState.CONTINUE;
    }
    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}