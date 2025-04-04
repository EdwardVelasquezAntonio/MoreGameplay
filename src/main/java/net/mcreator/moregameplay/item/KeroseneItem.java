
package net.mcreator.moregameplay.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.moregameplay.itemgroup.MoreGameplayItemGroup;
import net.mcreator.moregameplay.MoregameplayModElements;

@MoregameplayModElements.ModElement.Tag
public class KeroseneItem extends MoregameplayModElements.ModElement {
	@ObjectHolder("moregameplay:kerosene")
	public static final Item block = null;
	public KeroseneItem(MoregameplayModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MoregameplayModElements.sounds.get(new ResourceLocation("moregameplay:kerosene")),
					new Item.Properties().group(MoreGameplayItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("kerosene");
		}
	}
}
