package com.hr.personnel.client;

import com.hr.personnel.Employee.HourlyEmployee;
import com.hr.personnel.Employee.SalariedEmployee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
//        Employee employee1 = new Employee("sang", LocalDate.of(2020, 4, 20));
//        Employee employee2 = new Employee("Test2", LocalDate.of(2022, 2, 2));
//        Employee employee3 = new Employee("Test3", LocalDate.of(2022, 1, 20));

//        String employeeInfo1 = employee1.getEmplyeeInfo();
//        System.out.println(employeeInfo1);
//
//        String employeeInfo2 = employee1.getEmplyeeInfo();
//        System.out.println(employeeInfo1);
//
//        System.out.println(employee1.getName() + " worked");

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Jordan", LocalDate.of(2022, 3, 4), 3000.0);
        salariedEmployee1.setMonthlySalary(4000);
        salariedEmployee1.getEmplyeeInfo();
        System.out.println(salariedEmployee1);

        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Jared", LocalDate.of(2022, 5, 5), 4000.0);
        salariedEmployee2.setMonthlySalary(3000);
        salariedEmployee2.getEmplyeeInfo();
        System.out.println(salariedEmployee2);

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Test1", LocalDate.of(2020, 1, 2), 4, 4);
        hourlyEmployee1.setHourlyRate(40);
        hourlyEmployee1.setHoursWorkedPerMonth(160);
        hourlyEmployee1.getEmplyeeInfo();
        System.out.println(hourlyEmployee1);

        Department department = new Department("John", "building1");
//        department.addEmployee(employee1);
//        department.addEmployee(employee2);
//        department.addEmployee(employee3);

        int numberOfEmployeesWhoWorked
                = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.println("number = " + numberOfEmployeesWhoWorked);
    }
}

