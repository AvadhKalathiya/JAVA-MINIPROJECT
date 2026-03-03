import java.util.Scanner;

public class SmartMathCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n🧮 SMART MATH CALCULATOR");
            System.out.println("1. Square Root");
            System.out.println("2. Power");
            System.out.println("3. Maximum & Minimum");
            System.out.println("4. Absolute Value");
            System.out.println("5. Round Number");
            System.out.println("6. Random Number (1-100)");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    System.out.println("Square Root = " + Math.sqrt(num));
                    break;

                case 2:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter power: ");
                    double power = sc.nextDouble();
                    System.out.println("Result = " + Math.pow(base, power));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.println("Maximum = " + Math.max(a, b));
                    System.out.println("Minimum = " + Math.min(a, b));
                    break;

                case 4:
                    System.out.print("Enter number: ");
                    int value = sc.nextInt();
                    System.out.println("Absolute Value = " + Math.abs(value));
                    break;

                case 5:
                    System.out.print("Enter decimal number: ");
                    double d = sc.nextDouble();
                    System.out.println("Rounded Value = " + Math.round(d));
                    break;

                case 6:
                    int random = (int)(Math.random() * 100) + 1;
                    System.out.println("Random Number = " + random);
                    break;

                case 7:
                    System.out.println("Exiting Calculator...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}