package practice;

import java.util.Scanner;

public class Lixun {
    public static int GetMax(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
            }

        return max;
    }
    public static void main(String[] args) {
        Integer N;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int[] a = new int[N];
        for(int i=0; i < N; i++){
            a[i] = scanner.nextInt();
        }
        GetMax(a);
        System.out.println(GetMax(a));
    }
}
