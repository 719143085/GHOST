package designModel.commandModel.device;

public class Light {

    String name;

    public Light(String name) {
        this.name = name;
    }

    public void On(){
        System.out.println(name + " on");
    }

    public void Off(){
        System.out.println(name + " off");
    }
}
