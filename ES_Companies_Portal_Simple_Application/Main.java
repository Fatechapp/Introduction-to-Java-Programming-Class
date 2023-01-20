import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu (){
        String CName = "";
        int luckNum = 0;

        System.out.println("ES Companies Portal - Simple Application");
        System.out.println("========================================");
        System.out.print("Input your company's name         : ");
        CName = scan.nextLine();

        do {
            System.out.print("Input your company's lucky number : ");
            try {
                luckNum = scan.nextInt();
                scan.nextLine();
            }catch (InputMismatchException e){
                scan.nextLine();
            }
        } while (luckNum < 0 || luckNum > 255);

        randomingNum(CName, luckNum);
    }
    public static void randomingNum(String CName, int luckNum){
        System.out.println("Information");
        System.out.println("===========");
        System.out.println("Company name : " + CName);
        System.out.println("\nRandoming some number...");
        System.out.print("Press Enter to continue");
        scan.nextLine();

        int luckNum2 = 0;
        String companyName = CName;
        int nameLength = companyName.length();
        int randomIndex = rand.nextInt(nameLength) + 1;
        char ASCII = (char)luckNum;

        System.out.println("\nFirst character in your company name : " + companyName.charAt(0));
        System.out.println("Character in index number " + randomIndex + " in your company : " + companyName.charAt(randomIndex));
        System.out.println("Last character in your company name : " + companyName.substring(companyName.length()-1));

        System.out.println("\nThis is the symbol of your company's lucky number : " + ASCII);
        do {
            System.out.print("Input another lucky number [1..50] : ");
            luckNum2 = scan.nextInt();
            try {
                if (luckNum2 < 1 || luckNum2 > 50){
                    throw new Exception("");
                }
                break;
            } catch (Exception e){

            }
        } while (true);

        int maxNum = Math.max(luckNum, luckNum2);
        int minNum = Math.min(luckNum, luckNum2);
        int power = (int) Math.pow(luckNum, luckNum2);

        System.out.println("Which is bigger, your lucky number (" +luckNum + ") or the second one ("+luckNum2+")? ");
        System.out.println("Answer : " + maxNum);

        System.out.println("\nWhich is smaller, your lucky number (" +luckNum + ") or the second one ("+luckNum2+")? ");
        System.out.println("Answer : " + minNum);

        System.out.println("What is the result of your lucky number powered by the second one?");
        System.out.println("Answer : " + power);

        System.out.println("\n--------------------------------------------------------------------------");
        System.out.println("\nThanks for using this application :)");

    }
}
