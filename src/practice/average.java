package practice;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        float sum = 0;
        int num = 1;
        while(num <= n){
            sum += scanner.nextInt();
            num += 1;
        }
        System.out.println(sum / n);
    }
}
