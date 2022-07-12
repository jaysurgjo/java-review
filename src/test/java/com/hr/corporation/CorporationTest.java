package com.hr.corporation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CorporationTest {

    @Test
    public void computeMonthlyTaxToPay() {

        Corporation crp1 = new Corporation("test12", 10000.0);
        crp1.computeMonthlyTaxToPay();
        Assert.assertEquals(1000.0, monthlyTaxToPay, 0.01);
    }
}