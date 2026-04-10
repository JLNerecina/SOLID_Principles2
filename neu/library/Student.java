package neu.library;

public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    // DIP-compliant method - no more borrowBook(), borrowJournal(), etc.
    public void borrowResource(LibraryResource resource) {
        if (resource == null) {
            System.out.println("❌ Resource not found!");
            return;
        }
        if (resource.isAvailable()) {
            resource.borrow();
            System.out.println("🎓 " + name + " successfully borrowed: " + resource.getTitle());
        } else {
            System.out.println("❌ " + name + " cannot borrow (unavailable): " + resource.getTitle());
        }
    }
}