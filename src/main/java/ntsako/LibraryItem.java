package ntsako;

/**
 * TODO: Ensure proper Encapsulation by choosing the correct visibility
 * modifier for the fields below so they cannot be accessed directly outside this class.
 */
public class LibraryItem {

    // 1. Declare fields here: id (String), title (String), isBorrowed (boolean)
    // ____ String id;
    // ____ String title;
    // ____ boolean isBorrowed;

    /**
     * Constructor to initialize a new Library Asset.
     * TODO: Initialize id and title. Ensure 'isBorrowed' defaults to false.
     */
    public LibraryItem(String id, String title) {
        // TODO: Your code here
    }

    /**
     * Updates the internal state of the item to borrowed.
     * TODO: Implement state validation. If the item is already borrowed,
     * throw an IllegalStateException with the precise message: "Item is already borrowed"
     */
    public void borrowItem() {
        // TODO: Add guard clause and state mutation logic here
    }

    // --- Public Getters ---
    // TODO: Implement standard public getters to safely expose the internal fields

    public String getId() {
        // TODO: Your code here
        return null;
    }

    public String getTitle() {
        // TODO: Your code here
        return null;
    }

    public boolean isBorrowed() {
        // TODO: Your code here
        return false;
    }
}