package bridge.abs

interface TvDevice: Device {
    fun analogBroadcastCompatibility();
    fun digitalBroadcastCompatibility();
    fun getResolution();
    fun getDisplayRatio();
}