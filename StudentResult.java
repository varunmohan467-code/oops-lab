import java.util.Scanner;

class Student {
    int roll_no;
    String name;
    int academic_score;

    void readStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: "); roll_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: "); name = sc.nextLine();
        System.out.print("Enter Academic Score: "); academic_score = sc.nextInt();
    }
}

interface Sports {
    // Interfaces are used to simulate multiple inheritance in Java 
    void readSports();
}

class Result extends Student implements Sports {
    int sports_score;

    public void readSports() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sports Score: "); sports_score = sc.nextInt();
    }

    void display() {
        System.out.println("\n--- Result ---");
        System.out.println("Roll No: " + roll_no + "\nName: " + name + 
                           "\nAcademic Score: " + academic_score + "\nSports Score: " + sports_score);
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Result r = new Result();
        r.readStudent();
        r.readSports();
        r.display();
    }
}