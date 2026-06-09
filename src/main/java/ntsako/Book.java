package ntsako;

/* Inheritance: Book 'is-a' LibraryItem\

*Inheritance is the ability of one class to receive the fields and methods of another class automatically, without rewriting them.
The class that gives is called the parent (or superclass).
The class that receives is called the child (or subclass).
The child gets everything the parent has — and can then add its own things on top.
*
*Inheritance always represents an "is-a" relationship.
A Book is a LibraryItem.
A Car is a Vehicle.
A Dog is an Animal.

extends - The keyword that establishes the relationship
super - How the child refers to and calls the parent
Override - When the child replaces a parent method with its own version
* */
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