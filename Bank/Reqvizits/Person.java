package Bank.Reqvizits;

public class Person {
    private String name;
    private String surname;
    private String numberOfPhone;

    public Person(String name, String surname, String numberOfPhone) {
        this.name = name;
        this.surname = surname;
        this.numberOfPhone = numberOfPhone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumberOfPhone(String numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }
}
