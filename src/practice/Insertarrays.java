package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Insertarrays {
    private static void swap(int[] a,int i,int j){
        int temp =a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer m = scanner.nextInt();
        Integer k = scanner.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n;i++)
        {
            a[i] = scanner.nextInt();
        }
        a=Arrays.copyOf(a,a.length+1);
        for(int i=a.length-1;i>m;i--){
            swap(a,i,i-1);
        }
        a[m] = k;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

