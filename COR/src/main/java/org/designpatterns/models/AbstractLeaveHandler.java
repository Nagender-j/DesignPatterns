package org.designpatterns.models;

public abstract class AbstractLeaveHandler implements LeaveHandler {
    public LeaveHandler nextHandler;

    public AbstractLeaveHandler(LeaveHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

}
