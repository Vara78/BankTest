package pack;

public class BankAccount {

    int balance;

    public static void main(String[] args) {
        BankAccount savings = new BankAccount(2000);

        System.out.println(savings);

        //Withdrawing:
        savings.withdraw(300);

        //Deposit:
        savings.deposit(600);

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();
    }

    // toString method
    public String toString() {
        return "Hello and welcome to your own personal bank account!\nYour balance is: " + balance;
    }

    // Constructor method
    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    // checkBalance method
    public void checkBalance() {
        System.out.println("Your balance is " + balance);
    }

    // deposit method
    public void deposit(int amountToDeposit) {
        balance += amountToDeposit;
        System.out.println("You just deposited " + amountToDeposit);
    }

    // withdraw method
    public int withdraw(int amountToWithdraw) {
        balance -= amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }
}
