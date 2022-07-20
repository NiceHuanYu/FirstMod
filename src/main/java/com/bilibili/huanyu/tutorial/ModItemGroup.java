package com.bilibili.huanyu.tutorial;

import com.bilibili.huanyu.tutorial.item.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    //此处注册ItemGroup
    public static final ItemGroup TUTORIAL = FabricItemGroupBuilder.build(new Identifier(Tutorial.MOD_ID, "tutorial") ,
            () -> new ItemStack(ModItems.tutorial));
}
