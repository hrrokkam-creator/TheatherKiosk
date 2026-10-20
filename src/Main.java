import java.util.Scanner;

class TheaterKiosk {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            int age = in.nextInt();
            in.nextLine();

            if (age >= 21) {
                System.out.println("You can gain a wristband.");
            }
        } else {
            String trash = in.nextLine();
            System.out.println("Run the program again and enter a valid age!");
        }
    }
}