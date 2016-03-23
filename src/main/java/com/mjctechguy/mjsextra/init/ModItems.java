package com.mjctechguy.mjsextra.init;

import com.mjctechguy.mjsextra.items.ItemBlueIngot;
import com.mjctechguy.mjsextra.items.ItemMjsExtra;
import com.mjctechguy.mjsextra.items.ItemRedIngot;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static ItemMjsExtra red_Ingot;
    public static ItemMjsExtra blue_Ingot;

    public static void LoadItems() {
        red_Ingot = new ItemRedIngot();
        blue_Ingot = new ItemBlueIngot();
    }

}
