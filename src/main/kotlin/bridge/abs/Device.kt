package bridge.abs

interface Device {
    fun isEnabled(): Boolean
    fun enabled()
    fun disabled()

    fun getVolume(): Int
    fun getChannel(): Int

    fun getVolume(percent: Int)
    fun setChannel(channel: Int)
}
