package org.designpatterns.models;

public class TeamLead extends AbstractLeaveHandler {
    public TeamLead(LeaveHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleLeaveRequest(int noOfDays) {
        if(noOfDays < 2) {
            System.out.println("TeamLead has approved leave request");
        } else if(this.nextHandler != null) {
            this.nextHandler.handleLeaveRequest(noOfDays);
        } else {
            throw new RuntimeException("unhandled leave request");

        }
    }
}
