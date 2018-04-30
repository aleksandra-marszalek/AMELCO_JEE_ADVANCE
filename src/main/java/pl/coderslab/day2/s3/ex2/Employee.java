package pl.coderslab.day2.s3.ex2;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private String name;
    private String surname;
    private String sex;
    private LocalDate birthday;
    private Double salary;

    @Override
    public String toString() {
        return  this.name+ " " + this.surname + "  " + this.sex + " " + this.birthday + " " + this.salary;
    }

    public Employee () {

    }

    public Employee(String name, String surname, String sex, LocalDate birthday, Double salary) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.birthday = birthday;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
