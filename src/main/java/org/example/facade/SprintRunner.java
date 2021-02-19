package org.example.facade;

public class SprintRunner {
    public static void main(String[] args) {
//        Job job = new Job();
//        job.doJob();
//        BugTracer bugTracer = new BugTracer();
//        bugTracer.startSprint();
//        Developer developer = new Developer();
//        developer.doJobBeforeDeadLine(bugTracer);
//
//        bugTracer.finishSprint();
//        developer.doJobBeforeDeadLine(bugTracer);

        WorkFlow workFlow = new WorkFlow();
        workFlow.solveProblems();
    }
}
