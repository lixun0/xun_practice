package practice;

import java.util.Scanner;

public class trangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        int[] a = new int[lines + 1];
        int previous = 1;
        for (int i = 1; i <= lines; i ++){
            for (int j = 1; j <= i; j++){
                int current = a[j];
                a[j] = previous + current;
                previous = current;
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }

}

