package core.examples.account;

public class Holder {
    String name;
    String account_number;
    
    public Holder(String name, String account_number) {
        this.name = name;
        this.account_number = account_number;
    }

    public String getName() {
        return this.name;
    }
    public String getAccountNumber() {
        return this.account_number;
    }

    public void getAccountHolderDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("A/c: " + this.account_number);
    }
}
