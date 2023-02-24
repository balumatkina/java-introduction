public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerNumber;

    //constructor
    public BankAccount() {
        this("56789", 2.5, "Default name",
                "Default address", "Default phone");
        System.out.println("Empty constructor");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName,
                       String customerEmail, String customerNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerNumber = customerNumber;
    }

    public BankAccount(String customerName,
                       String customerEmail, String customerNumber) {
        this("9999", 100.55, customerName, customerEmail, customerNumber);
    }

    public void depositInto(double deposit) {
        accountBalance += deposit;
        System.out.println("deposited into: " + deposit
                + ", current amount on account: " + accountBalance);
    }

    public void withdrawFrom(double withdraw) {
        if (accountBalance < withdraw) {
            System.out.println("withdrawing is cancelled due to lack of money on your account: " + accountBalance);
        } else {
            accountBalance -= withdraw;
            System.out.println("withdrawal amount: " + withdraw +
                    ", current amount in account: " + accountBalance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }


}
