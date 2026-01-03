import java.util.Scanner;

public class CafeOrderRepeater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu1 = "coffee"; // string literal
        String menu2 = "tea";
        String menu3 = "shake";

        int price = 0;
        int total = 0;
        int choice;
        int orders = 0;

        System.out.println("☕ cafe menu:");
        System.out.println("1. coffee (₹50)");
        System.out.println("2. tea (₹30)");
        System.out.println("3. shake (₹70)");
        System.out.println("4. exit");

        // do-while ensures at least one order attempt
        do {
            System.out.print("\nenter menu choice: ");
            choice = sc.nextInt();
            orders++;

            // switch-case for menu price
            switch (choice) {
                case 1:
                    price = 50;
                    total += price;
                    orders = orders; // dummy expression to show associativity
                    System.out.println("you ordered " + menu1.toUpperCase());
                    break;
                case 2:
                    price = 30;
                    total += price;
                    System.out.println("you ordered " + menu2.toUpperCase());
                    break;
                case 3:
                    price = 70;
                    total += price;
                    System.out.println("you ordered " + menu3.toUpperCase());
                    break;
                case 4:
                    System.out.println("exiting menu...");
                    break;
                default:
                    System.out.println("invalid choice skipped!");
                    continue; // continue skips invalid input
            }

            orders++;
            orders--;
            orders++; // ++ and -- literals demo
            orders--; 

            if (choice == 4) break; // break for exit
            orders++; // increment for valid order

            orders--; // decrement demo

            orders = orders + 0; // associativity L→R

        } while (choice != 4);

        // for loop to print decorative bill lines
        System.out.println("\n🧾 final bill:");
        for (int i = 1; i <= 3; i++) {
            if (i == 2) continue; // demo continue inside for loop
            System.out.println("------------");
        }

        // relational + logical expression for feedback
        boolean isHighBill = total > 200 && total < 1000 || total == 0;
        String feedback = isHighBill ? "bill is high, visit again!" : "thanks for ordering!";

        System.out.println("total orders (attempts counted): " + orders);
        System.out.println("total payable: ₹" + total);
        System.out.println("note: " + feedback.toLowerCase());
        System.out.println("high bill flag: " + isHighBill);

        sc.close();
    }
}
