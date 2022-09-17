package Bank.Reqvizits;

public class Account {
    private Bill bill;
    private Person person;

    public Account(Bill bill, Person person) {
        this.bill = bill;
        this.person = person;
    }

    public Bill getBill() {
        return bill;
    }

    public Person getPerson() {
        return person;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
