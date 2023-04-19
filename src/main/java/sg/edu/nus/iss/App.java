package sg.edu.nus.iss;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        FixedDepositAccount fredFixed = new FixedDepositAccount("fred", 2000, 3.00f, 1);

        fredFixed.deposit(1000.00f);
        fredFixed.withdraw(200.0f);
        float computeBalance = fredFixed.getBalance();
        System.out.println(fredFixed.getName() + "-> Balance: " + computeBalance);
    }
}
