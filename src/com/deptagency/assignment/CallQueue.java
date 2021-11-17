package com.deptagency.assignment;

import com.deptagency.assignment.entities.Call;

import java.util.ArrayList;
import java.util.List;

/**
 * Queue where the call center is receiving calls in sequential order.
 * This class is singleton, only one instance of the class is created and used in the application.
 */
public class CallQueue {
    private static final int NUMBER_OF_CALLS = 100;
    private static CallQueue INSTANCE;
    private final List<Call> calls = new ArrayList<>();
    private CallQueue() {
        for(int i=0; i<NUMBER_OF_CALLS; i++) {
            calls.add(new Call(i));
        }
    }

    public List<Call> getCalls() {
        return calls;
    }

    public static CallQueue getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new CallQueue();
        }
        return INSTANCE;
    }
}
