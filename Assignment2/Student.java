public class Student {
	private String name = "";
	private int studentId = 0;
	Student(String name , int studentId) {
		this.name = name;
		this.studentId = studentId;
	}

	boolean issueAbook (Book book) {
		return book.issueBook(this);
	}
	
	boolean removeIssuedBook(Book book) {
		return book.removeIssue(); 
	} 
	public String getName() {
		return name;
	}
	public int getStudentId() {
		return studentId;
	}
	void display() {
		System.out.println("Student information: \n" +
			"Name: " + this.name + "\n" +
			"StudentId: " + this.studentId
		);
	}
}
