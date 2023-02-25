package bridge.abs

interface RemoteDevice: Device {
    fun togglePower();
    fun volumeDown();
    fun volumeUp();
    fun channelDown();
    fun channelUp();
}