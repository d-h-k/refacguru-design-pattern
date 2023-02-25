package bridge.impl

import bridge.abs.RemoteDevice

class AdvencedRemoteDeviceImpl : RemoteDevice {
    var isEnabled = false;
    var channel : Int = 1;
    var volume : Int = 50;
    override fun togglePower() {
        TODO("Not yet implemented")
    }

    override fun volumeDown() {
        TODO("Not yet implemented")
    }

    override fun volumeUp() {
        TODO("Not yet implemented")
    }

    override fun channelDown() {
        TODO("Not yet implemented")
    }

    override fun channelUp() {
        TODO("Not yet implemented")
    }

    override fun isEnabled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun enabled() {
        TODO("Not yet implemented")
    }

    override fun disabled() {
        TODO("Not yet implemented")
    }

    override fun getVolume(): Int {
        TODO("Not yet implemented")
    }

    override fun getChannel(): Int {
        TODO("Not yet implemented")
    }

    override fun getVolume(percent: Int) {
        TODO("Not yet implemented")
    }

    override fun setChannel(channel: Int) {
        TODO("Not yet implemented")
    }
}