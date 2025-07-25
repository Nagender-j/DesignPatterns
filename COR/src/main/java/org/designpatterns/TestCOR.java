package org.designpatterns;

import org.designpatterns.models.Director;
import org.designpatterns.models.LeaveHandler;
import org.designpatterns.models.Manager;
import org.designpatterns.models.TeamLead;

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
