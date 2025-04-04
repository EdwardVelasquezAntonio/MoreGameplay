package net.mcreator.moregameplay.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moregameplay.MoregameplayModElements;
import net.mcreator.moregameplay.MoregameplayMod;

import java.util.Map;

@MoregameplayModElements.ModElement.Tag
public class PicoDiosAlSerCreadoProcedure extends MoregameplayModElements.ModElement {
	public PicoDiosAlSerCreadoProcedure(MoregameplayModElements instance) {
		super(instance, 32);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MoregameplayMod.LOGGER.warn("Failed to load dependency entity for procedure PicoDiosAlSerCreado!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MoregameplayMod.LOGGER.warn("Failed to load dependency x for procedure PicoDiosAlSerCreado!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MoregameplayMod.LOGGER.warn("Failed to load dependency y for procedure PicoDiosAlSerCreado!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MoregameplayMod.LOGGER.warn("Failed to load dependency z for procedure PicoDiosAlSerCreado!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MoregameplayMod.LOGGER.warn("Failed to load dependency world for procedure PicoDiosAlSerCreado!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("DIOS ES EL ALPHA EL OMEGA"), (false));
		}
		world.addParticle(ParticleTypes.CLOUD, x, y, z, 0, 0, 0);
	}
}
