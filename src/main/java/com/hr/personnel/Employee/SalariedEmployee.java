package com.hr.personnel.Employee;

import com.hr.personnel.client.Employee;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    double monthlySalary;

    public SalariedEmployee(String name, LocalDate localDate, double monthlySalary) {
//        super( name, localDate);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return computeMonthlyCompensation() * SALARIED_TAX_RATE;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
