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
        System.out.print("Input Temperature: ");
        Celsius = scan.nextDouble();
        scan.nextLine();

        double CelFahrenheit = (Celsius * 9/5) + 32;
        System.out.println(CelFahrenheit + " °F");

        double CelKelvin = Celsius + 273.15;
        System.out.println(CelKelvin + " °K");

        double CelRankine = (Celsius + 273.15) * 9/5;
        System.out.println(CelRankine + " °R");

        double CelReamur = Celsius * 4/5;
        System.out.println(CelReamur + " °Re");

        System.out.println("");
    }
    public static void convertFahrenheit(){

        double Fahrenheit = 0d;
        System.out.print("Input Temperature: ");
        Fahrenheit = scan.nextDouble();
        scan.nextLine();

        double FahCelsius = (Fahrenheit - 32) * 5/9;
        System.out.println(FahCelsius + " °C");

        double FahKelvin =  (Fahrenheit - 32) * 5/9 + 273.15;
        System.out.println(FahKelvin + " °K");

        double FahRankine = Fahrenheit + 459.67;
        System.out.println(FahRankine + " °R");

        double FahReamur =  (Fahrenheit - 32) * 4/9;
        System.out.println(FahReamur + " °Re");

        System.out.println("");
    }
    public static void convertKelvin(){
        double Kelvin = 0d;
        System.out.print("Input Temperature: ");
        Kelvin = scan.nextDouble();
        scan.nextLine();

        double KelCelsius = Kelvin - 273.15;
        System.out.println(KelCelsius + " °C");

        double KelFahrenheit =  (KelCelsius * 9/5) + 32;
        System.out.println(KelFahrenheit + " °F");

        double KelRankine = Kelvin * 9/5;
        System.out.println(KelRankine + " °R");

        double KelReamur =  (KelCelsius * 4/5);
        System.out.println(KelReamur + " °Re");

        System.out.println("");
    }
    public static void convertRankine(){
        double Rankine = 0d;
        System.out.print("Input Temperature: ");
        Rankine = scan.nextDouble();
        scan.nextLine();

        double RanCelsius = (Rankine - 491.67) * 5/9;
        System.out.println(RanCelsius + " °C");

        double RanKelvin =  (Rankine - 491.67) * 5/9 + 273.15;
        System.out.println(RanKelvin + " K");

        double RanFahrenheit = Rankine - 459.67;
        System.out.println(RanFahrenheit + " °F");

        double RanReamur =  (Rankine - 491.67) * 4/9;
        System.out.println(RanReamur + " °Re");

        System.out.println("");
    }
    public static void convertReamur(){
        double Reamur = 0d;
        System.out.print("Input Temperature: ");
        Reamur = scan.nextDouble();
        scan.nextLine();

        double ReaCelsius = Reamur * 5/4;
        System.out.println(ReaCelsius + " °C");

        double ReaKelvin =  Reamur * 5/4 + 273.15;
        System.out.println(ReaKelvin + " K");

        double ReaFahrenheit = (Reamur * 9/4) + 32;
        System.out.println(ReaFahrenheit + " °F");

        double ReaRankine = (Reamur * 9/4) + 491.67;
        System.out.println(ReaRankine + " °R");

        System.out.println("");
    }
}
