package practice;

import java.util.Scanner;

public class qwe {
        public  static int Fibonacci(int n){
            int result[] = { 0, 1 };
            if (n < 2)
            {
                return result[n];
            }
            int f0 = 0;
            int f1 = 1;
            int f2 = 0;
            for (int i = 2; i <= n; i++)
            {
                f2 = f1 + f0;
                f0 = f1;
                f1 = f2;
            }
            return f2;
        }

        public static void main(String[] args)
        { Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            qwe fei = new qwe();
            System.out.println(fei.Fibonacci(n));
        }

    }


