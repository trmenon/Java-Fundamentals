package core.examples.finalDemo;

final class a1 {
    public void display() {
        System.out.println("Displaying a1");
    }
}

class b1 {
    final public void display() {
        System.out.println("Displaying b1");
    }
    public void exDisplay() {
        System.out.println("Displaying EXB1");
    }
}

class b2 extends b1{
    public void exDisplay() {
        System.out.println("Displaying B2");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        a1 obj_a1 = new a1();
        b1 obj_b1 = new b1();
        b2 obj_b2 = new b2();
        obj_a1.display();
        obj_b1.display();
        obj_b1.exDisplay();
        obj_b2.display();
    }
}
