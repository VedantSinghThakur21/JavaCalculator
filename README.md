# 📐 Java Calculator Application

A **modular console-based calculator** built in Java, demonstrating the application of **OOP concepts**, **custom exception handling**, and **menu-driven interaction**. The project is beginner-friendly and adheres to clean code practices.

---

## 👨‍💻 Author Info

- **Name:** Vedant Singh Thakur  
- **PRN:** 23070126144  
- **Batch:** B3

---

## 📌 Features

- ✅ Addition, Subtraction, Multiplication, Division
- ✅ Square, Cube, and Square Root calculations
- ✅ Modular OOP design — each operation is implemented as a separate class
- ✅ Custom Exception Handling:
  - `NegativeInputException`: Thrown when square root of a negative number is requested
  - `InvalidMenuChoiceException`: Thrown when user enters an invalid menu option
- ✅ Graceful handling of divide-by-zero and other edge cases
- ✅ Infinite loop with exit option for continuous use

---

## 🧾 Menu Options

```
--- Calculator Menu ---
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Square
6. Cube
7. Square Root
0. Exit
```

---

## 🏗️ Project Structure

```
/JavaCalculator/
│
├── Main.java                         # Main program with user interface
├── Addition.java                     # Logic for addition
├── Subtraction.java                  # Logic for subtraction
├── Multiplication.java               # Logic for multiplication
├── Division.java                     # Logic for division with error check
├── Square.java                       # Square of a number
├── Cube.java                         # Cube of a number
├── SquareRoot.java                   # Square root with negative number check
│
├── NegativeInputException.java       # Custom exception for negative input
└── InvalidMenuChoiceException.java   # Custom exception for invalid menu selection
```

---

## ⚙️ How to Run

1. **Compile All Classes**  
   Navigate to the project directory and run:
   ```bash
   javac *.java
   ```

2. **Run the Program**  
   ```bash
   java Main
   ```

---

## ✅ Sample Output

```
--- Calculator Menu ---
1. Addition
...
Choose an option: 1
Enter two numbers: 5 6
Result: 11
```

```
Choose an option: 7
Enter a number: -9
Custom Exception: Cannot calculate square root of a negative number.
```

---

## 📚 Concepts Used

- ✅ Java OOP (Classes, Objects, Methods)
- ✅ Custom Exceptions
- ✅ Exception Handling (try-catch-finally)
- ✅ User Input Handling (Scanner)
- ✅ Modular Programming
- ✅ Console-based UI

---

## 📌 Dependencies

- Java JDK 8 or above
- Command-line terminal or any Java IDE (e.g., IntelliJ, Eclipse, NetBeans)

---

## 📂 License

This project is free to use for educational purposes. Attribution appreciated 🙌

---

## 🙋‍♂️ Support

If you find this helpful or have questions, feel free to reach out or fork the repo and build on it!
