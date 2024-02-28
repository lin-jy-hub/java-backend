package Account;

public class test1 {
    public static void main(String[] args) {
        Account D = new Account(1122, 20000);
        D.setAnnualInterestRate(0.045);
        D.withDraw(2500);
        D.deposit(3000);
        System.out.println("Balance is " + D.getBalance());
        System.out.println("Monthly interest is " + D.getMonthlyInterest());
        System.out.println("This count was created at " + D.getDateCreated().toString());

    }
}
