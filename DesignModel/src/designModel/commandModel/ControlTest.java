package designModel.commandModel;

import designModel.commandModel.device.Light;
import designModel.commandModel.device.Stereo;

public class ControlTest {
    public static void main(String[] args) {
        Control control;
        Light light = new Light("Bedroom");
        Stereo stereo = new Stereo();
        control = new TraditionControl(light,stereo);
        control.onButtom(0);
        control.offButtom(0);
        control.onButtom(1);
        control.onButtom(2);
        control.offButtom(2);
        control.offButtom(1);
    }
}
