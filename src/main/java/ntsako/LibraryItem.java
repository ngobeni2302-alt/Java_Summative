package ntsako;
/*Fields vs Variables
They are both named containers that hold a value — but where they are declared determines
everything about how they behave.

A variable is declared in a method and exists for as long as the method exists but a Field is declared in a class
in a class outside a method.

The Two Sides of Encapsulation
Encapsulation has two responsibilities working together:
1. Hiding — keeping internal data private and protected from the outside world. This is about preventing unauthorised or accidental interference with an object's state.
2. Exposing — deliberately providing controlled access points through methods. This is about deciding exactly what the outside world can do, and how it can interact with the object.
These two sides create a clear boundary between the inside of a class and the outside. That boundary is what encapsulation is fundamentally about.

Access Modifiers
Access modifiers are the Java keywords that enforce encapsulation. They control the visibility of classes, fields, and methods.

private
The most restrictive modifier. A private member is visible only inside the class it belongs to. Nothing outside — no other class, no subclass — can see or touch it.
This is the primary tool of encapsulation. Fields are almost always private.

public
The most open modifier. A public member is visible to every class everywhere in the program.
This is what you use for the methods you deliberately expose — the interface of the class.

protected
A middle ground. A protected member is visible to the class itself and to any class that inherits from it (subclasses).
This becomes relevant when working with inheritance — when you want subclasses to access something but still want to hide it from the rest of the world.

Default (No Modifier)
When no modifier is written, Java applies package-private visibility. The member is accessible to any class within the same package, but invisible outside of it.
 */

public class LibraryItem {
    // We created a blueprint for LibraryItem publicly, meaning another programme can access it and use it.

    // Encapsulation: Fields are strictly private
    // This is where encapsulation goes on, id, title are private meaning that once set, they stay the same until they get changed or updated.
    // The boolean is for whether a book has been borrowed or not based on the title
    private final String id;
    private final String title;
    private boolean isBorrowed;

    /**
     * Constructor to initialize a new Library Asset.
     */
    public LibraryItem(String id, String title) {
        /* this is the constructor, meaning every library item that is created should have these specifics,
        an id, title and isborrowed() set to false cause no one has borrowed it yet.
         */
        this.id = id;
        this.title = title;
        this.isBorrowed = false; // Business rule: Default state is false
    }

    /**
     * Updates the internal state of the item to borrowed.
     * Throws an exception if an invalid state transition is attempted.
     */
    public void borrowItem() {
        /* now this method handles the borrowed part, if the library item is borrowed, it should return
        * true and also a IllegalStateException that prints the message "Item is already borrowed" so that
        * they know that the item is no longer available
        *
        * So basically throw IllegalStateException is like raise ValueError explaining that what you are trying to reach out for is
        * not there. Now new means that you are creating the value error since there is no class or variable for it. */
        if (this.isBorrowed) {
            throw new IllegalStateException("Item is already borrowed");
        }
        this.isBorrowed = true;
    }

    // --- Public Getters ---
    /* Now these public getters allows the world have access to it but not be able to change the fields
    * the most they can do is just read, not change
    * You use this because two things share the same name — not because the field is private.*/
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