package core.examples;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num, sum=0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter limit:");
        num = scn.nextInt();
        int temp = num;
        scn.close(); 
        while(temp>0) {
            sum = (sum*10) + (temp%10);
            temp = temp/10;
        }
        System.out.println("Reverse is " + sum);
    }
}
