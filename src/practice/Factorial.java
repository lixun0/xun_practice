package practice;

import java.util.Scanner;

public class Factorial {
    private static long getNFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * getNFactorial(n - 1);
    }

    private static long getNFactorial1(int n) {
        if (n == 0) {
            return 1;
        }
        long sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(getNFactorial1(n));
    }
}
