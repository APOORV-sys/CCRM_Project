package edu.ccrm.cli;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Campus Course & Records Manager ---");
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Courses");
            System.out.println("3. Export Data");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Student Management selected...");
                    // Call student service methods here
                    break;
                case 2:
                    System.out.println("Course Management selected...");
                    // Call course service methods here
                    break;
                case 3:
                     System.out.println("Export Data selected...");
                    // Call I/O service methods here
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
