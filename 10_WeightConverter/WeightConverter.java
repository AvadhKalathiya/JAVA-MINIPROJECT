import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight;
        int choice;
        double result;

        System.out.println("⚖️ WEIGHT CONVERTER");
        System.out.println("1. Kilogram → Gram");
        System.out.println("2. Kilogram → Pound");
        System.out.println("3. Gram → Kilogram");
        System.out.println("4. Pound → Kilogram");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter weight value: ");
        weight = sc.nextDouble();

        switch (choice) {

            case 1:
                result = weight * 1000;
                System.out.println("Result: " + result + " grams");
                break;

            case 2:
                result = weight * 2.20462;
                System.out.println("Result: " + result + " pounds");
                break;

            case 3:
                result = weight / 1000;
                System.out.println("Result: " + result + " kilograms");
                break;

            case 4:
                result = weight / 2.20462;
                System.out.println("Result: " + result + " kilograms");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}