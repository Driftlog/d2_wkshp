package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount{

    private float interest;
    private int duration;

    public FixedDepositAccount(String name, float balance, float interest) {
        super(name, balance);
        this.interest = interest;
    }

    public FixedDepositAccount(String name, float balance, float interest, int duration) {
        super(name, balance);
        this.interest = interest;
        this.duration = duration;
    }

    public float getBalance() {
        return (super.getBalance() * (100.00f + this.interest)) / 100.00f;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void withdraw(float amount) {
        System.out.println("No withdraw Operation allowed.");
    }

    @Override
    public void deposit(float amount) {
        System.out.println("No Deposit Operation allowed.");
    }
}