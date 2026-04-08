class BookingThread extends Thread {

    private TicketSystem system;
    private String userName;

    BookingThread(TicketSystem system, String userName) {
        this.system = system;
        this.userName = userName;
    }

    public void run() {
        system.bookTicket(userName);
    }
}