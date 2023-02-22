public class Main {
    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount();
        bobsAccount.setAccountNumber("12345");
        bobsAccount.setAccountBalance(1000.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("myemael@bob.com");
        bobsAccount.setCustomerNumber("(087) 123-4567");
        bobsAccount.depositInto(250.5);
        bobsAccount.withdrawFrom(100);
        bobsAccount.withdrawFrom(150.5);
    }
}
