package solution_book_static_final.task5;

public class BankAccount {
    //5. Защищённый банковский счёт
    // Разработай класс BankAccount, который хранит значение баланса.
    // Должны быть методы deposit() и withdraw(), а также метод для получения текущего баланса.
    // Баланс должен быть недоступен извне для прямого изменения.
    // Пояснение: класс должен обеспечивать безопасность изменения данных только через свои методы.


    private long balance;
    private long money;

    public BankAccount(long balance, long money) {
        this.balance = balance;
        this.money = money;
    }

    public double getBalance() {
        return balance;
    }

    public double getMoney() {
        return money;
    }

    public double depositMoney(double money, double balance) {
        return this.balance += money;
    }

    public double withDraw(double money) {
        return balance -= money;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", money=" + money +
                '}';
    }
}
