import java.util.ArrayList;
import java.util.Date;

public class Account {
  private int id;
  private String name;
  private double balance;
  private static double annualInterestRate;
  private Date dateCreated;
  private ArrayList<Transactions> transactions = new ArrayList<>();

  public Account() {
    dateCreated = new java.util.Date();
  }

  public Account(int id, String name, double balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }


  public Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
    dateCreated = new java.util.Date();
  }

  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return balance;
  }
  public String getName() {
    return name;
  }

  public static double getAnnualInterestRate() {
    return annualInterestRate;
  }
  public ArrayList<Transactions> getTransactions() {
    return transactions;
  }

  public void setId(int newId) {
    id = newId;
  }

  public void setBalance(double newBalance) {
    balance = newBalance;
  }

  public static void setAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
  }

  public double getMonthlyInterest() {
    return balance * (annualInterestRate / 1200);
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public void withdraw(double amount) {
    balance -= amount;
    transactions.add(new Transactions('W', amount, balance, "")); 
  }

  public void deposit(double amount) {
    balance += amount;
    transactions.add(new Transactions('D', amount, balance, ""));
  }
}
