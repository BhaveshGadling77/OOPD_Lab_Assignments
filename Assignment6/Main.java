public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(1, "Bhavesh", 5, 10);
        LeaveManager manager = new LeaveManager();

        try {
            emp.display();
            manager.applyLeave(emp, "casual", 4);
            manager.approveLeave(emp, "casual", 4);

        } catch (LeaveException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Final Leave Status:");
            emp.display();
        }
    }
}
