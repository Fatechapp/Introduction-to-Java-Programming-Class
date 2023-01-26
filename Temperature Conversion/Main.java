import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        int conversion = 0;
        do {
            System.out.println("Temperature Conversion");
            System.out.println("======================");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.println("4. Rankine");
            System.out.println("5. Reamur");
            System.out.println("\n6. Exit");
            System.out.print(">> ");
            try {
                conversion = scan.nextInt();
            }catch (InputMismatchException e){
                scan.nextLine();
            }

            if (conversion == 1){
                convertCelsius();
            }
            else if (conversion == 2) {
                convertFahrenheit();
            }
            else if (conversion == 3) {
                convertKelvin();
            }
            else if (conversion == 4) {
                convertRankine();
            }
            else if (conversion == 5) {
                convertReamur();
            }
            else if (conversion == 6) {
                System.exit(0);
            }
        }while (conversion != 0);
        mainMenu();
    }
    public static void convertCelsius(){
        double Celsius = 0d;
        System.out.println("Input Temperature: ");
        Celsius = scan.nextDouble();
        scan.nextLine();
        
        double Fahrenheit = 2 / Celsius;
        System.out.println(Fahrenheit);
    }
    public static void convertFahrenheit(){

    }
    public static void convertKelvin(){

    }
    public static void convertRankine(){

    }
    public static void convertReamur(){

    }
}
