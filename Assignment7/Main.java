public class Main {
    public static void main(String[] args) {

        TicketSystem system = new TicketSystem();

        // 250 users trying to book
        for (int i = 1; i <= 250; i++) {
            BookingThread t = new BookingThread(system, "User-" + i);
            CancelThread c = new CancelThread(system, "CancelUser-" + i);
            t.start();
            c.start();
        }

        // 15 users cancelling
        for (int i = 1; i <= 15; i++) {
            CancelThread t = new CancelThread(system, "CancelUser- " + i);
            t.start();
        }
    }
}