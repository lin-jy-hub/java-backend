package Person;

import MyDate.MyDate;

public class Employee extends Person{
    String office;
    int salary;
    MyDate dateHired;
    public String toString() {
        return "Employee " + name;
    }
}
