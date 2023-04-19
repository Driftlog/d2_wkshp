package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Date;

public class BankAccount {
    private final String name;
    private final String accountNo;
    private float balance;
    private List<String> transactions;
    private boolean status;
    private Date creationDate;
    private Date closingDate;

    public BankAccount(String name) {
       this.name = name;
       this.balance = 0.0f;
       Random rand = new Random();
       this.accountNo = String.valueOf(rand.nextInt(1000000));
       this.transactions = new ArrayList<>();

    }

    public BankAccount(String name, float balance) {
        this.name = name;
        this.balance = balance;
        Random rand = new Random();
        this.accountNo = String.valueOf(rand.nextInt(1000000));
        this.transactions = new ArrayList<>();
     }

    public void deposit(float cash) {
        if (this.balance > 0 && this.status == true) {
        this.balance += cash;
        String depositStatement = "deposit $" + cash + " at";
        transactions.add(depositStatement);
        }
    }

    public void withdraw(float cash) {
        if (!(this.balance < cash && this.status == true)) {
        this.balance -= cash;
        String withdrawalStatement = "withdraw $" + cash + " at " + "";
        this.transactions.add(withdrawalStatement);
        }
    }

    public String getName() {
        return name;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    @Override
    public String toString() {
        return "BankAccount [name=" + name + ", accountNo=" + accountNo + ", balance=" + balance + ", transactions="
                + transactions + ", status=" + status + ", creationDate=" + creationDate + ", closingDate="
                + closingDate + "]";
    }


}
