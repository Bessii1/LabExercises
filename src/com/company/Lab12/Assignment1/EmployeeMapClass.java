package com.company.Lab12.Assignment1;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMapClass {
    private Map<String, Employee> employeeMap;

    public EmployeeMapClass() {
        employeeMap = new HashMap<>();
    }

    public void add(Employee employee) {
        employeeMap.put(employee.getEmployeeId(), employee);
    }

    public Employee get(String idNumber) {
        return employeeMap.get(idNumber);
    }
}
