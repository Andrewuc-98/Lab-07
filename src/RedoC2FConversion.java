import java.util.Scanner;

public class RedoC2FConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*initialize inputs*/
        double celsius;
        double fahrenheit;

        /*prompt user for temp*/
        do {
            System.out.print("Enter temperature in Celsius: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Please enter a valid number.");
                System.out.print("Enter temperature in Celsius: ");
                scanner.next(); // consume invalid input
            }
            celsius = scanner.nextDouble();

            /*making sure it's a valid temp*/
            if (celsius < -273.15) {
                System.out.println("Error: Temperature cannot be below absolute zero.");
            }
        } while (celsius < -273.15);

        /*conversion method*/
        fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
