package Behavioral.ChainOfResponsibility.SupportSystem;

public class SeniorengineerHandler extends SupportHandler {
    @Override
    public void handleTicket(SupportTicket supportTicket) {
        if (supportTicket.getPriority() == 3) {
            System.out.println(supportTicket.getIssueDescription());
            System.out.println("Senior engineer resolved an issue.");
        } else {
            super.handleTicket(supportTicket);
        }
    }
}
