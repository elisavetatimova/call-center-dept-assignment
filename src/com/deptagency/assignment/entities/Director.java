package com.deptagency.assignment.entities;

/**
 * Director represents an employee with highest rank the hierarchy.
 */
public class Director extends Employee {
    public Director(int employeeId) {
        super(employeeId);
        setEmployeeType(EmployeeType.DIRECTOR);
    }
}
