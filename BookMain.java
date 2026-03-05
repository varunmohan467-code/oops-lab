import java.util.Scanner;

class Publisher {
    String publisher_name;
    Publisher(String name) { this.publisher_name = name; }
}

class Book extends Publisher {
    String book_name, author;
    Book(String pName, String bName, String auth) {
        super(pName);
        this.book_name = bName;
        this.author = auth;
    }
}

class Literature extends Book {
    String type;
    Literature(String pName, String bName, String auth, String type) {
        super(pName, bName, auth);
        this.type = type;
    }
    void display() {
        System.out.println("Type: Literature | Publisher: " + publisher_name + " | Book: " + book_name + " | Author: " + author + " | Category: " + type);
    }
}

class Fiction extends Book {
    String type;
    Fiction(String pName, String bName, String auth, String type) {
        super(pName, bName, auth);
        this.type = type;
    }
    void display() {
        System.out.println("Type: Fiction | Publisher: " + publisher_name + " | Book: " + book_name + " | Author: " + author + " | Category: " + type);
    }
}

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Category (1.Literature, 2.Fiction): ");
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.print("Publisher: "); String pub = sc.nextLine();
            System.out.print("Book Name: "); String bName = sc.nextLine();
            System.out.print("Author: "); String auth = sc.nextLine();
            System.out.print("Category Type: "); String type = sc.nextLine();

            if (choice == 1) {
                new Literature(pub, bName, auth, type).display();
            } else {
                new Fiction(pub, bName, auth, type).display();
            }
        }
    }
}