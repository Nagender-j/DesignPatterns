package org.designpatterns;

import org.designpatterns.leaveHandlingModels.Director;
import org.designpatterns.leaveHandlingModels.LeaveHandler;
import org.designpatterns.leaveHandlingModels.Manager;
import org.designpatterns.leaveHandlingModels.TeamLead;

public class TestCOR {
    public static void main(String[] args) {
        LeaveHandler director = new Director(null); // he is the final one,
        // so no next handlers for him
        LeaveHandler manager = new Manager(director);
        LeaveHandler teamLead = new TeamLead(manager);

        teamLead.handleLeaveRequest(1);
        teamLead.handleLeaveRequest(4);
        teamLead.handleLeaveRequest(8);

    }
}
