import java.util.Scanner;
public class SearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();
        int resultIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                resultIndex = i;
                break;
            }
        }
        if (resultIndex != -1) {
            System.out.println("Success! Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
   scanner.close();
    }
}