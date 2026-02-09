public class Main {
    public static void main(String[] args) {
        //creating of student objects.

        Student st1 = new Student("Bhavesh Gadling", 101);
        Student st2 = new Student("Sumit Desai", 102);
        Student st3 = new Student("Piyush Deshpande", 103);

        //creating 10 books.
        Book b1 = new Book("Java", "James Gosling", 500, 1);
        Book b2 = new Book("C++", "Bjarne Stroustrup", 450, 2);
        Book b3 = new Book("Python", "Guido van Rossum", 600, 3);
        Book b4 = new Book("OS", "Silberschatz", 700, 6);
        Book b5 = new Book("DBMS", "Korth", 650, 5);
        Book b6 = new Book("CN", "Tanenbaum", 550, 4);
        Book b7 = new Book("DSA", "CLRS", 800, 3);
        Book b8 = new Book("AI", "Russell", 750, 2);
        Book b9 = new Book("ML", "Murphy", 900, 1);
        Book b10 = new Book("Spring", "Pivotal", 850, 1);

        //book issues
        System.out.println(st1.issueAbook(b1));
        System.out.println(st1.issueAbook(b2));
        System.out.println(st2.issueAbook(b2));
        // st3.issueAbook(b3);

        System.out.println("Total Book Issued: "+ Book.getTotalBooks());
        System.out.println("Issued Books: " + Book.getTotalIssuedBooks());
        Book.printIssuedPercentage();

        // Return a book
        st1.removeIssuedBook(b1);

        // 7. Print updated stats
        System.out.println("\nAfter returning a book:");
        System.out.println("Issued Books: " + Book.getTotalIssuedBooks());
        Book.printIssuedPercentage();
    }
}
