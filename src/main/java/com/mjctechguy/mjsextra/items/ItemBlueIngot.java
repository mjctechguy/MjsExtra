package com.mjctechguy.mjsextra.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;


public class ItemBlueIngot extends ItemMjsExtra {

    public ItemBlueIngot(){
        super("blueIngot");
        this.canRepair = false;
    }

    @Override
    public boolean isDamageable() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add(EnumChatFormatting.GREEN.ITALIC + "Such Ore more Ingot");
    }
}
