package com.hr.personnel.client;

import com.hr.personnel.Employee.SalariedEmployee;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DepartmentTest {

    @Test
    public void addEmployee() {
        Department department = new Department("Marketing", "building2");
        SalariedEmployee salariedEmployee101 = new SalariedEmployee("jane", LocalDate.of(2022, 2, 2), 4000.0);
        department.addEmployee(salariedEmployee101);
        Employee[] employees = department.getEmployees();

    }

    @Test
    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
    }
}