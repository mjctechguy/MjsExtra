package com.mjctechguy.mjsextra.blocks;

import net.minecraft.block.material.Material;

public class BlockRedIngot extends BlockMjsExtra {
    public BlockRedIngot() {
        super(Material.rock,"redIngotBlock");
        this.setHardness(20.0F);
        this.setHarvestLevel("pickaxe",2);
    }
}
