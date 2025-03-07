import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Select Shape ---");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Square");
            System.out.println("5. Sphere");
            System.out.println("6. Cylinder");
            System.out.println("7. Equilateral Pyramid");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            if (choice == 8) break;

            Shape shape = null;
            Volume volumeShape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter base of Triangle: ");
                    double base = scan.nextDouble();
                    System.out.print("Enter height of Triangle: ");
                    double height = scan.nextDouble();
                    shape = new Triangle(base, height);
                    break;

                case 2:
                    System.out.print("Enter length of Rectangle: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter breadth of Rectangle: ");
                    double breadth = scan.nextDouble();
                    shape = new Rectangle(length, breadth);
                    break;

                case 3:
                    System.out.print("Enter radius of Circle: ");
                    double radius = scan.nextDouble();
                    shape = new Circle(radius);
                    break;

                case 4:
                    System.out.print("Enter side of Square: ");
                    double side = scan.nextDouble();
                    shape = new Square(side);
                    break;

                case 5:
                    System.out.print("Enter radius of Sphere: ");
                    double sphereRadius = scan.nextDouble();
                    volumeShape = new Sphere(sphereRadius);
                    shape = (Shape) volumeShape;
                    break;

                case 6:
                    System.out.print("Enter radius of Cylinder: ");
                    double cylRadius = scan.nextDouble();
                    System.out.print("Enter height of Cylinder: ");
                    double cylHeight = scan.nextDouble();
                    volumeShape = new Cylinder(cylRadius, cylHeight);
                    shape = (Shape) volumeShape;
                    break;

                case 7:
                    System.out.print("Enter base side of Pyramid: ");
                    double baseSide = scan.nextDouble();
                    System.out.print("Enter height of Pyramid: ");
                    double pyrHeight = scan.nextDouble();
                    volumeShape = new EquilateralPyramid(baseSide, pyrHeight);
                    shape = (Shape) volumeShape;
                    break;

                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            System.out.println("\n--- Results ---");
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            if (volumeShape != null) {
                System.out.println("Volume: " + volumeShape.calculateVolume());
            }
        }

        scan.close();
        System.out.println("Program Exited.");
    }
}
