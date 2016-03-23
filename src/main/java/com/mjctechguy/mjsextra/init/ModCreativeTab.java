package com.mjctechguy.mjsextra.init;

import com.mjctechguy.mjsextra.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by mjcte on 23/03/2016.
 */
public class ModCreativeTab extends CreativeTabs {

    public ModCreativeTab(String label){
        super(label);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return ModItems.red_Ingot;
    }
}
