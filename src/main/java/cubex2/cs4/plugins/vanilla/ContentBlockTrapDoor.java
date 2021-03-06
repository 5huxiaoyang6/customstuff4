package cubex2.cs4.plugins.vanilla;

import cubex2.cs4.plugins.vanilla.block.BlockFactory;
import cubex2.cs4.plugins.vanilla.block.ItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.Optional;

public class ContentBlockTrapDoor extends ContentBlockBaseNoSubtypes
{
    public boolean opensWithRedstone = true;
    public boolean opensWithHands = true;

    public ContentBlockTrapDoor()
    {
        opacity = Attribute.constant(0);
        isFullCube = Attribute.constant(false);
        isOpaqueCube = Attribute.constant(false);
    }

    @Override
    protected Optional<Item> createItem()
    {
        return Optional.of(new ItemBlock(block, this));
    }

    @Override
    public Block createBlock()
    {
        return BlockFactory.createTrapDoor(this);
    }
}
