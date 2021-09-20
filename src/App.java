import java.util.Scanner;

public class App {
    private static Double tempc;

    public static void main(String[] args) throws Exception {
        System.out.println("This program converts a temperature in degrees Celsius into a temperature in degrees Fahrenheit. Enter a temperature in Celsius");
        System.out.print("Enter a temperature in degrees Celsius: ");
        Scanner input = new Scanner(System.in);
        tempc = input.nextDouble();
        Double tempf = (9.0/5.0) * tempc + 32;
        System.out.print(tempc + " degrees Celsius is equal to" + tempf + " degrees Fahrenheit. Goodbye...");
    }
}
