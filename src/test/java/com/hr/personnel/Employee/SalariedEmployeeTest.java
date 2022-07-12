package com.hr.personnel.Employee;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {

    @Test
    public void computeMonthlyCompensation() {

        SalariedEmployee sal1 = new SalariedEmployee("Test3", LocalDate.of(2022, 2, 2), 4000.0);
        double monthlyTaxToPay = sal1.computeMonthlyTaxToPay();
        Assert.assertEquals(300.0, monthlyTaxToPay, 0.01);
    }
}