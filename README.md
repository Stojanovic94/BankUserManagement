# Banking System with Strategy and Factory Method Design Patterns

This project demonstrates the use of the **Strategy** and **Factory Method** design patterns in a banking system. The system handles different user types (`StandardUser`, `VIPUser`, and `Entrepreneur`) with distinct behaviors, and employs a factory to streamline user creation.

---

## Design Patterns Used

### 1. Strategy Pattern
#### Overview:
The **Strategy Pattern** allows the definition of multiple algorithms or behaviors (strategies) and enables dynamic application without modifying the base class.

#### How It Is Applied:
- Each user type (`StandardUserStrategy`, `VIPUserStrategy`, `EntrepreneurStrategy`) implements a shared interface `UserTypeStrategy`.
- The `BankUser` class uses an instance of `UserTypeStrategy` to define the user's behavior (e.g., maximum withdrawal limits, special services, account access).
- New user types (strategies) can be added easily without modifying the existing `BankUser` class.

---

### 2. Factory Method Pattern
#### Overview:
The **Factory Method Pattern** centralizes the creation of objects, delegating the instantiation responsibility to a dedicated method or class.

#### How It Is Applied:
- The `UserFactory` class contains a `createUser` method that creates instances of `BankUser` based on the input user type (`standard`, `vip`, `entrepreneur`).
- This pattern simplifies object creation, making the code more extensible and maintainable.

---

## Advantages of This Approach

1. **Extensibility**:  
   Adding new user types is straightforward. You only need to implement a new strategy and update the factory without altering existing logic.

2. **Maintainability**:  
   Strategies and the factory keep the code modular, making it easier to understand, test, and modify.

3. **Open/Closed Principle (OCP)**:  
   The system is open for extensions (e.g., adding new user types) but closed for modifications to existing code.

---
