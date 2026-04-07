class Employee {
    int id;
    String name;
    int casualLeaves;
    int earnedLeaves;

    Employee(int id, String name, int casualLeaves, int earnedLeaves) {
        this.id = id;
        this.name = name;
        this.casualLeaves = casualLeaves;
        this.earnedLeaves = earnedLeaves;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Casual Leaves: " + casualLeaves);
        System.out.println("Earned Leaves: " + earnedLeaves);
    }
}
