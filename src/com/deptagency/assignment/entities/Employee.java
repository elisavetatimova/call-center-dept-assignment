package com.deptagency.assignment.entities;

/**
 * An abstract representation of an employee.
 * This class is set an abstract and no direct instances are created, but only through the it's child classes.
 */
public abstract class Employee {
    private int employeeId;
    private EmployeeType employeeType;

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    protected void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public enum EmployeeType {
        RESPONDENT(1), MANAGER(2), DIRECTOR(3);

        private int priority;
        EmployeeType(int priority) {
            this.priority = priority;
        }
        public int getPriority() {
            return priority;
        }
    }
}
