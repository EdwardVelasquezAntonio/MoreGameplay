
package net.mcreator.moregameplay.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.moregameplay.itemgroup.MoreGameplayItemGroup;
import net.mcreator.moregameplay.MoregameplayModElements;

@MoregameplayModElements.ModElement.Tag
public class MaterialdiosItem extends MoregameplayModElements.ModElement {
	@ObjectHolder("moregameplay:materialdios")
	public static final Item block = null;
	public MaterialdiosItem(MoregameplayModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoreGameplayItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.EPIC));
			setRegistryName("materialdios");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
