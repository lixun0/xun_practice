package practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        int num = sc.nextInt();

        String str1 = num + "";
        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();
        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                System.out.println("no");
                break;
            } else {
                count++;
            }
        }
        if (count == str1.length()) {
            System.out.println("yes");
        }
    }
}
