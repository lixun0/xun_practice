package practice;

import java.util.Arrays;
import java.util.Scanner;

public class HostElement {
    public static int sort(int[] a) {
        Arrays.sort(a);
        int temp =a[a.length / 2];
        return temp;
    }
    public static int sort2(int[] nums){
        int n = 1;
        int temp = nums[0];
        for(int i = 1 ;i < nums.length;i++){
            if(temp == nums[i])
                n++;
            if(temp != nums[i])
                n--;
            if(n==0){
                temp = nums[i];
                n = 1;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Integer N;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();

            }
        System.out.println(sort2(a));

        }
    }
