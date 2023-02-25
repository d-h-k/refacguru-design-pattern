package bridge.abs

abstract class TvDevice: Device {
    abstract fun analogBroadcastCompatibility();
    abstract fun digitalBroadcastCompatibility();
    abstract fun getResolution();
    abstract fun getDisplayRatio();
}