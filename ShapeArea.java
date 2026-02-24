import java.util.Scanner; // <--- THIS LINE IS LIKELY MISSING

class ShapeArea {
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void area(double radius) {
        System.out.println("Area of Circle: " + (3.14159 * radius * radius));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeArea obj = new ShapeArea();

        System.out.print("Enter side of Square: ");
        int s = sc.nextInt();
        obj.area(s);

        System.out.print("Enter length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        obj.area(l, b);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        obj.area(r);

        sc.close();
    }
}