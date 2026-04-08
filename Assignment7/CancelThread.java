class CancelThread extends Thread {

    private TicketSystem system;
    private String userName;

    CancelThread(TicketSystem system, String userName) {
        this.system = system;
        this.userName = userName;
    }

    public void run() {
        system.cancelTicket(userName);
    }
}