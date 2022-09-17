package Bank.Service;

import Bank.Reqvizits.Account;
import Bank.Reqvizits.Payment;

public class TransferService {
    public void transfer(Account ac1,Account ac2,int transferSize,boolean bol){
      if (bol) {
          //проверка возможности платежа
          serviceCheckZero check_ = new serviceCheckZero();
          int check = check_.checkMinus(ac1, transferSize);
          if (check == 1) {
              System.out.println("На счету не достаточно средств для оплаты.Пополните счет");
              return;
          }
          //Уменьшаю сумму на счету в размере перевода с первого аккаунта
          PaymentService transferase = new PaymentService();
          transferase.payment(ac1, transferSize);

          //Увеличиваю сумму на счету в размере перевода на втором аккаунте
          DepositService transferDep = new DepositService();
          transferDep.paymentDeposit(ac2, transferSize);

          System.out.println(ac1.getPerson().getName() + " перевел деньги со своего счета, на счет - " +
                  ac2.getPerson().getName() + " в размере " + transferSize + " руб.");

      }else {
            //проверка возможности платежа
            serviceCheckZero check_ = new serviceCheckZero();
            int check = check_.checkMinus(ac2,transferSize);
            if (check == 1) {
                System.out.println("На счету не достаточно средств для оплаты.Пополните счет");
                return;
            }

            //Уменьшаю сумму на счету в размере перевода с первого аккаунта
          PaymentService transferase = new PaymentService();
          transferase.payment(ac2,transferSize);

          //Увеличиваю сумму на счету в размере перевода на втором аккаунте
          DepositService transferDep = new DepositService();
          transferDep.paymentDeposit(ac1,transferSize);

          System.out.println(ac2.getPerson().getName() + " перевел деньги со своего счета, на счет - " +
                  ac1.getPerson().getName() + " в размере "  + transferSize + " руб.");
      }

    }
}
