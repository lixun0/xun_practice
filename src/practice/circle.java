package practice;

public class circle {
    public static void main(String[] args) {
        int a = 100;
        double sum = 100;
        for (int i = 1; i <= 10; i++) {
            double b = Math.pow(2, i);
            sum += (a / b);
            System.out.println(sum);
        }
    }

}
