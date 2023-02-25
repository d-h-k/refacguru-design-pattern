package bridge.impl;

import bridge.abs.DeviceJava;
import bridge.impl.RemoteControlJava;

public class AdvancedRemoteControlJava extends RemoteControlJava {
    public AdvancedRemoteControlJava(DeviceJava deviceJava) {
        super(deviceJava);
    }
    void mute() {
        deviceJava.setVolume(0);
    }
}
