
      // You need this import statement at the top of your file
import java.util.Scanner;

public class Main {
    // All of your code must go inside this main method
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Campus Course & Records Manager ---");
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Courses");
            // ... add other menu options here ...
        }
        
        // Don't forget to close the scanner when you're done
        scanner.close();
    }
}