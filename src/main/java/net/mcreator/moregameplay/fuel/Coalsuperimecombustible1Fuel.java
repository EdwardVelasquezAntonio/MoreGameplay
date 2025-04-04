
package net.mcreator.moregameplay.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.moregameplay.item.CoalredoreItem;
import net.mcreator.moregameplay.MoregameplayModElements;

@MoregameplayModElements.ModElement.Tag
public class Coalsuperimecombustible1Fuel extends MoregameplayModElements.ModElement {
	public Coalsuperimecombustible1Fuel(MoregameplayModElements instance) {
		super(instance, 18);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(CoalredoreItem.block, (int) (1)).getItem())
			event.setBurnTime(2400);
	}
}
