
package net.mcreator.moregameplay.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.moregameplay.itemgroup.MoreGameplayItemGroup;
import net.mcreator.moregameplay.MoregameplayModElements;

@MoregameplayModElements.ModElement.Tag
public class RedsexslowedItem extends MoregameplayModElements.ModElement {
	@ObjectHolder("moregameplay:redsexslowed")
	public static final Item block = null;
	public RedsexslowedItem(MoregameplayModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MoregameplayModElements.sounds.get(new ResourceLocation("moregameplay:red_sex_slowed")),
					new Item.Properties().group(MoreGameplayItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("redsexslowed");
		}
	}
}
