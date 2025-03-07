class Triangle extends Shape {
    public Triangle(double base, double height) {
        // Calling the constructor of Shape with 3 parameters and 3 sides
        super("Triangle", base, height, 0, 3);
    }

    // Method to calculate the area of the triangle
    public double calculateArea() {
        return 0.5 * dim_one * dim_two;
    }

    // Method to calculate the perimeter (assuming right-angled triangle)
    public double calculatePerimeter() {
        double hypotenuse = Math.sqrt((dim_one * dim_one) + (dim_two * dim_two));
        return dim_one + dim_two + hypotenuse;
    }
}
