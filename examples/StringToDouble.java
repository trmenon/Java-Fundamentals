package core.examples;

public class StringToDouble {
    public static void main(String[] args) {
        String number = "46328742.48920";
        // 
        try {
            System.out.println(Double.parseDouble(number));
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
