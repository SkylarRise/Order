package Bank.Service;

import Bank.Reqvizits.Account;
import Bank.Reqvizits.Bill;
import Bank.Reqvizits.Person;

public class CreateAccount {
    public Account account(String name,String surname,String phoneNumb,int sum){

        Person person1 = new Person(name,surname,phoneNumb);
        Bill bill1 = new Bill(sum);
        Account acc1 = new Account(bill1,person1);

        return acc1;
    }
}
