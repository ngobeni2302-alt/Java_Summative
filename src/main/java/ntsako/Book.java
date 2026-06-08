package ntsako;

/**
 * TODO: Establish an Inheritance relationship. Make this class inherit from LibraryItem.
 */
public class Book {

    // 1. Encapsulation: Declare a private String field unique to books named 'author'
    // ____ String author;

    /**
     * Constructor for a Book instance.
     * TODO: Use constructor chaining to pass down 'id' and 'title' to the superclass.
     * Then initialize the unique subclass field.
     */
    public Book(String id, String title, String author) {
        // TODO: Core parent initialization must happen first here

        // TODO: Subclass field initialization
    }

    public String getAuthor() {
        // TODO: Your code here
        return null;
    }

    /**
     * TODO: Override the default toString() method to return a custom description string.
     * Remember to use the compiler metadata annotation for safeguards.
     * Hint: Pay attention to how you access the parent's private fields (id, title).
     */
    // ____ String toString() {
    //     return ...
    // }
}