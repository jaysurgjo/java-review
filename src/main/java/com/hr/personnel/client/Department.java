package com.hr.personnel.client;

public class Department {

    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
    private int currentIndex = 0;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    void addEmployee(Employee employee) {
        employees[currentIndex] = employee;
        currentIndex++;
    }

    int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int employeeWorked = 0;
         for (int i = 0; i < currentIndex; i++) {
            String work = employees[i].work();
            if (work.contains("worked")) {
                employeeWorked++;
            }
        }
         return employeeWorked;
    }

    private double computeDepartmentMonthlyTotalCompensation() {
        double total = 0;
        for (Employee emp : employees) {
        }
        return total;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public Employee[] getEmployees() {
        return new Employee[0];
    }
}
