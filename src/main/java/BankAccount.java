public class BankAccount {

    /**
     * Создайте класс BankAccount с полями owner и balance.
     * Реализуйте конструктор, геттеры, сеттер для владельца,
     * методы deposit(amount) и withdraw(amount) и
     * метод printBalance().
     * В main внесите деньги, снимите и выведите баланс.
     */

    String owner;
    double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String newOwner) {
        owner = newOwner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("Balance: " + balance);
    }
}
