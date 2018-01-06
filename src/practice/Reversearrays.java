package practice;

import java.util.Scanner;

public class Reversearrays {
    private static void swap(int[] a,int i,int j){
        int temp =a[i];
        a[i]=a[j];
        a[j]=temp;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n;i++)
        {
            a[i] = scanner.nextInt();
        }

        for(int i=0;i<a.length-i-1;i++){
            int k =a.length-i-1;
            swap(a,i,k);
        }
        for (int b:a){
            System.out.println(b);
        }

    }
}
