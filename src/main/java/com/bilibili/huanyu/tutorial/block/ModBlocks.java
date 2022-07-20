package com.bilibili.huanyu.tutorial.block;

import com.bilibili.huanyu.tutorial.ModItemGroup;
import com.bilibili.huanyu.tutorial.Tutorial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    private static Block registerBlock(String name, Block block, ItemGroup itemGroup){
        registerBlockItem(name,block, itemGroup);
        return Registry.register(Registry.BLOCK, new Identifier(Tutorial.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name , Block block , ItemGroup itemGroup){
        return Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, name), new BlockItem(block , new FabricItemSettings().group(itemGroup)));
    }


    public static void ModBlocksRegister(){
        //在此注册Block
        Block Tutorial_Block = registerBlock("tutorial_block" ,
                new Block(FabricBlockSettings.of(Material.METAL).strength(30f).requiresTool()) ,
                ModItemGroup.TUTORIAL);
        Block Tutorial_Ore = registerBlock("tutorial_ore" ,
                new Block(FabricBlockSettings.of(Material.METAL).strength(20f).requiresTool()) ,
                ModItemGroup.TUTORIAL);
        Block Deepslate_Tutorial_Ore = registerBlock("deepslate_tutorial_ore" ,
                new Block(FabricBlockSettings.of(Material.METAL).strength(25f).requiresTool()) ,
                ModItemGroup.TUTORIAL);
    }
}
