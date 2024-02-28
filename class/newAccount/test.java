import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Account p = new Account(1122, "George", 1000);
        Account.setAnnualInterestRate(1.5);
        p.deposit(30);
        p.deposit(40);
        p.deposit(50);
        p.withdraw(5);
        p.withdraw(4);
        p.withdraw(2);
        System.out.println("Name: " + p.getName());
        System.out.println("Annual interest rate: " + Account.getAnnualInterestRate());
        System.out.println("Balance: " + p.getBalance());
        System.out.println("Date                        Type Amount Balance");
        ArrayList<Transactions> mid = p.getTransactions();
        for(Transactions i:mid) System.out.println(i);
    }
}