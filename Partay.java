import java.util.Scanner;

class Partay { // because it's a partaaaay in the hizzaaaay
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            // Scanner gets input from the user from the console(System.in)

            System.out.println("Enter pokemon 1:");
            String pokemon1 = scan.nextLine(); // gets the next line that the user inputs

            System.out.println("Enter pokemon 2:");
            String pokemon2 = scan.nextLine();

            System.out.println("Enter pokemon 3:");
            String pokemon3 = scan.nextLine();

            System.out.println("Enter pokemon 4:");
            String pokemon4 = scan.nextLine();

            System.out.println("Enter pokemon 5:");
            String pokemon5 = scan.nextLine();

            System.out.println("Enter pokemon 6:");
            String pokemon6 = scan.nextLine();

            System.out.println("Here are your pokemon:");
            System.out.println(pokemon1);
            System.out.println(pokemon2);
            System.out.println(pokemon3);
            System.out.println(pokemon4);
            System.out.println(pokemon5);
            System.out.println(pokemon6);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}