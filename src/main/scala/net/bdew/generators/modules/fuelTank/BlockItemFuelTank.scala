package net.bdew.generators.modules.fuelTank

import net.bdew.generators.registries.{Blocks, Machines}
import net.bdew.lib.Text
import net.bdew.lib.multiblock.item.ModuleBlockItem
import net.minecraft.client.util.ITooltipFlag
import net.minecraft.item.ItemStack
import net.minecraft.util.text.ITextComponent
import net.minecraft.world.World

class BlockItemFuelTank(block: BlockFuelTank) extends ModuleBlockItem(block, Blocks.defaultItemProps, Machines) {
  override def getTooltip(stack: ItemStack, world: World, flags: ITooltipFlag): List[ITextComponent] =
    Text.translate("advgenerators.tooltip.capacity", Text.fluid(block.cfg.capacity())) +:
      super.getTooltip(stack, world, flags)
}
