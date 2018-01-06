package practice;

import java.util.Scanner;

public class movearrays {
    public static void swap(int [] a, int i,int j){
        int temp =a[i];
        a[i]= a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer m = scanner.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n;i++)
        {
            a[i] = scanner.nextInt();
        }

        int j = a.length-m;//
        for(int i=0; i<m; i++,j++)
        {
            swap(a, i, j);
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
