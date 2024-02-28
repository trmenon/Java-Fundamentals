package core.examples.sumRecursive;

import java.util.Scanner;

public class SumRecursive {
    static int getSumToN (int n) {
        if(n==0) {
            return 0;
        }
        if(n==1) {
            return 1;
        } else {
            return (n+getSumToN(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number:");
        int c = scn.nextInt();
        scn.close();
        System.out.println("Sum:"+ getSumToN(c));
    }
}
