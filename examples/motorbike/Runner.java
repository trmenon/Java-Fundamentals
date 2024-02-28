package core.examples.motorbike;

public class Runner{
    public static void main(String[] args) {
        Sportsbike sb = new Sportsbike();
        Crusier cr = new Crusier();
        System.out.println("Sports bike");
        sb.onBrake();
        System.out.println("Cruiser bike");
        cr.onBrake();
    }
}
