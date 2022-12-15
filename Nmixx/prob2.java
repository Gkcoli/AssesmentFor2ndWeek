import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        double num = 0;
        try {
            // Try to convert the input string to a double value
            num = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            // Catch the NumberFormatException and set the number to 0
            num = 0;
            System.out.println("Invalid input! The number has been set to 0.");
        }

        // Display the number
        System.out.println("Number: " + num);
    }
}
