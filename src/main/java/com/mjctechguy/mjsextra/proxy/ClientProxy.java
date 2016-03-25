package com.mjctechguy.mjsextra.proxy;

import com.mjctechguy.mjsextra.blocks.BlockMjsExtra;
import com.mjctechguy.mjsextra.init.ModBlocks;
import com.mjctechguy.mjsextra.init.ModItems;
import com.mjctechguy.mjsextra.items.ItemMjsExtra;
import com.mjctechguy.mjsextra.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

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


    @Override
    public void registerBlockRender(BlockMjsExtra block) {
        Item item = Item.getItemFromBlock(block);
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
    }

    @Override
    public void registerBlockRenders() {
        registerBlockRender(ModBlocks.red_IngotBlock);
        registerBlockRender(ModBlocks.blue_IngotBlock);
    }





}
