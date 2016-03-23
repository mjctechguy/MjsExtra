package com.mjctechguy.mjsextra.items;

import com.mjctechguy.mjsextra.MjsExtra;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ItemMjsExtra extends Item {

    public ItemMjsExtra(String name) {
        registerItem(name, this);
    }

    public static void registerItem(String name, Item item){
        item.setUnlocalizedName(name);
        item.setCreativeTab(MjsExtra.instance.creativeTab);
        GameRegistry.registerItem(item, name);
    }
}
