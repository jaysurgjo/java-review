package com.hr.personnel.Employee;

import com.hr.personnel.client.Employee;
import gov.irs.Taxpayer;

import java.time.LocalDate;

public abstract class HourlyEmployee extends Employee {

    private int hoursWorkedPerMonth;
    private double hourlyRate;

    public HourlyEmployee(String name, LocalDate localDate, int hoursWorkedPerMonth, double hourlyRate) {
//        this.name = name;
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }

    public double computeMonthlyCompensation() {
        return hourlyRate * hoursWorkedPerMonth;
    }

    public double computeMonthlyTaxToPay() {
        return computeMonthlyCompensation() * HOURLY_TAX_RATE;
    }

    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hoursWorkedPerMonth=" + hoursWorkedPerMonth +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
