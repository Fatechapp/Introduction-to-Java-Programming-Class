import java.util.InputMismatchException;
import java.util.Scanner;

public class ES_Companies_Portal {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        String name = "";
        String Cname = "";
        int age = 0;
        double dailyIncome = 0;
        System.out.println("Welcome to ES Companies Portal");
        System.out.println("==============================");

        System.out.print("Input your name : ");
        name = scan.nextLine();

        System.out.print("Input your company's name : ");
        Cname = scan.nextLine();

        do {
            try {
                System.out.print("Input your company's age : ");
                age = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e){
                scan.nextLine();
            }
        } while (age == 0);

        do {
            try {
                System.out.print("Input your company's daily income : ");
                dailyIncome = scan.nextDouble();
                scan.nextLine();
            }catch (InputMismatchException e){
                scan.nextLine();
            }
        } while (dailyIncome == 0);

        System.out.println("");
        System.out.println("Thank you for filling the form, " + name + "\n");
        companyInfo(Cname, age, dailyIncome);
    }
    public static void companyInfo(String Cname, int age, double dailyIncome){
        String validity = "";

        System.out.println("Information about your company");
        System.out.println("==============================");
        System.out.println("Company name    : " + Cname);
        System.out.println("Company age     : " + age);
        System.out.println("Company income  : " + dailyIncome + "\n");

        do {
            try {
                System.out.print("Is this information correct [true | false] ? ");
                validity = scan.nextLine();
            } catch (InputMismatchException e){
                scan.nextLine();
            }
        } while (!validity.equalsIgnoreCase("true") && !validity.equalsIgnoreCase("false"));
        System.out.println("\nThanks for using this application :)");
    }
}
