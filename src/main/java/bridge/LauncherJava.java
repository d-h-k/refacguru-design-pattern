package bridge;

import bridge.abs.RemoteControl;
import bridge.impl.AdvancedRemoteControlJava;
import bridge.impl.RadioJava;
import bridge.impl.RemoteControlJava;
import bridge.impl.TvJava;

public class LauncherJava {
    public static void main(String[] args) {

        //tv 에 연결된 리모콘
        TvJava tvJava = new TvJava();
        RemoteControlJava remote1 = new AdvancedRemoteControlJava(tvJava);
        remote1.togglePower();

        //radio 에 연결된 리모콘
        RadioJava radioJava = new RadioJava();
        RemoteControlJava remote2 = new AdvancedRemoteControlJava(radioJava);
        remote2.channelUp();



    }

}
