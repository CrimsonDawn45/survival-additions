package me.crimsondawn45.cdsam.object;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class MPickaxeItem extends PickaxeItem {

	protected MPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
		super(material, -3, -2.8F, settings);
	}

}
