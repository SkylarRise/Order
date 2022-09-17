package Bank.Reqvizits;

import Bank.Reqvizits.Bill;

public class Deopsit {
    private Bill bill;

    public Deopsit(Bill bill) {
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
