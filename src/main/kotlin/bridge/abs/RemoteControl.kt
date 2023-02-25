package bridge.abs

abstract class RemoteControl(
    var device: Device
) {
    abstract fun togglePower();
    abstract fun volumeDown();
    abstract fun volumeUp();
    abstract fun channelDown();
    abstract fun channelUp();
}