package org.designpatterns.models;

public class Director extends AbstractLeaveHandler {

    public Director(LeaveHandler leaveHandler) {
        super(leaveHandler);
    }
    @Override
    public void handleLeaveRequest(int noOfDays) {
        if(noOfDays < 10) {
            System.out.println("Director has approved the leave");
        } else if(this.nextHandler != null) {
            this.nextHandler.handleLeaveRequest(noOfDays);
        } else {
            throw  new RuntimeException("Unhandled leave request");
        }
    }
}
