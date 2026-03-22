package Behavioral.ChainOfResponsibility.SupportSystem;

public class Client {
    public static void main(String[] args) {
        BotHandler botHandler = new BotHandler();
        JuniortechnicianHandler juniortechnicianHandler = new JuniortechnicianHandler();
        SeniorengineerHandler seniorengineerHandler = new SeniorengineerHandler();
        CtoHandler ctoHandler = new CtoHandler();

        botHandler.setNextHandler(juniortechnicianHandler);
        juniortechnicianHandler.setNextHandler(seniorengineerHandler);
        seniorengineerHandler.setNextHandler(ctoHandler);

        SupportTicket ticket = new SupportTicket(1, "Fix very simple issue");

        botHandler.handleTicket(ticket);
    }
}
