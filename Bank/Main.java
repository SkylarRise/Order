package Bank;

import Bank.Reqvizits.Account;
import Bank.Service.CreateAccount;
import Bank.Service.DepositService;
import Bank.Service.PaymentService;
import Bank.Service.TransferService;

public class Main {
    public static void main(String[] args) {
        //Создаю новый аккаунт. Реквизиты - Person(имя,фамилия,номер) и счет Bill (сумма на счету);
        CreateAccount crAcc = new CreateAccount();
        Account account1 = crAcc.account("Игорь","Усков","8-962-758-84-39",50000);

        CreateAccount crAcc1 = new CreateAccount();
        Account account2 = crAcc1.account("Милена","Ускова","8-962-756-83-32",245000);

        //Проверка созданного аккаунта, счета, и денег на счету
        System.out.println(account1.getPerson().getName() + ". Сумма - " + account1.getBill().getAmount());
        System.out.println(account2.getPerson().getName() + ". Сумма - " + account2.getBill().getAmount());

        //Провожу платеж, т.е уменьшаю сумму со счета Bill
        PaymentService pay = new PaymentService();
        pay.payment(account1,25000);

        //Вкладываю деньги на счет, т.е увеличиваю сумму на счету Bill
        //DepositService deposite = new DepositService();
        //deposite.paymentDeposit (account1,25000);

        //Проверяю состояние денег на счету, после платежа
        //System.out.println(account1.getPerson().getName() + " пополнил свой счет!");
        //System.out.println("Сумма после вклада - " + account1.getBill().getAmount());

        //Первожу деньги с одного аккаунта на другой. Если Истина то с 1 на 2, если ложь то с 2 на 1.
        boolean bol;
        int tSize = 2500;
        TransferService trasf = new TransferService();
        trasf.transfer(account1,account2,tSize,true);

        System.out.println("Сумма на счету у " + account1.getPerson().getName()
                + " - " + account1.getBill().getAmount() + " руб.");

        System.out.println("Сумма на счету у " + account2.getPerson().getName()
                + " - " + account2.getBill().getAmount() + " руб.");


    }
}
