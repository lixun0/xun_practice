package sample_polymorphism;

public class Laptop implements ICommunication {
    @Override
    public void call(String number) {
        System.out.println("Laptop call " + number);
    }
}
