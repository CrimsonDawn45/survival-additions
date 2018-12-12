package com.crimsondawn45.survivaladditions.objects.items.tools;

import com.crimsondawn45.survivaladditions.Main;
import com.crimsondawn45.survivaladditions.init.ModItems;
import com.crimsondawn45.survivaladditions.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel{

	public ToolAxe(String name, ToolMaterial material, Float damage, Float speed) {
		super(material, damage, speed);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TOOLS_TAB);
			
		ModItems.ITEMS.add(this);
		}
		
		@Override
		public void registerModels() {
			Main.proxy.registerItemRenderer(this, 0, "inventory");
		}
}
