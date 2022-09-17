package Bank.Service;

import Bank.Reqvizits.Account;
import Bank.Reqvizits.Bill;

public class PaymentService {
    public void payment(Account ac, int platej){

        //проверка возможности платежа
        serviceCheckZero check_ = new serviceCheckZero();
        int check = check_.checkMinus(ac,platej);
        if (check == 1){
            System.out.println("На счету не достаточно средств для оплаты.Пополните счет");
            return;
        }

        ac.getBill().setAmount(ac.getBill().getAmount() - platej);
        //Проверяю состояние денег на счету, после платежа
        System.out.println(ac.getPerson().getName() + " совершил платеж!");
        System.out.println("Сумма после платежа - " + ac.getBill().getAmount());

    }
}
