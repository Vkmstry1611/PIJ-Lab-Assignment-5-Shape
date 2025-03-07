abstract class Shape{
    
    protected double dim_one;
    protected double dim_two;
    protected double dim_three;
    protected int num_sides;
    protected String shapeName;

    // Parameterized constructor
    public Shape(String shapeName, double dim_one, double dim_two, double dim_three, int num_sides) {
        this.shapeName = shapeName;
        this.dim_one = dim_one;
        this.dim_two = dim_two;
        this.dim_three = dim_three;
        this.num_sides = num_sides;
    }

    // Abstract methods
    abstract public double calculateArea();
    abstract public double calculatePerimeter();

    // Getter method for number of sides
    public int getNumSides() {
        return num_sides;
    }



}