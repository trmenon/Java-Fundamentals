package core.examples.shapedemo;

public class Circle extends Shape{
    int radius;
    public Circle(int r) {
        this.radius = r;
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }
    public double calculateArea() {
        return (3.14*this.radius*this.radius);
    }
}
