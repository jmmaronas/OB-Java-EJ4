package poo.smartDevide;

public class SmartWatch extends SmartDevice {

    public SmartWatch() { }

    public SmartWatch(String marca, String modelo, String OS) {
        super(marca, modelo, OS);
    }
    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }
}
