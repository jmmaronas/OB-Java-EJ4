package poo.smartDevide;

public class SmartPhone extends SmartDevice{
    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String OS) {
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
