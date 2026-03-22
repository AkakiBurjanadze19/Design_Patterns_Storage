package Behavioral.ChainOfResponsibility.SupportSystem;

public abstract class SupportHandler {
    private SupportHandler next;

    public void setNextHandler(SupportHandler next) {
        this.next = next;
    }

    public void handleTicket(SupportTicket supportTicket) {
        if (this.next != null) {
            this.next.handleTicket(supportTicket);
        }
    }
}