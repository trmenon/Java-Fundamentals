package core.examples.mulsum;

import java.util.Scanner;

public class Values {
    int num1,num2;
    public Values() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number:");
        this.num1 = scn.nextInt();
        System.out.print("Enter second number:");
        this.num2 = scn.nextInt();
        scn.close();
    }

    public int getNumber1() {
        return this.num1;
    }
    public int getNumber2() {
        return this.num2;
    }
}
