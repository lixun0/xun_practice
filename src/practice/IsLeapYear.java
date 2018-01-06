package practice;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Integer year = scanner.nextInt();
        if((year%400==0)&&((year%4==0)&&(year%100!=0))){System.out.print("y");}
        else{System.out.print("n");}
    }
}
