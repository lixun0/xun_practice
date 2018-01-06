import java.util.Scanner;

public class HelloWorld {
    private static String getString(){
        return "Hello World";
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Integer a, b;
        while(true) {
            int c = 0xFF;
            int d = 15*16 + 15;
            assert c == d;
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a >= b) {
                System.out.println(a);
            }
            if (b > a) {
                System.out.println(b);
            }
        }

    }
}
