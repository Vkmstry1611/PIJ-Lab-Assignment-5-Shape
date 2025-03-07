class EquilateralPyramid extends Shape implements Volume {
    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid", baseSide, height, 0, 4);
    }

    public double calculateArea() {
        double baseArea = dim_one * dim_one;
        double slantHeight = Math.sqrt((dim_one / 2) * (dim_one / 2) + dim_two * dim_two);
        double lateralArea = 2 * dim_one * slantHeight;
        return baseArea + lateralArea;
    }

    public double calculatePerimeter() {
        return 4 * dim_one;
    }

    public double calculateVolume() {
        return (1.0 / 3.0) * (dim_one * dim_one) * dim_two;
    }
}
