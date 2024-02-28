package core.examples.shapedemo;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Cyllinder r = new Cyllinder(10, 4);
        c.draw();
        System.out.println("Area of circle:"+ c.calculateArea());
        r.draw();
        System.out.println("Area of cyllinder:"+ r.calculateArea());
    }
}