package com.deptagency.assignment.comparator;

import com.deptagency.assignment.entities.Employee;

import java.util.Comparator;

/**
 * Compares employees based on their employee type. The comparator is used to compare and sort objects in the priority queue.
 * if respondent and manager are compared, then the respondent is declared as lower
 * if manager and director are compared, then manager is declared as lower
 * if two equal types are compared, then they are declared as equal
 */
public class EmployeeComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getEmployeeType().getPriority() < e2.getEmployeeType().getPriority()) {
            return -1;
        } else if(e1.getEmployeeType().getPriority() > e2.getEmployeeType().getPriority()) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
