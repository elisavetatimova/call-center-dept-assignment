package com.deptagency.assignment.entities;

/**
 * This class represents instances of type Call.
 * Calls are incoming objects taht should be dispatched in the call center.
 */
public class Call {
    private int callId;

    public Call(int callId) {
        this.callId = callId;
    }

    public int getCallId() {
        return callId;
    }
}
