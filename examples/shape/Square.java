package core.examples.shape;

public class Square {
    int dim;
    double area;

    Square(int x) {
        this.dim = x;
        this.area = x*x;
    }

    public void getArea() {
        System.out.println("Area of square with dimensions : " + this.dim + " units is " + this.area + "sq.units");
    }
}
