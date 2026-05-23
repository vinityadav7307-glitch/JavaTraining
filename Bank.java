public class Bank {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.deposit(5000);
        b1.withdraw(1000);

        System.out.println("Balance: " + b1.getBalance());
    }
}

class BankAccount {

    private int balance;

    public void deposit(int amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance += amount;
        }
    }

    public void withdraw(int amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount");

        } else if (amount > balance) {
            System.out.println("Insufficient fund");

        } else {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}