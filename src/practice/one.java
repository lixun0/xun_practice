package practice;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Integer max = null;
        Integer n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();
            if ((max==null)||(a > max) ) {
                max = a;
            }
        }
        System.out.println(max);

    }
}

