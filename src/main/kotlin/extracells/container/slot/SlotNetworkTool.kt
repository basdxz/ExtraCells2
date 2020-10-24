package extracells.container.slot

import appeng.api.implementations.guiobjects.INetworkTool
import appeng.api.implementations.items.IUpgradeModule
import net.minecraft.inventory.IInventory
import net.minecraft.inventory.Slot
import net.minecraft.item.ItemStack

class SlotNetworkTool(inventory: INetworkTool?, index: Int, x: Int, y: Int) : Slot(inventory, index, x, y) {
    var inventory: IInventory
    override fun isItemValid(itemStack: ItemStack): Boolean {
        if (itemStack == null) return false
        val item = itemStack.item
        if (item !is IUpgradeModule) return false
        val upgradeModule = item as IUpgradeModule
        return upgradeModule.getType(itemStack) != null
    }

    init {
        this.inventory = inventory
    }
}