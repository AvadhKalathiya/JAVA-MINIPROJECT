import java.util.Scanner;

public class PriceStepper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item;
        int price;                // integer datatype
        double tax = 0.18;        // double literal
        float discount = 5.5f;    // float literal
        char stepSymbol = '$';    // char literal
        boolean flashSale = true; // boolean literal

        System.out.print("Enter item name: ");
        item = sc.nextLine();

        System.out.print("Enter base price (integer): ");
        price = sc.nextInt();

        int step = 100;  // integer literal
        double total;

        // Mixed expression + type promotion
        total = price + (price * tax) - discount;
        // * then + then - (L→R associativity)

        // Increment/Decrement behavior demo
        double beforeStep = total++;  // post-increment
        double afterStep  = ++total;  // pre-increment

        // Apply step jump expression
        double steppedPrice = afterStep + step; // + expression

        // Output
        System.out.println("\n" + stepSymbol + "---- Cart Price Summary ----" + stepSymbol);
        System.out.println("Item name      : " + item);
        System.out.println("Base price     : ₹" + price);
        System.out.println("Initial total  : ₹" + beforeStep);
        System.out.println("After ++/-- ops: ₹" + afterStep);
        System.out.println("Stepped price  : ₹" + steppedPrice);
        System.out.println("Flash sale on? : " + flashSale);
        System.out.println("Final datatype : " + ((steppedPrice > 0) ? "double (promoted)" : "unknown"));

        sc.close();
    }
}
