# Java_Summative

# Greenfield Lab: Library Management System

Welcome to your Java Summative Assessment. This greenfield project is designed to test your understanding of core Object-Oriented Programming (OOP) principles—specifically **Encapsulation** and **Inheritance**—as well as your ability to write comprehensive **Unit Tests**.

Your task is to complete the missing architecture and logic inside the provided template skeletons.

---

## Technical Objectives

To pass the assessment, your completed codebase must satisfy the following architectural rules:

### 1. Encapsulation (Data Hiding)
* **Field Security:** All state variables must be fully hidden from external classes, including subclasses. Choose visibility modifiers that enforce strict encapsulation.
* **Controlled State Transitions:** State mutation must not happen via arbitrary setter methods. You must implement defensive guard logic to ensure an item's state cannot be corrupted (e.g., preventing an item from being borrowed if it is already out).
* **API Accessors:** Expose safe, read-only paths to internal fields using standard public getter conventions.

### 2. Inheritance (The "Is-A" Relationship)
* **Class Hierarchy:** Establish a clean parental relationship where a specialized item inherits properties and core lifecycle behaviors from a generic asset base.
* **Constructor Chaining:** Ensure parent dependencies are initialized upstream immediately before subclass fields are processed.
* **Polymorphism & Overriding:** Customize inherited behavior to include subclass data fields. You must leverage compiler-level annotations to guarantee structural validity.

---

## Tasks to Complete

### Phase 1: Production Code Skeletons
Navigate to `src/main/java/` and complete the logic inside:
1. **`LibraryItem.java`**: Set up fields, initialize the default state safely, enforce business logic invariants in state mutation methods, and expose read accessors.
2. **`Book.java`**: Inherit from the base class, chain constructors cleanly, and override text representations without breaking the parent's encapsulation rules.

### Phase 2: Unit Testing
Navigate to `src/test/java/` and create a test suite class named `LibraryItemTest`. You must write isolated tests using JUnit 5 assertions to verify:
* Successful data initialization and state defaults.
* Successful mutation logic (Happy Path).
* Exceptional runtime states when business invariants are breached (Boundary/Error Path).

---

## How to Run the Verification Engine

Your project layout utilizes Maven conventions. To run the automated test suite and check your work, execute the following command in your terminal pane:

```bash
mvn clean test