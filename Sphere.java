class Sphere extends Shape implements Volume {
    public Sphere(double radius) {
        super("Sphere", radius, 0, 0, 0);
    }

    public double calculateArea() {
        return 4 * Math.PI * dim_one * dim_one;
    }

    public double calculatePerimeter() {
        return 0; // Not applicable for Sphere
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(dim_one, 3);
    }
}
