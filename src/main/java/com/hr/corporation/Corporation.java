package com.hr.corporation;

import gov.irs.Taxpayer;

public class Corporation implements Taxpayer {

    private String name;
    private double monthlyIncome;

    public Corporation(String name, double monthlyIncome) {
        this.name = name;
        this.monthlyIncome = monthlyIncome;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return computeMonthlyCompensation() * CORP_TAX_RATE;
    }

    private double computeMonthlyCompensation() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    @Override
    public String toString() {
        return "Corporation{" +
                "name='" + name + '\'' +
                ", monthlyIncome=" + monthlyIncome +
                '}';
    }
}


