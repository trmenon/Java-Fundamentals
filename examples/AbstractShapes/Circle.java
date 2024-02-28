package core.examples.AbstractShapes;

public class Circle extends Shape{
    int radius;
    public Circle (int r) {
        this.radius = r;
    }
    public double calculateArea() {
        return (3.14*this.radius*this.radius);
    }
    public double calculatePerimeter() {
        return (2*3.14*this.radius);
    }
}
