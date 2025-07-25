package org.designpatterns.leaveHandlingModels;

public class Manager extends AbstractLeaveHandler {
    public Manager(LeaveHandler leaveHandler) {
        super(leaveHandler);
    }
    @Override
    public void handleLeaveRequest(int noOfDays) {
        if(noOfDays < 5) {
            System.out.println("Manager has approved the leave");
        } else if(this.nextHandler != null) {
            this.nextHandler.handleLeaveRequest(noOfDays);
        } else {
            throw new RuntimeException("Unhandled leave request");
        }
    }
}
