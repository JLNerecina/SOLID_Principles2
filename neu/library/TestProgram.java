package neu.library;

public class TestProgram {
    public static void main(String[] args) {
        Library library = new Library();

        // Add current resources
        library.addResource(new Book("Java Programming"));
        library.addResource(new Thesis("AI in Education"));
        library.addResource(new Capstone("Mobile App Development"));
        library.addResource(new Journal("IEEE Transactions"));
        library.addResource(new Newspaper("Daily Inquirer"));
        library.addResource(new InternetAccess("Library Wi-Fi Station 1"));

        // Demonstrate future resource type (AudioBook) - no changes to Student or Library needed!
        library.addResource(new AudioBook("Clean Code - Audiobook"));

        Student student = new Student("John Lian R. Nerecina");

        System.out.println("=== NEU Library Borrowing Test (SOLID Refactored) ===\n");

        // Successful borrows
        student.borrowResource(library.findResourceByTitle("Java Programming"));
        student.borrowResource(library.findResourceByTitle("IEEE Transactions"));
        student.borrowResource(library.findResourceByTitle("Clean Code - Audiobook")); // future type

        // Attempt to borrow the same book again (unavailable)
        System.out.println("\n--- Trying to borrow same book again ---");
        student.borrowResource(library.findResourceByTitle("Java Programming"));

        System.out.println("\n✅ Test completed. New resource types can be added without touching Student class!");
    }
}