import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        int menuNum = 0;
        do {
            System.out.println("ES Companies Portal - Cashier App 2");
            System.out.println("================================");
            System.out.println("1. Keyboard - $49.99");
            System.out.println("2. Mouse - $19.99");
            System.out.println("3. Monitor - $99.99");
            System.out.println("4. Exit");
            System.out.print("Choose : ");
            try {
                menuNum = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
            } finally {
                System.out.println("");
            }

            switch (menuNum){
                case 1:
                    buyKeyboard();
                    break;
                case 2:
                    buyMouse();
                    break;
                case 3:
                    buyMonitor();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (menuNum != 4);
    }
    public static void invoice(String item, int quantity, double totalPrice, double price){
        double money = 0d;
        System.out.println("ES Companies Portal - Invoice");
        System.out.println("==========================");
        System.out.println("Item's name : " + item);
        System.out.println("Price       : $ " + price);
        System.out.println("Quantity    : " + quantity);
        System.out.println("\nTotal : " + totalPrice);

        do {
            System.out.print("Input your money : ");
            try {
                money = scan.nextDouble();
            } catch (Exception e){
                scan.nextLine();
            } finally {
                System.out.println("");
            }
            if (money < totalPrice){
                notEnoughMoneyExit();
            } else if (money >= totalPrice) {
                change(money, totalPrice);
            }
        }while (money < 0);
    }
    public static void outOfStockExit(){
        System.out.println("Out of stock!\n");
        System.out.println("Thanks for using this application :D");
        scan.nextLine();

        System.exit(0);
    }
    public static void notEnoughMoneyExit(){
        System.out.println("Not enough money!\n");
        System.out.println("Thanks for using this application :D");
        scan.nextLine();

        System.exit(0);
    }
    public static void change(double money, double totalPrice){
        double change = money - totalPrice;
        System.out.println("Thanks for purchasing!");
        System.out.println("Your change : " + change + "\n");
        System.out.println("Thanks for using this application :D");
        System.exit(0);
    }
    public static void buyKeyboard(){
        String Item = "Keyboard";
        double price = 49.99;
        int keyQuantity = 0;
        do {
            System.out.print("Input quantity [1..20] : ");
            try {
                keyQuantity = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
            } finally {
                System.out.println("");
            }
        } while (keyQuantity == 0);
        if (keyQuantity > 20){
            outOfStockExit();
        }
        double totalPrice = price * keyQuantity;
        invoice(Item, keyQuantity, totalPrice, price);
    }
    public static void buyMouse(){
        String Item = "Mouse";
        double price = 19.99;
        int mouseQuantity = 0;
        do {
            System.out.print("Input quantity [1..20] : ");
            try {
                mouseQuantity = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
            } finally {
                System.out.println("");
            }
        } while (mouseQuantity == 0);
        if (mouseQuantity > 20){
            outOfStockExit();
        }
        double totalPrice = price * mouseQuantity;
        invoice(Item, mouseQuantity, totalPrice, price);
    }
    public static void buyMonitor(){
        String Item = "Monitor";
        double price = 99.99;
        int moniQuantity = 0;
        do {
            System.out.print("Input quantity [1..20] : ");
            try {
                moniQuantity = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
            } finally {
                System.out.println("");
            }
        } while (moniQuantity == 0);
        if (moniQuantity > 20){
            outOfStockExit();
        }
        double totalPrice = price * moniQuantity;
        invoice(Item, moniQuantity, totalPrice, price);
    }
}
