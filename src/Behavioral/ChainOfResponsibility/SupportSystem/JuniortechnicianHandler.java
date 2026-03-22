package Behavioral.ChainOfResponsibility.SupportSystem;

public class JuniortechnicianHandler extends SupportHandler {
    @Override
    public void handleTicket(SupportTicket supportTicket) {
        if (supportTicket.getPriority() == 2) {
            System.out.println(supportTicket.getIssueDescription());
            System.out.println("Junior technician resolved an issue.");
        } else {
            super.handleTicket(supportTicket);
        }
    }
}