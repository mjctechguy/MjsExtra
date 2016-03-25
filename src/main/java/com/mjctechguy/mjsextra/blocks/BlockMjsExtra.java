package com.mjctechguy.mjsextra.blocks;

import com.mjctechguy.mjsextra.MjsExtra;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockMjsExtra extends Block {

    public BlockMjsExtra(Material mat, String name){
        super(mat);
        this.setUnlocalizedName(name);
        this.setCreativeTab(MjsExtra.instance.creativeTab);
        GameRegistry.registerBlock(this, name);
    }
}