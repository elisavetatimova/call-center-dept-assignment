package com.deptagency.assignment;

import com.deptagency.assignment.entities.Call;

import java.util.List;

/**
 * Main class Call center.
 * Invokes the incoming calls and dispatches them to the call handler.
 */
public class CallCenter {

    public static void main(String [] args) {
        CallHandler callHandler = CallHandler.getInstance();

        List<Call> calls = CallQueue.getInstance().getCalls();
        calls.forEach(callHandler::dispatchCall);

    }
}
