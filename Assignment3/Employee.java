public class Employee {
	 int id;
	 String name;
	 double salary = 10000.00;
	 double bonus = 0;
	 int rating = 1;

	//constructor overloading.
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = this.salary + salary;
	}

	Employee(int id, String name, double salary, double bonus) {
		this.id = id;
		this.name = name;
		this.salary = this.salary + salary;
		this.bonus = bonus;
	}

	void update(double bonus) {
        this.bonus = bonus;
    }

    void update(int rating) {
        this.rating = rating;
    }

    void update(double bonus, int rating) {
        this.bonus = bonus;
        this.rating = rating;
    }

    double totalSalary() {
        return salary + (bonus * rating);
    }
	
	void displayEmployee() {
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Bonus: " + this.bonus);
		System.out.println("Rating: " + this.rating);
		System.out.println("Total Salary: "+ totalSalary());
		System.out.println();
	}
}
