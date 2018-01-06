package practice;

import java.util.Scanner;

public class IsPrimitive {
    public static void main(String[] args) {
        Integer n;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            n = scanner.nextInt();
            if (n == 1 || n == 2 || n == 3) {
                System.out.println("n");
                continue;
            }
            boolean flag = true;
            for (int a = 2; a <= n / 2; a++) {
                if (n % a == 0) {
                    System.out.println("n");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("y");
            }
        }
    }
}
