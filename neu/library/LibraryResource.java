package neu.library;

public interface LibraryResource {
    String getTitle();
    boolean isAvailable();
    void borrow();
}