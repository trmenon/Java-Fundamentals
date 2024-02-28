package core;

class Area{
    int length;
    int width;

    Area(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public void getArea() {
        System.out.println(this.length*this.width);
    }
}

public class DataHidingDemo {
    public static void main(String[] args) {
        Area obj = new Area(12, 6);
        obj.getArea();
    }
}
