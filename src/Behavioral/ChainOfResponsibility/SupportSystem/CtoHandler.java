package Behavioral.ChainOfResponsibility.SupportSystem;

public class CtoHandler extends SupportHandler {
    @Override
    public void handleTicket(SupportTicket supportTicket) {
        if (supportTicket.getPriority() == 4) {
            System.out.println(supportTicket.getIssueDescription());
            System.out.println("Company CTO resolved an issue.");
        } else {
            super.handleTicket(supportTicket);
        }
    }
}