public class Main {

    public static void main(String[] args) {
        // write your code here
        Account accountSaving = new SavingsAccount("Savings Account");
        Account accountCredit = new CreditAccount("Credit Account");
        Account accountChecking = new CheckingAccount("Checking Account");


        //TEST1 - Попытка заплатить со сберегательного счета
        System.out.println("TEST1");
        accountSaving.pay(45);

        /*TEST2:
        1 - Пополняем сберегательный счет (50 руб)
        2 - Пытаемся перевести 100 руб со сберегательного счета на любой другой
            (Так как на сберегательном недост. средств - ошибка)
        3 - Пополняем сберегательный счет до 100 руб
        4 - Переводим 100 руб на любой другой счет (в данном случае кредитный)
            (Так как кредитный счет не может быть > 0 - ошибка)
        5 - Платим с кредитного счета (на нем становится -200 руб)
        6 - Переводим 50 руб на кредитный счет
        */
        System.out.println("\nTEST2");
        accountSaving.addMoney(50);
        accountSaving.transfer(accountCredit, 100);
        accountSaving.addMoney(50);
        accountSaving.transfer(accountCredit, 100);
        accountCredit.pay(200);
        accountSaving.transfer(accountCredit, 50);

        /*TEST3:
        1 - Пополняем сберегательный счет (500 руб)
        2 - Пытаемся перевести 1000 руб с расчетного счета на любой другой
            (Так как на расчетном недост. средств - ошибка)
        3 - Пополняем расчетный счет до 1000 руб
        4 - Переводим 1000 руб на любой другой счет
        6 - Пытаемся заплатить 200 руб
            (Так как на расчетном недост. средств - ошибка)
        7 - Переводим с кредитного счета на расчетный счет 500 руб
        8 - Пытаемся заплатить 400 руб - Успешно!
        9 - Погашаем долг на кредитном счете - кладем 150 рублей
        */
        System.out.println("\nTEST3");
        accountChecking.addMoney(500);
        accountChecking.transfer(accountSaving, 1000);
        accountChecking.addMoney(500);
        accountChecking.transfer(accountSaving, 1000);
        accountChecking.pay(200);
        accountCredit.transfer(accountChecking, 500);
        accountChecking.pay(400);
        accountCredit.addMoney(150);
    }
}
