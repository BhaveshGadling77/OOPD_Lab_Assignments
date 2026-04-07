class LeaveManager {

    // Apply leave
    void applyLeave(Employee emp, String type, int days) throws LeaveException {

        // ASSERT
        assert days > 0 : "Leave days must be greater than 0";

        if (type.equalsIgnoreCase("casual")) {
            if (emp.casualLeaves < days) {
                throw new LeaveException("Not enough casual leaves!");
            }
        } else if (type.equalsIgnoreCase("earned")) {
            if (emp.earnedLeaves < days) {
                throw new LeaveException("Not enough earned leaves!");
            }
        } else {
            throw new LeaveException("Invalid leave type!");
        }

        System.out.println("Leave applied successfully for " + days + " days.");
    }

    // Approve leave
    void approveLeave(Employee emp, String type, int days) {

        if (type.equalsIgnoreCase("casual")) {
            emp.casualLeaves -= days;
        } else if (type.equalsIgnoreCase("earned")) {
            emp.earnedLeaves -= days;
        }

        System.out.println("Leave approved!");
    }

    // Reject leave
    void rejectLeave() {
        System.out.println("Leave rejected!");
    }
}
