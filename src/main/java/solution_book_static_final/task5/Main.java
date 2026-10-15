package solution_book_static_final.task5;

public class Main {

    //5. Защищённый банковский счёт
    // Разработай класс BankAccount, который хранит значение баланса.
    // Должны быть методы deposit() и withdraw(), а также метод для получения текущего баланса.
    // Баланс должен быть недоступен извне для прямого изменения.
    // Пояснение: класс должен обеспечивать безопасность изменения данных только через свои методы.

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(225,321);

        bankAccount1.getBalance();

        System.out.println( bankAccount1.getBalance());

        bankAccount1.depositMoney(bankAccount1.getMoney(), bankAccount1.getBalance());

        System.out.println(bankAccount1.getBalance());

        bankAccount1.withDraw(352.41);

        bankAccount1.getBalance();

        System.out.println(bankAccount1.getBalance());
    }
}
