package com.deptagency.assignment.entities;

/**
 * Higher ranking employee in the hierarchy.
 */
public class Manager extends Employee {
    public Manager(int employeeId) {
        super(employeeId);
        setEmployeeType(EmployeeType.MANAGER);
    }
}
