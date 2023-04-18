package sg.edu.nus.iss;

import java.util.List;

public class BankAccount {
    private final String name;
    private final int accountNo;
    private float balance;
    private List<String> transactions;
    private boolean status;
    private String creationDate;
    private String closingDate;

    public BankAccount(String name) {
       this.name = name;
    }
    public BankAccount(String name, int accountNo, float balance, List<String> transactions, boolean status,
            String creationDate, String closingDate) {
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
        this.transactions = transactions;
        this.status = status;
        this.creationDate = creationDate;
        this.closingDate = closingDate;
    }

    public void deposit(int cash) {
        this.balance += cash;

    }

    public void withdraw(int cash) {
        if (!(this.balance < cash)) {
        this.balance -= cash;
        
    }

    


    

}
