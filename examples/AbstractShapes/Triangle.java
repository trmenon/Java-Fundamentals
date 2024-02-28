package core.examples.AbstractShapes;

public class Triangle extends Shape{
    int s1;
    int s2;
    int s3;

    public Triangle(int a, int b, int c) {
        this.s1 = a;
        this.s2 = b;
        this.s3 = c;
    }

    public double calculateArea() {
        double p = (this.s1+this.s2+this.s3)/2;
        double factor = (p*(p-this.s1)+p*(p-this.s2)+p*(p-this.s3));
        return(Math.sqrt(factor));
    }
    public double calculatePerimeter() {
        return(this.s1+this.s2+this.s3);
    }
}
