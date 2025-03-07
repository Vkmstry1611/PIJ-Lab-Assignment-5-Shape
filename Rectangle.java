class Rectangle extends Shape {
    public Rectangle(double length, double breadth) {
        super("Rectangle", length, breadth, 0, 4);
    }

    public double calculateArea() {
        return dim_one * dim_two;
    }

    public double calculatePerimeter() {
        return 2 * (dim_one + dim_two);
    }
}
