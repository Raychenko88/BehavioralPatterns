package org.example.facade;

public class WorkFlow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracer bugTracer = new BugTracer();

    public void solveProblems() {
        job.doJob();
        bugTracer.startSprint();
        developer.doJobBeforeDeadLine(bugTracer);
    }
}
