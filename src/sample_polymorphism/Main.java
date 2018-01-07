package sample_polymorphism;

public class Main {
    public static void main(String[] args){
        ICommunication[] iCommunications = new ICommunication[]{
                new Laptop(), new MobilePhone(), new Pad()
        };
        String number = "12423534";
        for (ICommunication communication: iCommunications
             ) {
            communication.call(number);
        }
    }
}
