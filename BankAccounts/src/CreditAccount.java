public class CreditAccount extends Account {
    private int balance;
    private String nameOfAccount;

    public CreditAccount(String nameOfAccount) {
        this.balance = balance;
        this.nameOfAccount = nameOfAccount;
    }

    @Override
    public String getName() {
        return this.nameOfAccount;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void pay(int amount) {
        this.balance -= amount;
        System.out.println("Оплата в размере " + amount + " рублей с " + this.nameOfAccount);
        System.out.println("Баланс " + this.nameOfAccount + " составляет: " + this.balance + " рублей");
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Перевод в размере " + amount + " рублей: "
                + this.nameOfAccount + " --> " + account.getName());
        account.addMoney(amount);
        System.out.println("Баланс " + this.nameOfAccount + " составляет: " + this.balance + " рублей");
    }

    @Override
    public void addMoney(int amount) {
        int newBalance = this.balance + amount;
        if (newBalance <= 0) {
            System.out.println("Баланс " + this.nameOfAccount + " составляет: " + this.balance + " рублей");
            this.balance += amount;
            System.out.println("После пополнения " + this.nameOfAccount + " Ваш баланс составляет: " + this.balance + " рублей");
        } else {
            System.out.println("ОШИБКА! Операция пополнения не может быть выполнена, так как " + this.nameOfAccount
                    + " должен быть <= 0");
            System.out.println("Баланс " + this.nameOfAccount + " составляет: " + this.balance + " рублей");
        }
    }
}
