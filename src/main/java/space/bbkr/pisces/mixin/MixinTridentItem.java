package space.bbkr.pisces.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.TridentItem;

@Mixin(TridentItem.class)
public class MixinTridentItem extends Item {

	public MixinTridentItem(Settings settings) {
		super(settings);
	}

	@Override
	public boolean canRepair(ItemStack target, ItemStack repairMat) {
		return repairMat.getItem() == Items.PRISMARINE_CRYSTALS;
	}

}
