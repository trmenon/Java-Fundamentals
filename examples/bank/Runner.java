package core.examples.bank;

public class Runner {
    public static void main(String[] args) {
        Bank obj = new Bank(453647384, "James Norton", "INIT000E11");
        obj.getIfsc();
        obj.getAccountDetails();
        obj.deposit(30000.00);
        obj.getAccountDetails();
        obj.withdraw(12000.00);
        obj.getAccountDetails();
    }
}
