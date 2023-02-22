public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerNumber;

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
