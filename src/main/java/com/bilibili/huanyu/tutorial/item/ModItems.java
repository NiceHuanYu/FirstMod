package com.bilibili.huanyu.tutorial.item;

import com.bilibili.huanyu.tutorial.ModItemGroup;
import com.bilibili.huanyu.tutorial.Tutorial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //注册ItemGroup
    public static Item tutorial = registerItem("tutorial" ,
            new Item(new FabricItemSettings().group(ModItemGroup.TUTORIAL)));

    public static Item registerItem(String name , Item item){
        return Registry.register(Registry.ITEM , new Identifier(Tutorial.MOD_ID , name), item );
    }


    public static void ModItemRegister(){
        //再此注册Item
        Item refined_tutorial = registerItem("refined_tutorial" ,
                new Item(new FabricItemSettings().group(ModItemGroup.TUTORIAL)));
    }
}
