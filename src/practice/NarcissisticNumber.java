package practice;

import java.util.Scanner;

public class NarcissisticNumber {
    public static int func(int number){
        int sum = 0;
        while(number!=0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
        Integer n = scanner.nextInt();
        Integer result = func(n);
        System.out.println(result);}
    }
}
