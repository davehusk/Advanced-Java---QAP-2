# **Advanced Java QAP 2**

This is my Advanced Java QAP 2 project. The repository includes solutions for problems involving object-oriented programming concepts such as aggregation, composition, and method overloading.

---

David Husk
dave.husk@keyin.com

1. How long did it take: About 2 hours to complete
2. Resources: Used your lectures
3. Ask friends: No
4. Ask instructor: No
5. Rate: Questions 1 and 2 were straight forward. Question 3 was more difficult from extra steps

---

## **Project URL**
[Visit the Project Repository](https://github.com/davehusk/Advanced-Java-QAP-2)

---

### **Contents**
- Problem 1: MyLine and MyPoint
- Problem 2: MyRectangle
- Problem 3: Credit Card Management System

Here is the **README.md** file, including the UML diagrams for **Problem 2 (MyRectangle)** and **Problem 3 (CreditCard System)** in a well-formatted markdown layout.

---

# **Advanced Java QAP 2**
This project demonstrates object-oriented programming concepts including aggregation, composition, constructors, method overloading, and UML-based problem-solving.

---

## **Project Overview**

#### **UML Diagram**
```
+-----------------------------------------------------+
|    MyRectangle                                      |
+-----------------------------------------------------+
| -topLeft: MyPoint                                   |
| -bottomRight: MyPoint                               |
+-----------------------------------------------------+
| +MyRectangle(topLeft: MyPoint, bottomRight: MyPoint)|
| +MyRectangle(x1: int, y1: int, x2: int, y2: int)    |
| +getTopLeft(): MyPoint                              |
| +setTopLeft(topLeft: MyPoint): void                 |
| +getBottomRight(): MyPoint                          |
| +setBottomRight(bottomRight: MyPoint): void         |
| +getWidth(): int                                    |
| +getHeight(): int                                   |
| +getArea(): int                                     |
| +getPerimeter(): int                                |
| +toString(): String                                 |
+-----------------------------------------------------+
```

#### **Files**
- `MyRectangle.java` - Implements the rectangle class.
- `TestMyRectangle.java` - Tests rectangle methods.
- `UML-MyRectangle.txt` - UML reference file.

#### **Status**
✅ Problem 2 Completed.

---

### **Problem 3: Credit Card Management System**
The **CreditCard** system simulates basic credit card functionalities including balance tracking, credit limits, and transactions.

#### **UML Diagram**
```
+-----------------------------------------------------+
|     Money                                           |
+-----------------------------------------------------+
| - dollars: long                                     |
| - cents: long                                       |
+-----------------------------------------------------+
| + Money(amount: double)                             |
| + Money(other: Money)                               |
| + add(other: Money): Money                          |
| + subtract(other: Money): Money                     |
| + compareTo(other: Money): int                      |
| + equals(obj: Object): boolean                      |
| + toString(): String                                |
+-----------------------------------------------------+
          ▲
          │ (Used in)
          │
+-----------------------------------------------------+
|     Address                                         |
+-----------------------------------------------------+
| - street: String                                    |
| - city: String                                      |
| - state: String                                     |
| - zip: String                                       |
+-----------------------------------------------------+
| + Address(street: String, city: String, state: String, zip: String) |
| + toString(): String                                |
+-----------------------------------------------------+
          ▲
          │ (Used in)
          │
+-----------------------------------------------------+
|     Person                                          |
+-----------------------------------------------------+
| - firstName: String                                 |
| - lastName: String                                  |
| - home: Address                                     |
+-----------------------------------------------------+
| + Person(firstName: String, lastName: String, home: Address) |
| + toString(): String                                |
+-----------------------------------------------------+
          ▲
          │ (Used in)
          │
+-----------------------------------------------------+
|   CreditCard                                        |
+-----------------------------------------------------+
| - owner: Person                                     |
| - balance: Money                                    |
| - creditLimit: Money                                |
+-----------------------------------------------------+
| + CreditCard(owner: Person, creditLimit: Money)     |
| + getBalance(): Money                               |
| + getCreditLimit(): Money                           |
| + getAvailableCredit(): Money                       |
| + getPersonals(): String                            |
| + charge(amount: Money): void                       |
| + payment(amount: Money): void                      |
+-----------------------------------------------------+
```

#### **Files**
- `Money.java` - Handles monetary values.
- `Address.java` - Stores address details.
- `Person.java` - Represents the credit card owner.
- `CreditCard.java` - Implements credit card transactions.
- `CreditCardDemo.java` - Demonstrates the credit card system.
- `TestCreditCards.java` - Tests credit card functionalities.

#### **Status**
✅ All tasks completed (semi-final commit).
