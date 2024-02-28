package core.examples.AbstractShapes;

public class Square extends Shape{
    int dim;
    public Square (int r) {
        this.dim = r;
    }
    public double calculateArea() {
        return (this.dim*this.dim);
    }
    public double calculatePerimeter() {
        return (4*this.dim);
    }
}
