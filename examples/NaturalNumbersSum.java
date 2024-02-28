package core.examples;

import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        int num, sum=0;
        int i =1;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter limit:");
        num = scn.nextInt();
        scn.close();
        while(i <= num) {
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
