import java.util.Scanner;
import java.util.Vector;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Vector<Integer> STOCK = new Vector<Integer>();
    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        String itemName = "";
        double itemPrice = 0d;

        System.out.println("ES Companies Portal - Cashier App 3");
        System.out.println("================================");
        do {
            System.out.print("Input item's name [5..30 characters] :");
            itemName = scan.nextLine();
        }while (itemName.length() < 5 || itemName.length() > 30);
        do {
            System.out.print("Input item's price [use decimal numbers | 10.0 - 2000.0]: $ ");
            try {
                itemPrice = scan.nextDouble();
                scan.nextLine();
            }catch (Exception e){
                scan.nextLine();
            }
        }while (itemPrice < 10.0 || itemPrice > 2000.0);
    }
    public static void wwydMenu(){
        int choose = 0;

        do {
            System.out.println("What will you do?");
            System.out.println("=================");
            System.out.println("1. Sell item");
            System.out.println("2. Restock item");
            System.out.println("3. Exit");
            System.out.print("Choose : ");
            try {
                choose = scan.nextInt();
                scan.nextLine();
            }catch (Exception e){
                scan.nextLine();
            }
        }while (choose != 3);
    }
    public static void sellItem(){

    }
    public static void restockItem(){

    }
}
