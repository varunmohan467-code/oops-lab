import java.util.Scanner;

public class StringHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("1. Initial Capacity: " + sb.capacity());

        String reversedUpper = sb.reverse().toString().toUpperCase();
        sb = new StringBuffer(reversedUpper); 
        System.out.println("2. Reversed & Uppercase: " + sb);


        System.out.print("3. Enter a string to append: ");
        String userInput = scanner.nextLine();
        sb.append(userInput);
        
        System.out.println("Final Result: " + sb);
        System.out.println("Final Capacity: " + sb.capacity());
        
        scanner.close();
    }
}