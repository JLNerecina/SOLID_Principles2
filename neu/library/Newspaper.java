package neu.library;

public class Newspaper implements LibraryResource {
    private final String title;
    private boolean available = true;

    public Newspaper(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() { return title; }
    @Override
    public boolean isAvailable() { return available; }
    @Override
    public void borrow() {
        if (available) {
            available = false;
            System.out.println("✅ Newspaper borrowed: " + title);
        }
    }
}