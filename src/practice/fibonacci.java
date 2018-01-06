package practice;

public class fibonacci {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 0;
        System.out.println();
        System.out.print(a + "\t" + b + "\t");
        for (int i = 1; i <= 18; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + "\t");
            if ((i + 2) % 5 == 0)
                System.out.println();
        }
    }

    private static int fibonacci(int n) {
        if(n==1 || n==2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}



