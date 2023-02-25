package bridge

import bridge.abs.RemoteDevice
import bridge.abs.TvDevice
import bridge.impl.AdvencedRemoteDeviceImpl
import bridge.impl.OledTvDeviceImpl

class Launcher {
    fun main() {
        val myRemoCon: RemoteDevice = AdvencedRemoteDeviceImpl()
        val myTv: TvDevice = OledTvDeviceImpl()

        myTv.getDisplayRatio()
        myRemoCon.volumeUp()
    }
}

val studyNote: String =
"""




""".trimIndent()