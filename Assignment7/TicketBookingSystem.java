class TicketSystem {
    private int availableTickets = 100;
    private final int originalTickets = availableTickets;
    // originalTickets -> it is for the checking if the cancelled tickets are > booked tickets.
    // synchronized -> only one thread at a time
    public synchronized boolean bookTicket(String userName) {
        if (availableTickets > 0) {
            availableTickets--;
            System.out.println(userName + " booked a ticket. Remaining: " + availableTickets);
            return true;
        } else {
            System.out.println(userName + " failed to book (No tickets left)");
            return false;
        }
    }

    public synchronized void cancelTicket(String userName) {
        if (originalTickets == availableTickets) {
            System.out.println(userName + " failed to cancel the tickets because it dosen't get purchased by user.");
            return;
        }
        availableTickets++;
        System.out.println(userName + " cancelled a ticket. Remaining: " + availableTickets);
    }

    public int getAvailableTickets() {
        return availableTickets;
    }
}