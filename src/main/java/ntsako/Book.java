package ntsako;

// Inheritance: Book 'is-a' LibraryItem
public class Book extends LibraryItem {

    // Unique subclass field
    private final String author;

    /**
     * Constructor for a Book instance.
     */
    public Book(String id, String title, String author) {
        // Constructor Chaining: Must be the absolute first statement
        super(id, title);
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    /**
     * Overrides the default description string.
     */
    @Override
    public String toString() {
        // Must use the parent's public getters to access the encapsulated fields
        return "Book [ID=" + getId() + ", Title='" + getTitle() + "', Author='" + this.author + "']";
    }
}