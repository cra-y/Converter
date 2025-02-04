import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean running = true;
        while (running) {
            System.out.println("Metric Conversion Program");
            System.out.println("1. Kilometers to Meters");
            System.out.println("2. Meters to Centimeters");
            System.out.println("3. Grams to Kilograms");
            System.out.println("4. Farenheit to Celsius");
            System.out.println("-1. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            
            if (choice == -1) {
                System.out.println("Exiting program.");
                running = false;
                continue;
            }
            
            System.out.print("Enter value to convert: ");
            double value = scanner.nextDouble();
            double convertedValue = 0;
            
            switch (choice) {
                case 1:
                    convertedValue = value * 1000; // 1 km = 1000 meters
                    System.out.println(value + " km = " + convertedValue + " meters");
                    break;
                case 2:
                    convertedValue = value * 100; // 1 meter = 100 centimeters
                    System.out.println(value + " meters = " + convertedValue + " centimeters");
                    break;
                case 3:
                    convertedValue = value / 1000; // 1000 grams = 1 kilogram
                    System.out.println(value + " grams = " + convertedValue + " kilograms");
                    break;
                case 4:
                    convertedValue = (value - 32) / 1.8; // Celsius = Farenheit - 32 / 1.8
                    System.out.println(value + " Farenheit = " + convertedValue + " Celsius");
                    break;
                default:
                    System.out.println("Your input is not currently handled by this app. Please input another query i.e. 1kg = lb");
            }
            System.out.println(); // New line to look cleaner
        }
        
        scanner.close();
    }
}
