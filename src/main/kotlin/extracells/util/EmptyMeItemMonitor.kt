package extracells.util

import appeng.api.AEApi
import appeng.api.config.AccessRestriction
import appeng.api.config.Actionable
import appeng.api.networking.security.BaseActionSource
import appeng.api.storage.IMEMonitor
import appeng.api.storage.IMEMonitorHandlerReceiver
import appeng.api.storage.StorageChannel
import appeng.api.storage.data.IAEItemStack
import appeng.api.storage.data.IItemList

class EmptyMeItemMonitor : IMEMonitor<IAEItemStack?> {
    override fun addListener(l: IMEMonitorHandlerReceiver<IAEItemStack>,
                             verificationToken: Any) {
    }

    override fun canAccept(input: IAEItemStack): Boolean {
        return false
    }

    override fun extractItems(request: IAEItemStack, mode: Actionable,
                              src: BaseActionSource): IAEItemStack? {
        // TODO Auto-generated method stub
        return null
    }

    override fun getAccess(): AccessRestriction {
        return AccessRestriction.NO_ACCESS
    }

    override fun getAvailableItems(out: IItemList<*>): IItemList<IAEItemStack?> {
        return out
    }

    override fun getChannel(): StorageChannel {
        return StorageChannel.ITEMS
    }

    override fun getPriority(): Int {
        return 0
    }

    override fun getSlot(): Int {
        return 0
    }

    override fun getStorageList(): IItemList<IAEItemStack?> {
        return AEApi.instance().storage().createItemList()
    }

    override fun injectItems(input: IAEItemStack, type: Actionable,
                             src: BaseActionSource): IAEItemStack? {
        return input
    }

    override fun isPrioritized(input: IAEItemStack): Boolean {
        return false
    }

    override fun removeListener(l: IMEMonitorHandlerReceiver<IAEItemStack>) {}
    override fun validForPass(i: Int): Boolean {
        return true
    }
}