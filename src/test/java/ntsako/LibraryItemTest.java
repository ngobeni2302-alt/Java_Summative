package ntsako;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit Test suite to verify Encapsulation, State Control, and Exceptional Paths.
 */
public class LibraryItemTest {

    private LibraryItem testItem;

    /**
     * Executes before every single test case.
     * Enforces test isolation so that state mutations do not leak across tests.
     */
    @BeforeEach
    public void setUp() {
        testItem = new LibraryItem("LIB-101", "Design Patterns");
    }

    /**
     * Verifies proper construction and structural encapsulation configurations.
     */
    @Test
    public void testInitialState_ShouldBeAvailable() {
        // Assert field values match constructor arguments via public APIs
        assertEquals("LIB-101", testItem.getId(), "The ID should match the initialization parameter.");
        assertEquals("Design Patterns", testItem.getTitle(), "The Title should match the initialization parameter.");

        // Assert invariant default state rule
        assertFalse(testItem.isBorrowed(), "A newly instantiated library item must default to not borrowed.");
    }

    /**
     * Verifies the Happy Path: State transitions successfully under normal business usage.
     */
    @Test
    public void testBorrowItem_Successful() {
        // Act: Execute state change
        testItem.borrowItem();

        // Assert: State flag correctly toggles
        assertTrue(testItem.isBorrowed(), "The item's borrowed state flag should be true after a successful borrow operation.");
    }

    /**
     * Verifies the Boundary/Error Path: State rules strictly block illegal state transitions.
     */
    @Test
    public void testBorrowItem_AlreadyBorrowed_ThrowsException() {
        // Arrange: Explicitly mutate item state into a pre-borrowed condition
        testItem.borrowItem();

        // Act & Assert: Execute step and catch the expected exception via an executable lambda block
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            testItem.borrowItem();
        }, "An IllegalStateException must be thrown if borrowItem is executed on an item already out.");

        // Deep Assertion: Validate the exact error context matches requirements
        assertEquals("Item is already borrowed", exception.getMessage(), "The exception message must match the specification precisely.");
    }
}