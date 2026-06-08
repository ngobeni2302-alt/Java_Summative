package ntsako;

public class LibraryItem {

    // Encapsulation: Fields are strictly private
    private final String id;
    private final String title;
    private boolean isBorrowed;

    /**
     * Constructor to initialize a new Library Asset.
     */
    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
        this.isBorrowed = false; // Business rule: Default state is false
    }

    /**
     * Updates the internal state of the item to borrowed.
     * Throws an exception if an invalid state transition is attempted.
     */
    public void borrowItem() {
        // Defensive guard clause
        if (this.isBorrowed) {
            throw new IllegalStateException("Item is already borrowed");
        }
        this.isBorrowed = true;
    }

    // --- Public Getters ---

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isBorrowed() {
        return this.isBorrowed;
    }
}