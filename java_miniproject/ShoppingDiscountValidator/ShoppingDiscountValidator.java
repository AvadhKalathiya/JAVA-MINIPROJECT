// Using Concept is Data Types, Literals, Variables, Input and Output

import java.util.Scanner;

public class ShoppingDiscountValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Data types
        String customerName;
        int billAmount;
        double discount;
        double finalAmount;
        boolean discountApplied;

        // Input
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Total Bill Amount: ");
        billAmount = sc.nextInt();

        // Discount logic
        if (billAmount >= 2000) {
            discount = billAmount * 0.20;
            discountApplied = true;
        } else if (billAmount >= 1000) {
            discount = billAmount * 0.10;
            discountApplied = true;
        } else {
            discount = 0.0;
            discountApplied = false;
        }

        // Final amount
        finalAmount = billAmount - discount;

        // Output
        System.out.println("\n----- Shopping Bill Summary -----");
        System.out.println("Customer Name     : " + customerName);
        System.out.println("Original Bill     : ₹" + billAmount);
        System.out.println("Discount Applied? : " + (discountApplied ? "YES" : "NO"));
        System.out.println("Discount Amount   : ₹" + discount);
        System.out.println("Final Payable     : ₹" + finalAmount);

        sc.close();
    }
}
