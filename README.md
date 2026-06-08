# Greenfield Lab: Library Management System Invariants

## 📖 The Scenario

You have been onboarded onto a greenfield engineering team building a brand-new internal **Library Asset Management System**. 

The initial core structure has been established, but a junior developer pushed partial code changes that broke data safety rules. Currently, any program in our system can bypass our business tracking logic and change critical fields like `isBorrowed` manually. Even worse, our application crashes unexpectedly because it allows items to be borrowed multiple times without any state tracking validation.

Your task is to refactor and implement the core engineering rules inside the `ntsako` package to secure our application architecture before it goes live.

---

## 🛠️ Step-by-Step Technical Requirements

Your objectives are split across two core files under `src/main/java/ntsako/`. You must replace the `TODO` placeholders with code that satisfies these exact rules:

### 1. Specifications for `LibraryItem.java`

* **Field Configuration (Encapsulation):**
  * Change the visibility modifiers of the three declared fields (`id`, `title`, and `isBorrowed`) from package-private to `private`. 
  * Mark the identity fields (`id` and `title`) as immutable using the `final` modifier.
* **Constructor Logic:**
  * Map the incoming constructor arguments explicitly to the instance fields using the `this` reference keyword (e.g., `this.id = id;`).
  * Explicitly set the internal state flag `this.isBorrowed` to `false` to define the baseline invariant state.
* **State Mutation Logic (`borrowItem()`):**
  * You must implement a defensive **guard clause** at the very top of the method using an `if` condition.
  * If `this.isBorrowed` evaluates to `true`, instantly halt execution by throwing a new `IllegalStateException` with the exact literal string: `"Item is already borrowed"`.
  * If the guard clause passes, alter the internal object state by assigning `this.isBorrowed = true;`.
* **API Accessors (Getters):**
  * Implement public getters that precisely return their corresponding private field data.
  * *Crucial Naming Rule:* Ensure your boolean accessor matches the standard Java bean naming convention (`public boolean isBorrowed()`) rather than a generic `get` prefix.

### 2. Specifications for `Book.java`

* **Class Architecture (Inheritance):**
  * Modify the class header to establish a strict parent-child hierarchy by appending `extends LibraryItem` to the class signature.
* **Subclass Field Isolation:**
  * Declare an internal field named `author` of type `String`. 
  * Enforce strict encapsulation rules by marking it `private` and `final`.
* **Constructor Chaining:**
  * Inside the `Book` constructor block, your **absolute first instruction** must be an upstream invocation to the parent class constructor using `super(id, title);`. 
  * *Warning:* Attempting to assign `this.author` before executing the `super()` chain will throw a fatal compile-time error.
* **Polymorphic Overriding (`toString()`):**
  * Implement a public `toString()` method that returns a descriptive layout string.
  * Place the `@Override` metadata annotation directly above the method declaration to enable compiler verification.
  * *Encapsulation Constraint:* Because the parent class properties are sealed under `private` access modifiers, you **cannot** reference `this.id`, `super.id`, `this.title`, or `super.title` directly inside this subclass. You must access them polymorphically by executing the inherited public getter methods: `getId()` and `getTitle()`.

---

## 🧪 How to Run and Pass the Test Suite

Your environment runs on Maven. A complete unit testing engine (`LibraryItemTest.java`) has been pre-configured to automatically grade your encapsulation and state-guarding mechanics.

### Step 1: Open Your Terminal
Open the built-in terminal at the bottom pane of your IDE workspace, ensuring you are in the project's root folder (where `pom.xml` resides).

### Step 2: Execute the Automated Verifier
Run the following build command to clean old compilation fragments, compile your fresh changes, and spin up the testing engine:

```bash
mvn clean test
