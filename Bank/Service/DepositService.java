package Bank.Service;

import Bank.Reqvizits.Account;
import Bank.Reqvizits.Bill;

public class DepositService {
    public void paymentDeposit (Account ac, int platej){
        //Совершения платежа на счет BILL
        //К имеющимуся баланса на счету, прибавляется сума платежа
        //Т.е увеличивается сумма на счету
        ac.getBill().setAmount(ac.getBill().getAmount() + platej);

    }
}
