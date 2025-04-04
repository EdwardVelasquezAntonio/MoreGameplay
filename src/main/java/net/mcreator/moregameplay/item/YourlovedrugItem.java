
package net.mcreator.moregameplay.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.moregameplay.itemgroup.MoreGameplayItemGroup;
import net.mcreator.moregameplay.MoregameplayModElements;

@MoregameplayModElements.ModElement.Tag
public class YourlovedrugItem extends MoregameplayModElements.ModElement {
	@ObjectHolder("moregameplay:yourlovedrug")
	public static final Item block = null;
	public YourlovedrugItem(MoregameplayModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MoregameplayModElements.sounds.get(new ResourceLocation("moregameplay:your_love_is_my_drug")),
					new Item.Properties().group(MoreGameplayItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("yourlovedrug");
		}
	}
}
