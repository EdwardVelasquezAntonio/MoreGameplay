package net.mcreator.moregameplay.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;

import net.mcreator.moregameplay.block.PCblockfixBlock;
import net.mcreator.moregameplay.MoregameplayModElements;
import net.mcreator.moregameplay.MoregameplayMod;

import java.util.Map;

@MoregameplayModElements.ModElement.Tag
public class PCblockAlRecibirRedstoneProcedure extends MoregameplayModElements.ModElement {
	public PCblockAlRecibirRedstoneProcedure(MoregameplayModElements instance) {
		super(instance, 31);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MoregameplayMod.LOGGER.warn("Failed to load dependency x for procedure PCblockAlRecibirRedstone!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MoregameplayMod.LOGGER.warn("Failed to load dependency y for procedure PCblockAlRecibirRedstone!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MoregameplayMod.LOGGER.warn("Failed to load dependency z for procedure PCblockAlRecibirRedstone!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MoregameplayMod.LOGGER.warn("Failed to load dependency world for procedure PCblockAlRecibirRedstone!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			BlockState _bs = PCblockfixBlock.block.getDefaultState();
			world.setBlockState(_bp, _bs, 3);
		}
	}
}
