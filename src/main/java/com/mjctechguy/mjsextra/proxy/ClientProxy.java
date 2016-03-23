package com.mjctechguy.mjsextra.proxy;

import com.mjctechguy.mjsextra.init.ModItems;
import com.mjctechguy.mjsextra.items.ItemMjsExtra;
import com.mjctechguy.mjsextra.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;

public class ClientProxy extends CommonProxy{


    @Override
    public void registerItemRender(ItemMjsExtra item) {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
    }

    @Override
    public void registerItemRenders() {
        registerItemRender(ModItems.red_Ingot);
        registerItemRender(ModItems.blue_Ingot);
    }





}
