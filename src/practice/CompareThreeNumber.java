package practice;
import java.util.Scanner;
public class CompareThreeNumber {
    private static int max(int... ints) {
        Integer max_num = null;
        for (int n : ints) {
            if (max_num == null) {
                max_num = n;
            }
            max_num = n > max_num ? n : max_num;
        }
        return max_num;
    }

    public static void two(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a >= b) {
            System.out.println(a);
        }
        if (b > a) {
            System.out.println(b);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a);
        }
        if (b >= a && b >= c) {
            System.out.println(b);
        }
        if (c >= a && c >= b) {
            System.out.println(c);
        }
    }
}
