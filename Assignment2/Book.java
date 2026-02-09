public class Book {
	private String authorName;
	private String title;
	private double price;
	private int edition;
	private boolean isIssued;
	private Student issuedTo;
	static int totalBooks = 0;
	static int totalIssuedBooks = 0;

	Book(String title, String authorName, double price, int edition) {
		this.authorName = authorName;
		this.title = title;
		this.price = price;
		this.edition = edition;
		this.isIssued = false;
		Book.totalBooks++;
		this.issuedTo = null;
	}

	// this will issue the book to a particular student object.
	public boolean issueBook(Student st) {
		if (this.isIssued)
			return false;

		this.issuedTo = st;
		this.isIssued = true;
		Book.totalIssuedBooks++;
		return true;
	}

	// this method will removeIssue from the book
	public boolean removeIssue() {
		if (!this.isIssued) {
			return false;
		}
		this.issuedTo = null;
		this.isIssued = false;
		Book.totalIssuedBooks--;
		return true;
	}

	public static int getTotalBooks() {
		return Book.totalBooks;
	}

	public static int getTotalIssuedBooks() {
		return Book.totalIssuedBooks;
	}

	// isIssued if the issued then will return the student object.
	// this will return student object if assigned to any one
	public boolean isIssued() {
		return this.isIssued;
	}

	public Student getIssuedTo() {
		return this.issuedTo;
	}

	// this function will used to display the book details
	public void display() {
		System.out.println(
				"Book: " + this.title + "\n" +
						", Author Name: " + this.authorName + "\n" +
						", Price: " + this.price + "\n" +
						", Edition: " + this.edition + "\n" +
						", Issued: " + (this.isIssued ? "Yes" : "No"));
		if (this.isIssued) {
			System.out.println("This book is Issued to: " + this.issuedTo.getName());
		}
	}

	//this will print the total percentage of the 
	public static void printIssuedPercentage() {
		if (totalBooks == 0) {
			System.out.println("No books in library");
			return;
		}

		double percentage = (totalIssuedBooks * 100.0) / totalBooks;
		System.out.println("Issued Books Percentage: " + percentage + "%");
	}

}
