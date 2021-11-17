package com.deptagency.assignment;

import com.deptagency.assignment.entities.*;
import com.deptagency.assignment.comparator.EmployeeComparator;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Call Handler class handles each individual call based on the available employees.
 * This class is singleton, only one instance of the class is created and used in the application.
 */
public class CallHandler {
    private static final int NUMBER_OF_RESPONDENTS = 10;
    private static final int NUMBER_OF_MANAGERS = 5;
    private static final int NUMBER_OF_DIRECTORS = 2;

    private static CallHandler INSTANCE;

    private final Queue<Employee> employees = new PriorityQueue<>(new EmployeeComparator());

    private CallHandler() {
        for(int i=0; i<NUMBER_OF_RESPONDENTS; i++) {
            employees.add(new Respondent(i));
        }

        for(int i=0; i<NUMBER_OF_MANAGERS; i++) {
            employees.add(new Manager(i));
        }

        for(int i=0; i<NUMBER_OF_DIRECTORS; i++) {
            employees.add(new Director(i));
        }
    }

    /**
     * The call is dispatched and picked up by an employee based on their ranking.
     * In case no employees are available at the moment an error message will be printed.
     * @param call - the call to be dispatched.
     */
    public void dispatchCall(Call call) {
        if(employees.isEmpty()) {
            System.out.println("There is no available employee at the moment.");
        } else {
            Employee emp = employees.poll();
            System.out.println("Employee "+" "+emp.getEmployeeId()+" "+" "+emp.getEmployeeType()+" is handling the call with id "+ call.getCallId());
        }
    }

    public static CallHandler getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new CallHandler();
        }
        return INSTANCE;
    }
}
