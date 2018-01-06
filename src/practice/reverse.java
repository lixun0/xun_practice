package practice;

import javax.swing.event.SwingPropertyChangeSupport;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Integer n;
        Scanner scanner = new Scanner(System.in);
        while (true){
            n = scanner.nextInt();
            if (n>99&n<1000){
            int a=n%10;
            int b=(n/10)%10;
            int c=n/100;
            if((a*a*a)+(b*b*b)+(c*c*c)==n)
                System.out.println("y");
            else
                System.out.println("n");}

            else
            System.out.println("n");
        }
    }
}





