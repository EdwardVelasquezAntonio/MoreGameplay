package net.mcreator.moregameplay.procedures;

import net.minecraft.world.GameType;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.moregameplay.MoregameplayModElements;
import net.mcreator.moregameplay.MoregameplayMod;

import java.util.Random;
import java.util.Map;

@MoregameplayModElements.ModElement.Tag
public class BootsulimateAlTenerPuestasLasBotasProcedure extends MoregameplayModElements.ModElement {
	public BootsulimateAlTenerPuestasLasBotasProcedure(MoregameplayModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MoregameplayMod.LOGGER.warn("Failed to load dependency entity for procedure BootsulimateAlTenerPuestasLasBotas!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				MoregameplayMod.LOGGER.warn("Failed to load dependency itemstack for procedure BootsulimateAlTenerPuestasLasBotas!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).abilities.allowFlying = (true);
				((PlayerEntity) entity).sendPlayerAbilities();
			}
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).abilities.allowFlying = (false);
				((PlayerEntity) entity).sendPlayerAbilities();
			}
		}
	}
}
