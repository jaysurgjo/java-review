package com.hr.personnel.client;


import gov.irs.Taxpayer;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Employee implements Taxpayer {

    private final String name;
    private final LocalDate localDate;

    public abstract double computeMonthlyCompensation();

    public String work() {
        return getName() + " worked.";
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return name;
    }

//    public setLocalDate() {
//
//    }

    public abstract String getEmplyeeInfo();

    @Override
    public String toString() {
        return "Employee_name: " + name + " localDate: " + localDate;
    }
}
