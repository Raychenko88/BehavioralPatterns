package org.example.facade;

public class Developer {
    public void doJobBeforeDeadLine(BugTracer bugTracer) {
        if (bugTracer.isActiveSprint()) {
            System.out.println("Developer is solving problems ");
        }else {
            System.out.println("Developer is reading Habrahabr");
        }
    }
}
