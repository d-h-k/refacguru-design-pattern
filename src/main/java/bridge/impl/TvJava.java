package bridge.impl;

import bridge.abs.DeviceJava;

public class TvJava implements DeviceJava {
    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public void setVolume(int percent) {

    }

    @Override
    public int getChannel() {
        return 0;
    }

    @Override
    public void setChannel(int channel) {

    }
}
