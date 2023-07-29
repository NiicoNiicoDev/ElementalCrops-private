package net.niicolabs.elementalcrops.item.Custom;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.niicolabs.elementalcrops.item.Moditems;

public class EssenceCropBlock extends CropBlock  {

    public static int MAX_AGE;
    public static ItemLike baseSeed;
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 5);

    public EssenceCropBlock(Properties pProperties, int pMAX_AGE, ItemLike seedBase) {
        super(pProperties);
        MAX_AGE = pMAX_AGE;
        baseSeed = seedBase;
    }

    @Override
    protected ItemLike getBaseSeedId(){
        return baseSeed;
    }

    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }
}
