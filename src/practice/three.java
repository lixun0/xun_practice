package practice;

public class three {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++)
            sum += factorial(i);
        System.out.print(sum);
    }
}
