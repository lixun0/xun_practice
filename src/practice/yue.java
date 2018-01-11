package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class yue {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Integer m= in.nextInt();
        Integer n= in.nextInt();
        yuesefu(m,n);

    }
    private static void yuesefu(int m,int a){
        List<Integer> abc=new ArrayList<Integer>();
        for (int i = 1; i <= m; i++) {
            abc.add(i);
        }
        int k=0;
        while(abc.size()>0){
            k=k+a;
            k=k%(abc.size())-1;
            if(k<0){
                System.out.println(abc.get(abc.size()-1));
                abc.remove(abc.size()-1);

            }
            else{
                System.out.println(abc.get(k));
                abc.remove(k);
            }

        }
    }

}
