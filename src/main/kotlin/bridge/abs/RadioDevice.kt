package bridge.abs

interface RadioDevice: Device {
    fun isFM();
    fun isAM();
    fun switchAMFM();
}