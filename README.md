# Addressing SOLID Principles

## Use Case
A library management system that handles book details and user interactions.


###  (SRP)
- **Violation**: A single class handles both book management and user interactions.
- **Solution**: Separate responsibilities into different classes.

###  (OCP)
- **Violation**: A class requires modification to add new user types.
- **Solution**: Use inheritance to extend functionality without modifying existing code.

###  (ISP)
- **Violation**: An interface includes methods not relevant to all implementing classes.
- **Solution**: Split the interface into smaller, more specific interfaces.