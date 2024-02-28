package core.examples.shape;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        int units;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter unit dimension:");
        units = scn.nextInt();
        scn.close();
        Circle c = new Circle(units);
        Square s = new Square(units);
        c.getArea();
        s.getArea();
    }
}
