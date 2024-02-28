package core.examples.sum;

import java.util.Scanner;

public class SumCore {
    int num1;
    int num2;

    public SumCore(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number:");
        int x = scn.nextInt();
        System.out.print("Enter second number:");
        int y = scn.nextInt();
        scn.close();
        this.num1 = x;
        this.num2 = y;
    }
    public int getSum() {
        return (this.num1+this.num2);
    }
}
