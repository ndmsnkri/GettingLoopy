import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0, fahrenheit;

        boolean done = false;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
        } while (!done);

        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        in.close();
    }
}
