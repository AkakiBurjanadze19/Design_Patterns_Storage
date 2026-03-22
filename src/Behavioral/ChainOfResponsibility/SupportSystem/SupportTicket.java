package Behavioral.ChainOfResponsibility.SupportSystem;

public class SupportTicket {
    private int priority;
    private String issueDescription;

    public SupportTicket(int priority, String issueDescription) {
        this.priority = priority;
        this.issueDescription = issueDescription;
    }

    public int getPriority() {
        return priority;
    }

    public String getIssueDescription() {
        return issueDescription;
    }
}