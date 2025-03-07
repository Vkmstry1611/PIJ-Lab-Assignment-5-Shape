- **Name:** [Your Name]  
- **PRN:** [Your PRN]  
- **Batch:** [Your Batch]  

---

# Shape Area & Volume Calculator (Java)

## Overview

This Java project is a menu-driven program that calculates the **area, perimeter**, and **volume (for 3D shapes)** of various geometric shapes. The program follows an **object-oriented approach** with separate classes for each shape. It also includes an **abstract class `Shape`** and an **interface `Volume`** for code reusability.

---

## **Project Structure**

### **1. Main.java**

- Contains the **menu-driven program** for user interaction.
- Uses **switch-case** to handle different shape selections.
- Calls the respective class methods for area, perimeter, and volume calculations.
- Closes the scanner object to prevent memory leaks.

### **2. Shape.java (Abstract Class)**

- Base class for all shapes.
- Contains common properties like `dim_one`, `dim_two`, `dim_three`, `num_sides`, and `shapeName`.
- Defines **two abstract methods**: `calculateArea()` and `calculatePerimeter()`.
- Implements a **constructor** to initialize shape properties.

### **3. Volume.java (Interface for 3D Shapes)**

- Defines the `calculateVolume()` method, which is implemented by 3D shapes.

### **4. Rectangle.java**

- Implements `calculateArea()` and `calculatePerimeter()`.
- Uses a constructor to initialize **length and breadth**.

### **5. Circle.java**

- Implements `calculateArea()` and `calculatePerimeter()`.
- Uses **radius** as input.

### **6. Square.java**

- Implements `calculateArea()` and `calculatePerimeter()`.
- Uses **side length** as input.

### **7. Sphere.java** (Implements `Volume` Interface)

- Implements `calculateArea()` and `calculateVolume()`.
- Uses **radius** as input.

### **8. Cylinder.java** (Implements `Volume` Interface)

- Implements `calculateArea()`, `calculatePerimeter()`, and `calculateVolume()`.
- Uses **radius** and **height** as input.

### **9. EquilateralPyramid.java** (Implements `Volume` Interface)

- Implements `calculateArea()`, `calculatePerimeter()`, and `calculateVolume()`.
- Uses **base side** and **height** as input.

