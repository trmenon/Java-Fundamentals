package core;

interface Polygon{
    void getArea(int length, int width);
}

class Rectangle implements Polygon{
    public void getArea(int l, int w) {
        System.out.println("Area:"+(l*w));
    }

    
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea(12,45);
    }
}

