import java.util.Scanner;

public class TryCatchExample20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        try {

            int result = num1 / num2;

            System.out.println("Result = " + result);

        }
        catch (ArithmeticException e) {

            System.out.println("Cannot Divide By Zero");

        }

        sc.close();
    }
}