import java.util.Scanner;
import java.util.Vector;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Vector<Integer> STOCK = new Vector<Integer>();
    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        String item = "";
        double itemPrice = 0d;
        int wwyd = 0;

        System.out.println("ES Companies Portal - Cashier App 3");
        System.out.println("================================");
        do {
            System.out.print("Input item's name [5..30 characters]                        : ");
            item = scan.nextLine();
            try {
                if (item.length() < 5){
                    throw new Exception("");
                }
                else if (item.length() > 30){
                    throw new Exception("");
                }
                break;
            } catch (Exception e){

            }
        }while (true);
        do {
            System.out.print("Input item's price [use decimal numbers | 10.0 - 2000.0]    : $ ");
            try {
                itemPrice = scan.nextDouble();
                scan.nextLine();
            }catch (Exception e){
                scan.nextLine();
            }
        }while (itemPrice < 10.0 || itemPrice > 2000.0);

        do {
            System.out.println("\nWhat will you do?");
            System.out.println("=================");
            System.out.println("1. Sell item");
            System.out.println("2. Restock item");
            System.out.println("3. Exit");
            System.out.println("Choose : ");
            wwyd = scan.nextInt();
            if (wwyd == 1){
                sellItem();
            } else if (wwyd == 2) {
                restockItem();
                scan.nextLine();
            } else if (wwyd == 3) {
                System.exit(0);
            }
        }while (wwyd != 3);
    }
    public static void sellItem(){

    }
    public static void restockItem(){
        int itemStock = 0;
        do {
            System.out.print("Input stock to add [1..50] : ");
            try {
                itemStock = scan.nextInt();
            } catch (Exception e){

            }
        } while (itemStock < 1);
        STOCK.add(itemStock);

        System.out.println("Success add stock!");
    }
}
