package space.bbkr.pisces.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.enchantment.ChannelingEnchantment;

@Mixin(ChannelingEnchantment.class)
public class MixinChannelingEnchantment {
	@Inject(method = "getMaxLevel", at = @At("HEAD"), cancellable = true)
	public void getMaximumLevel(CallbackInfoReturnable<Integer> cir) {
		cir.setReturnValue(3);
	}
}
