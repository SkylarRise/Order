package Bank.Service;

import Bank.Reqvizits.Account;

public class serviceCheckZero {
    public int checkMinus(Account ac,int check){
        int i;
        if ((ac.getBill().getAmount() < 0) || ((ac.getBill().getAmount() - check) < 0)){
            return i = 1;
        }else {
            return i = 0;
        }
    }
}
