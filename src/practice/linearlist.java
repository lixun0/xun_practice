package practice;

import java.util.*;

public class linearlist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        for (int item :
                list) {
            System.out.println(item);
        }
    }


}
