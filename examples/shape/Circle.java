package core.examples.shape;

public class Circle {
    int radius;
    double area;

    Circle(int x) {
        this.radius = x;
        this.area = 3.14*x*x;
    }

    public void getArea() {
        System.out.println("Area of circle with radius : " + this.radius + " units is " + this.area + "sq.units");
    }
}
