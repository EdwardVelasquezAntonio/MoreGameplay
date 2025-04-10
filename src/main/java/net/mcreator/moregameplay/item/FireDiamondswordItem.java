
package net.mcreator.moregameplay.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;

import net.mcreator.moregameplay.procedures.FireDiamondswordAlEntidadSerGolpeadaConLaHerramientaProcedure;
import net.mcreator.moregameplay.itemgroup.MoreGameplayItemGroup;
import net.mcreator.moregameplay.MoregameplayModElements;

import java.util.Map;
import java.util.HashMap;

@MoregameplayModElements.ModElement.Tag
public class FireDiamondswordItem extends MoregameplayModElements.ModElement {
	@ObjectHolder("moregameplay:fire_diamondsword")
	public static final Item block = null;
	public FireDiamondswordItem(MoregameplayModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1561;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(MoreGameplayItemGroup.tab).isImmuneToFire()) {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					FireDiamondswordAlEntidadSerGolpeadaConLaHerramientaProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("fire_diamondsword"));
	}
}
