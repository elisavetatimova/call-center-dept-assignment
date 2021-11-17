package com.deptagency.assignment.entities;

/**
 * Lowest ranking employee in the hierarchy.
 */
public class Respondent extends Employee {
    public Respondent(int employeeId) {
        super(employeeId);
        setEmployeeType(EmployeeType.RESPONDENT);
    }
}
