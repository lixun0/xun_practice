package practice;

public class two {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 200; i++) {
            boolean b = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b == true) {
                count++;
                System.out.println(i);
            }

        }
        System.out.println("素数个数是: " + count);
    }
}
