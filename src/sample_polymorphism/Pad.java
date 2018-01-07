package sample_polymorphism;

public class Pad implements ICommunication{
    @Override
    public void call(String number) {
        System.out.println("Pad call " + number);
    }
}
