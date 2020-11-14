package space.bbkr.pisces;

import net.minecraft.item.Items;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;

public class Pisces implements ModInitializer {
	@Override
	public void onInitialize() {
		LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
			if (id.equals(new Identifier("minecraft", "chests/shipwreck_treasure"))) {
				supplier.withPool(FabricLootPoolBuilder.builder()
						.withEntry(ItemEntry.builder(Items.HEART_OF_THE_SEA)
								.conditionally(RandomChanceLootCondition.builder(0.1f)).build()
						).withEntry(ItemEntry.builder(Items.NAUTILUS_SHELL)
								.conditionally(RandomChanceLootCondition.builder(0.33f)).build()
						).build()
				);
			}
		});
	}
}
