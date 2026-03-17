# Palindrome Checker App – Use Case 13

## 📌 Objective
This Java application compares the performance of different palindrome checking algorithms by measuring execution time.

---

## 🚀 Features
- Runs multiple palindrome algorithms
- Measures execution time using System.nanoTime()
- Displays comparison results
- Helps understand performance differences

---

## 🧠 Concepts Used
- System.nanoTime()
- Algorithm Comparison
- Performance Benchmarking
- Multiple Approaches (Reverse, Two Pointer, Stack)

---

## 🛠️ How to Compile and Run

### Step 1: Compile
javac UseCase13PalindromeCheckerApp.java

### Step 2: Run
java UseCase13PalindromeCheckerApp

---

## 💡 Example

Input:
Enter a string: madam

Output:
=== Results ===
Reverse Method: true | Time: 50000 ns
Two Pointer Method: true | Time: 20000 ns
Stack Method: true | Time: 30000 ns

---

## 📊 Insights
- Two Pointer method is usually fastest
- String concatenation is slower due to immutability
- Stack introduces extra overhead

---

## 📌 Use Cases
- Performance benchmarking
- Algorithm comparison studies
- Interview preparation