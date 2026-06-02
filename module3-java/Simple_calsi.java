import java.util.Scanner;
public class Simple_calsi {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get Numbers
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();

        // Menu
        System.out.println("\nChoose Operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        // Perform Operation
        if (choice == 1) {
            System.out.println("Result = " + (num1 + num2));
        }
        else if (choice == 2) {
            System.out.println("Result = " + (num1 - num2));
        }
        else if (choice == 3) {
            System.out.println("Result = " + (num1 * num2));
        }
        else if (choice == 4) {

            if (num2 != 0) {
                System.out.println("Result = " + (num1 / num2));
            } else {
                System.out.println("Division by zero is not allowed");
            }

        }
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}  
