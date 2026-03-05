import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double r;
    Circle(double r) { this.r = r; }
    public void area() { System.out.println("Area: " + (3.14 * r * r)); }
    public void perimeter() { System.out.println("Perimeter: " + (2 * 3.14 * r)); }
}

class Rectangle implements Shape {
    double l, b;
    Rectangle(double l, double b) { this.l = l; this.b = b; }
    public void area() { System.out.println("Area: " + (l * b)); }
    public void perimeter() { System.out.println("Perimeter: " + (2 * (l + b))); }
}

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Circle\n2. Rectangle\n3. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter Radius: ");
                Circle c = new Circle(sc.nextDouble());
                c.area(); c.perimeter();
            } else if (ch == 2) {
                System.out.print("Enter Length & Breadth: ");
                Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
                r.area(); r.perimeter();
            } else break;
        }
    }
}