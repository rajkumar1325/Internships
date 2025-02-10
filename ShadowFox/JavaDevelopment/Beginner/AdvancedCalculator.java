import java.util.Scanner;
import java.lang.String;
import java.lang.Math;

public class AdvancedCalculator {

    public static void calculator() {
        Scanner sc = new Scanner(System.in); // making an object of Scanner class.
        int choice = 1;

        System.out.println("Enter your number : ");
        int num1 = sc.nextInt();

        while (choice == 1) {
            System.out.println("Enter operation to perform. eg: + - * /...");
            String op = sc.next();

            System.out.println("Enter second number : ");
            int num2 = sc.nextInt();

            int result = 0;
            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("Error");
                    break;
            }
            num1 = result;  //updating for further uses
            System.out.println("The result is : " + result);
            System.out.println("*******************************");
            System.out.println("Do you wnna add more to previous (1 --> Yes | 0 --> No");
            choice = sc.nextInt();
        }
    }

    public static void scientificCalculator() {
        Scanner sc = new Scanner(System.in); // making an object of Scanner class.
        System.out.println("\nScientific Calculations! Choose option: ");
        System.out.println("1. Square Root");
        System.out.println("2. Exponentiation");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Enter your number");
                int number = sc.nextInt();
                System.out.println("The square root is: " + Math.sqrt(number));
                break;
            case 2:
                System.out.println("Enter your number: ");
                int number1 = sc.nextInt();
                System.out.println("Enter your power: ");
                int power = sc.nextInt();
                System.out.println("Result: " + Math.pow(number1, power));
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

    private static void unitConversions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nUnit Conversions:");
        System.out.println("1. Temperature (Celsius to Fahrenheit)");
        System.out.println("2. Currency (USD to INR - example)");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.print("Enter amount in USD: ");
                double usd = sc.nextDouble();
                double inr = usd * 87.46; // Example conversion rate
                System.out.println("Amount in INR: " + inr);
                break;
            default:
                System.out.println("Invalid option!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which calculator you wnna use: ");
        System.out.println("1. Simple calculator");
        System.out.println("2. Scientific calculator");
        System.out.println("3. Unit Convertor");
        int result = sc.nextInt();
        switch (result) {
            case 1:
                calculator();
                break;
            case 2:
                scientificCalculator();
                break;
            case 3:
                unitConversions();
                break;
            default:
                System.out.println("please enter valid number");
                break;
        }

    }
}
