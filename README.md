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

Problem 2:
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

Problem 3:
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
