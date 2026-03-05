import java.util.Scanner;

class Employee {
    int empid;
    String name;
    double salary;
    String address;

    // Constructor to initialize Employee details
    Employee(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {
    String department;
    String subjectTaught;

    // Constructor calling super() to initialize parent members
    Teacher(int empid, String name, double salary, String address, String dept, String subject) {
        super(empid, name, salary, address);
        this.department = dept;
        this.subjectTaught = subject;
    }

    void display() {
        System.out.println("\nID: " + empid + "\nName: " + name + "\nSalary: " + salary + 
                           "\nAddress: " + address + "\nDept: " + department + "\nSubject: " + subjectTaught);
    }
}

public class TeacherMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        Teacher[] teachers = new Teacher[n]; // Array of objects

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Teacher " + (i + 1));
            System.out.print("ID: "); int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: "); String name = sc.nextLine();
            System.out.print("Salary: "); double sal = sc.nextDouble();
            sc.nextLine();
            System.out.print("Address: "); String addr = sc.nextLine();
            System.out.print("Dept: "); String dept = sc.nextLine();
            System.out.print("Subject: "); String sub = sc.nextLine();
            
            teachers[i] = new Teacher(id, name, sal, addr, dept, sub);
        }

        System.out.println("\n--- Teacher Details ---");
        for (Teacher t : teachers) {
            t.display(); // Display using loop
        }
    }
}