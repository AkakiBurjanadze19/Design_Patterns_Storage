package Behavioral.ChainOfResponsibility.SupportSystem;

public class Client {
    public static void main(String[] args) {
        SupportHandler botHandler = new BotHandler();
        SupportHandler juniortechnicianHandler = new JuniortechnicianHandler();
        SupportHandler seniorengineerHandler = new SeniorengineerHandler();
        SupportHandler ctoHandler = new CtoHandler();

        botHandler.setNextHandler(juniortechnicianHandler);
        juniortechnicianHandler.setNextHandler(seniorengineerHandler);
        seniorengineerHandler.setNextHandler(ctoHandler);

        SupportTicket ticket = new SupportTicket(1, "Fix very simple issue");

        botHandler.handleTicket(ticket);
    }
}
