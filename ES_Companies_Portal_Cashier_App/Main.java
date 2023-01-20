import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        cashierApp();
    }
    public static void cashierApp(){
        String iName = "";
        double iPrice = 0d;
        int iQuantity = 0;
        double iDiscount = 0;

        System.out.println("ES Companies Portal - Cashier App");
        System.out.println("=================================");
        System.out.print("Input item's name                 : ");
        iName = scan.nextLine();

        do {
            System.out.print("Input item's price                : Rp ");
            iPrice = scan.nextDouble();
            scan.nextLine();
            try {
                if (iPrice < 0){
                    throw new Exception("");
                }
                break;
            } catch (Exception e){

            }
        } while (true);

        do {
            System.out.print("Input item's quantity             : ");
            iQuantity = scan.nextInt();
            scan.nextLine();
            try {
                if (iQuantity < 0){
                    throw new Exception("");
                }
                break;
            } catch (Exception e){

            }
        } while (true);
        do {
            System.out.print("Input item's discount [0..75]     : ");
            iDiscount = scan.nextDouble();
            try {
                if(iDiscount < 0){
                    throw new Exception("");
                }
                break;
            } catch (Exception e){

            }
        } while (true);

        System.out.println("");
        Invoice(iName, iPrice, iQuantity, iDiscount);
    }
    public static void hitungTotalPrice(double iPrice, int iQuantity, double iDiscount){
        double totalPrice = iPrice * iQuantity * (100 - iDiscount)/100;
        double inputPrice = 0d;

        System.out.println("\nTotal price      : Rp " + totalPrice);
        System.out.print("Input your money  : Rp ");
        inputPrice = scan.nextDouble();
        scan.nextLine();

        double outputPrice = inputPrice - totalPrice;
        System.out.println("\nThank you for purchasing!");
        System.out.print("Your change       : Rp " + outputPrice);

    }
    public static void Invoice (String iName, double iPrice, int iQuantity, double iDiscount){
        System.out.println("\nES Companies Portal - Invoice");
        System.out.println("=============================");
        System.out.println("Item's name     : " + iName);
        System.out.println("Item's price    : " + iPrice);
        System.out.println("Item's quantity : " + iQuantity);
        System.out.println("Item's discount : " + iDiscount);

        hitungTotalPrice(iPrice, iQuantity, iDiscount);
    }
}
