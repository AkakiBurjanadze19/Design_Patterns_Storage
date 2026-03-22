package Behavioral.ChainOfResponsibility.SupportSystem;

public class BotHandler extends SupportHandler {
    @Override
    public void handleTicket(SupportTicket supportTicket) {
        if (supportTicket.getPriority() == 1) {
            System.out.println(supportTicket.getIssueDescription());
            System.out.println("AI bot resolved an issue.");
        } else {
            super.handleTicket(supportTicket);
        }
    }
}