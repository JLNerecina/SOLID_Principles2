package neu.library;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<LibraryResource> resources = new ArrayList<>();

    public void addResource(LibraryResource resource) {
        resources.add(resource);
    }

    public LibraryResource findResourceByTitle(String title) {
        for (LibraryResource r : resources) {
            if (r.getTitle().equalsIgnoreCase(title)) {
                return r;
            }
        }
        return null;
    }
}