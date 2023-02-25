package bridge.impl;

import bridge.abs.DeviceJava;

public abstract class RemoteControlJava {
    protected DeviceJava deviceJava;

    public RemoteControlJava(DeviceJava deviceJava) {
        this.deviceJava = deviceJava;
    }

    public void togglePower() {
        if(deviceJava.isEnabled()) {
            deviceJava.disable();
        }
        else {
            deviceJava.enable();
        }
    }
    public void volumeDown() {
        deviceJava.setVolume(deviceJava.getVolume() - 10);
    }
    public void volumeUp() {
        deviceJava.setVolume(deviceJava.getVolume() + 10);
    }
    public void channelDown() {
        deviceJava.setChannel(deviceJava.getChannel() - 1);
    }
    public void channelUp() {
        deviceJava.setChannel(deviceJava.getChannel() + 1);
    }
}
