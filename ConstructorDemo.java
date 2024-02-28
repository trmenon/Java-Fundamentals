package core;

public class ConstructorDemo {
    int x,y,z;
    public ConstructorDemo() {
        this.x = 1;
        this.y = 1;
        this.z = 1;
    }
    public ConstructorDemo(int a) {
        this.x = a;
        this.y = a;
        this.z = a;
    }
    public ConstructorDemo(int a, int b) {
        this.x = a;
        this.y = b;
        this.z = 1;
    }
    public ConstructorDemo(int a, int b, int c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }

    public int getVolume() {
        return (this.x*this.y*this.z);
    }

    public static void main(String[] args) {
        ConstructorDemo obj1 = new ConstructorDemo();
        ConstructorDemo obj2 = new ConstructorDemo(2);
        ConstructorDemo obj3 = new ConstructorDemo(3,4);
        ConstructorDemo obj4 = new ConstructorDemo(5,6,7);

        System.out.println("Object 1 volume is " + obj1.getVolume());
        System.out.println("Object 2 volume is " + obj2.getVolume());
        System.out.println("Object 3 volume is " + obj3.getVolume());
        System.out.println("Object 4 volume is " + obj4.getVolume());
    }
}
