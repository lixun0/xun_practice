package practice;

import java.util.LinkedList;
import java.util.Scanner;

public class bubble
{
    public static void sort(int[] a)
    {
        int temp = 0;
        for (int i = a.length - 1; i > 0; --i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (a[j + 1] < a[j])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        Integer N;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int[] a = new int[N];
        for(int i=0; i < N; i++){
            a[i] = scanner.nextInt();
        }
        sort(a);
        for(int i=0; i < N; i++){
            System.out.println(a[i]);
        }
    }
}