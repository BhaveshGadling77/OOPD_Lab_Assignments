public class Main {
	public static void main(String args[]) {
		Employee staff[] = {
			new Employee(1, "Amit"),
            new Employee(2, "Neha", 15000),
            new Employee(3, "Ravi", 20000, 2000),
            new Employee(4, "Priya"),
            new Employee(5, "Karan", 18000),
            new Employee(6, "Sneha", 22000, 1500),
            new Employee(7, "Rahul"),
            new Employee(8, "Pooja", 17000),
            new Employee(9, "Vikas", 25000, 3000),
            new Employee(10, "Anita")
		};

		System.out.println("\n BEFORE UPDATE ");
        for (Employee e : staff) {
            e.displayEmployee();
        }

        staff[2].update(3000); 
        staff[4].update(3);
        staff[7].update(2000, 2);

        System.out.println("\n AFTER UPDATE ");
        for (Employee e : staff) {
            e.displayEmployee();
        }
	} 
}

