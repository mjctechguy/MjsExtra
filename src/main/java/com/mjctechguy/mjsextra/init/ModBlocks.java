package com.mjctechguy.mjsextra.init;

import com.mjctechguy.mjsextra.blocks.BlockBlueIngot;
import com.mjctechguy.mjsextra.blocks.BlockMjsExtra;
import com.mjctechguy.mjsextra.blocks.BlockRedIngot;

public class ModBlocks {
    public static BlockMjsExtra red_IngotBlock;
    public static BlockMjsExtra blue_IngotBlock;

    public static void LoadBlocks(){
        red_IngotBlock = new BlockRedIngot();
        blue_IngotBlock = new BlockBlueIngot();
    }
}
