package practice;

import java.util.Scanner;

public class QuickSort {
    public static void sort(int[] a, int low, int high) {
        if(low >= high) {
            return;
        }
        int l = low;
        int h = high;
        int povit = a[high];
        int tmp;
        while (l < h) {
            while (l < h && a[l] <= povit) {
                l++;
            }
            tmp = a[l];
            a[l] = a[h];
            a[h] = tmp;
            while(l < h && a[h] >= povit){
                h--;
            }
            tmp = a[l];
            a[l] = a[h];
            a[h] = tmp;
        }
        sort(a, low, l - 1);
        sort(a, l + 1, high);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        sort(a, 0, a.length - 1);

        for (int n : a) {
            System.out.println(n);
        }
    }
}





