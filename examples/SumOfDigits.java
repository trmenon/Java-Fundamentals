package core.examples;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int num, sum=0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter limit:");
        num = scn.nextInt();
        scn.close(); 
        while(num>0) {
            sum += (num%10);
            num = num/10;
        }
        System.out.println("Sum of digits is " + sum);
    }
}
