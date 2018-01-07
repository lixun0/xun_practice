package sample_polymorphism;

public class MobilePhone implements ICommunication{
    @Override
    public void call(String number) {
        System.out.println("mobile phone call " + number);
    }
}
