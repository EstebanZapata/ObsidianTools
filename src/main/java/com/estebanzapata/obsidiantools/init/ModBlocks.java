package com.estebanzapata.obsidiantools.init;


import com.estebanzapata.obsidiantools.block.BlockOT;
import com.estebanzapata.obsidiantools.block.BlockOnyx;
import com.estebanzapata.obsidiantools.reference.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockOT blockOnyx = new BlockOnyx();

    public static void init() {
        GameRegistry.registerBlock(blockOnyx, "blockOnyx");
    }
}
