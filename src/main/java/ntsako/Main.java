package ntsako;

public class Main {
    public static void main(String[] args) {

        // 1. Create a new Book object with actual details
        Book myFirstBook = new Book("ISBN-9780", "Things Fall Apart", "Chinua Achebe");

        // 2. Create another Book object with different details
        Book mySecondBook = new Book("ISBN-1122", "Born a Crime", "Trevor Noah");

        // 3. Print out the details to see your data in action!
        System.out.println("--- Book 1 ---");
        System.out.println(myFirstBook.toString());
        // Notice how we can use the getter method you created
        System.out.println("Just the author: " + myFirstBook.getAuthor());

        System.out.println("\n--- Book 2 ---");
        System.out.println(mySecondBook.toString());

        // 4. You can also test out the inherited methods from LibraryItem!
        System.out.println("\nBorrowing Book 2...");
        mySecondBook.borrowItem();
        System.out.println("Is Book 2 borrowed? " + mySecondBook.isBorrowed());
    }
}