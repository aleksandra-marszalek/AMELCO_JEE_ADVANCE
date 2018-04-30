package pl.coderslab.day2.s3.ex2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        DateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");


        Employee emp1 = new Employee("Jan", "Kowalski", "m", LocalDate.parse("1990-01-01"), 2000.0);
        Employee emp2 = new Employee("Janina", "Kowalska", "f", LocalDate.parse("1991-12-01"), 2500.0);
        Employee emp3 = new Employee("Anna", "Nowak", "f", LocalDate.parse("1985-03-20"), 1800.0);
        Employee emp4 = new Employee("Tomasz", "Wilkowiecki", "m", LocalDate.parse("1973-03-04"), 3000.0);
        Employee emp5 = new Employee("Katarzyna", "Wilk", "f", LocalDate.parse("1967-03-01"), 5000.0);


        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        System.out.println("===========p1============");

        //p1
        employees.stream()
                .filter(employee -> employee.getSurname().startsWith("N"))
                .forEach(System.out::println);

        System.out.println("===========p2============");

        //p2
        employees.stream()
                .filter(employee ->{
                int age = LocalDate.now().getYear() - employee.getBirthday().getYear();
                return (age >= 30 && age<=45);
                })
                .forEach(System.out::println);

        System.out.println("===========p3============");
        //p3
        List<Employee> newEmplist = employees.stream()
                .map(employee -> {
                    int age = LocalDate.now().getYear() - employee.getBirthday().getYear();
                    if (age>=20 && age<=30 && employee.getSex().equals("f") && employee.getSalary()<3500){
                        employee.setSalary(employee.getSalary()*1.05);
                        return employee;
                    } else {
                        return employee;
                    }
                })
                .collect(Collectors.toList());

        System.out.println("Before: ");
        employees.forEach(System.out::println);
        System.out.println("After: ");
        newEmplist.forEach(System.out::println);



    }




}
