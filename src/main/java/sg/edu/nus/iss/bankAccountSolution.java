package sg.edu.nus.iss;


import java.util.Date;
import java.util.List;

public class bankAccountSolution {
    private final String fullName;
    private String accountNumber;
    private float balance;
    private boolean isClosed;
    private Date accountStartDate;
    private Date accountEndDate;
    private List<String> transactions;

    public bankAccountSolution(String fullName, String accountNumber) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.balance = 0.0f;
    }

    public bankAccountSolution(String fullName, String accountNumber, float balance) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(float amount) {
        if (isClosed) {
            throw new IllegalArgumentException("Account closed/inactive. You cannot make a deposit to a closed/inactive account.");
        }

        if (amount < 0) {
            throw new IllegalArgumentException("You cannot make a negative amount deposit");
        } else {
            this.balance += amount;

            Date dt = new Date();
            transactions.add("Deposit " + amount + "to amount " + accountNumber + " on " + dt.toString());
        }
    }

    public void withdraw(float amount) {
        if (!(this.balance < amount && isClosed)) {
            this.balance -= amount;
            Date dt = new Date();
            String withdrawalStatement = "withdraw $" + amount + " at " + dt.toString();
            this.transactions.add(withdrawalStatement);
            }
    }

    @Override
    public String toString() {
        return "bankAccountSolution [fullName=" + fullName + ", accountNumber=" + accountNumber + ", balance=" + balance
                + ", isClosed=" + isClosed + ", accountStartDate=" + accountStartDate + ", accountEndDate="
                + accountEndDate + ", transactions=" + transactions + "]";
    }

    
}