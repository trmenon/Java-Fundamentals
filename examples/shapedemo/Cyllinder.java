package core.examples.shapedemo;

public class Cyllinder extends Shape{
    int radius, height;
    public Cyllinder (int r, int h) {
        this.radius = r;
        this.height = h;
    }

    public void draw() {
        System.out.println("Drawing Cyllinder");
    }
    public double calculateArea() {
        return (2*3.14*this.radius*(this.radius+this.height));
    }
}
