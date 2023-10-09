
    import java.util.Scanner;

    public class TaskEight {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            double celsius, fahrenheit;

            do {
                System.out.print("Enter temperature in Celsius: ");
                while (!in.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    in.next(); // Consume the invalid input
                }
                celsius = in.nextDouble();
            } while (celsius < -273.15); // Absolute zero in Celsius

            fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);

            in.close();
        }
    }

