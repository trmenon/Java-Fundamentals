package core;

enum Size {
    XSMALL,SMALL,MEDIUM,LARGE,XLARGE;

    Size() {
        System.out.println("Registered enum");
    }

    public Size getValue() {
        switch(this) {
            case XSMALL:
                return XSMALL;
            case SMALL:
                return SMALL;
            case MEDIUM:
                return MEDIUM;
            case LARGE:
                return LARGE;
            case XLARGE:
                return XLARGE;
            default:
                return MEDIUM;
        }
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(Size.LARGE.getClass());
        Size pizza_size = Size.MEDIUM;
        System.out.println(pizza_size.getValue());
        System.out.println(Size.MEDIUM.getClass());
    }
}
