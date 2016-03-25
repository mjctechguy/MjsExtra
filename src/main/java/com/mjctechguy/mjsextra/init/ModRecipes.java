package com.mjctechguy.mjsextra.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void ModRecipesInit() {
        //Crafts 1 Red ingot Block then back to ingots
        GameRegistry.addRecipe(new ItemStack(ModBlocks.red_IngotBlock), "rrr","rrr","rrr",'r',new ItemStack(ModItems.red_Ingot));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.red_Ingot,9),new ItemStack(ModBlocks.red_IngotBlock));

        //Crafts 1 Blue ingot block then back to ingots
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blue_IngotBlock), "rrr","rrr","rrr",'r',new ItemStack(ModItems.blue_Ingot));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blue_Ingot,9),new ItemStack(ModBlocks.blue_IngotBlock));
    }
}
