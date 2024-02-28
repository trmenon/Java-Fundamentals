package core.examples.AbstractShapes;

public class AbstarctShapes {
    public static void main(String[] args) {
        Circle cir = new Circle(12);
        System.out.println("Area of circle with radius of 12 = " + cir.calculateArea());
        System.out.println("Perimeter of circle with radius of 12 = " + cir.calculatePerimeter());
        Square sq = new Square(12);
        System.out.println("Area of square with dimension of 12 = " + sq.calculateArea());
        System.out.println("Perimeter of square with dimension of 12 = " + sq.calculatePerimeter());
        Triangle tri = new Triangle(12, 13, 14);
        System.out.println("Area of Triangle with dimension of 12,13,14 = " + tri.calculateArea());
        System.out.println("Perimeter of Triangle with dimension of 12,13,14 = " + tri.calculatePerimeter());
    }
}
