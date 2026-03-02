import java.util.Scanner;

class madlibsgame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Mad Libs game!");

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.println();
        System.out.println("Here is your Mad Lib story:");
        System.out.println("The " + adjective + " " + noun + " decided to " + verb + " " + adverb + " today.");

        scanner.close();
    }
}