package core.examples.account;

public class MainDriver {
    public static void main(String[] args) {
        Holder holder_object = new Holder("Jacob", "24154163562356");
        Account acc_object = new Account(holder_object.getAccountNumber());
        holder_object.getAccountHolderDetails();
        acc_object.getAccountDetails();
        acc_object.setCurrentBalance(800);
        acc_object.getAccountDetails();
        acc_object.setCurrentBalance(300);
        acc_object.getAccountDetails();
        Account.setMinBalanace(5000);
        acc_object.setCurrentBalance(300);
        acc_object.getAccountDetails();
    }
}
