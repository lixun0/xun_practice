package practice;

import java.util.Scanner;

public class grades {
    public static void main(String[] args){
        Integer n;
        Scanner in = new Scanner(System.in);
        while(true) {
            n = in.nextInt();
            if (n > 90 && n <= 100) System.out.println("a");
            else if (n < 90 && n >= 80) System.out.println("b");
            else if (n < 80 && n > 60) System.out.println("c");
            else if (n < 60 && n >= 0) System.out.println("d");
            else System.out.println("error");
        }
    }
}
