import java.util.Scanner;

public class SwitchLambdaExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day number (1-7): ");
        int day;
        try {
            day = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
            return;
        }

        // Switch expression with lambda-like syntax
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> {
                // You can have a block for complex logic
                yield "Invalid day number";
            }
        };

        System.out.println("Day: " + dayName);
    }
}
