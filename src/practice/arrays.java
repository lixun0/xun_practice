package practice;

import java.util.Scanner;

public class arrays {
    private static int getMaxIndex(int[] array) {
        Integer max = null;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i += 1) {
            int a = array[i];
            if (null == max || a > max) {
                max = a;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int getMinIndex(int[] array) {
        Integer min = null;
        int minIndex = 0;
        for (int i = 0; i < array.length; i += 1) {
            int a = array[i];
            if (null == min || a < min) {
                min = a;
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        Integer n;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            swap(a, n - 1, getMinIndex(a));
            swap(a, 0, getMaxIndex(a));


            for (int b : a) {

                System.out.println(b);
            }
        }

    }
}