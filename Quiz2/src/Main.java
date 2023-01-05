import java.util.Scanner;
import java.util.Vector;

public class Main {
    Scanner scan = new Scanner((System.in));
    Vector<String> FLAVOURS = new Vector<String >();
    Vector<String> ADDONS = new Vector<String >();
    Vector<String> TOASTSIZE = new Vector<String >();
    Vector<Integer> QUANTITY = new Vector<Integer>();
    Vector<Float> TOTALPRICE = new Vector<Float>();
    public Main(){
        int menu = 0;
        do {
            System.out.println("ToastHouse");
            System.out.println("=================");
            System.out.println("1. Order Toast");
            System.out.println("2. View Orders");
            System.out.println("3. Exit");
            System.out.print(">> ");

            try{
                menu = scan.nextInt();
            } catch (Exception e){}
            finally {
                scan.nextLine();
                System.out.println("");
            }

            if (menu == 1){
                orderToast();
            }
            else if (menu == 2) {
                viewOrders();
            }
            else if (menu == 2) {
                System.exit(0);
            }
        }while (menu != 3);
    }
    void orderToast(){
        String flavour = "";
        String addOns = "";
        String toastSize = "";
        float addOnsPrice = 0;
        float flavorPrice = 0;
        float hargaUkuran = 0;
        int quantity = 0;

        // FLAVOUR
        do {
            System.out.print("Input flavour [Plain | Chocolate | Cheese] (case sensitive) : ");
            try {
                flavour = scan.nextLine();
            } catch (Exception e){}
        } while (!flavour.equals("Plain") && !flavour.equals("Chocolate") && !flavour.equals("Cheese"));

        // ADDONS
        do {
            System.out.print("Input add-ons [None | Butter | Sprinkles] (case sensitive) : ");
            try {
                addOns = scan.nextLine();
            } catch (Exception e){}
        } while (!addOns.equals("None") &&
                !addOns.equals("Butter") &&
                !addOns.equals("Sprinkles"));

        // TOAST SIZE
        do {
            System.out.print("Input toast size [Regular | Large] (case insensitive) : ");
            try {
                toastSize = scan.nextLine();
            } catch (Exception e){}
        } while (!toastSize.equalsIgnoreCase("Regular") &&
                !toastSize.equalsIgnoreCase("Large"));

        // QUANTITY
        do {
            System.out.print("Input order quantity [at least 1] : ");
            try {
                quantity = scan.nextInt();
            } catch (Exception e){}
        } while (quantity < 1);

        // HARGA ADDONS
        if (addOns.equals("None")){
            addOnsPrice = 0;
        }if (addOns.equals("Butter")){
            addOnsPrice = 2000;
        }if (addOns.equals("Sprinkles")){
            addOnsPrice = 5000;
        }

        // HARGO FLAVOR
        if (flavour.equals("Plain")){
            flavorPrice = 10000;
        }if (flavour.equals("Chocolate")){
            flavorPrice = 15000;
        }if (flavour.equals("Cheese")){
            flavorPrice = 15000;
        }

        // HARGA TOAST SIZE
        if (toastSize.equalsIgnoreCase("Large")){
            hargaUkuran = (flavorPrice + addOnsPrice) * quantity;
        } if (toastSize.equalsIgnoreCase("Large")){
            hargaUkuran = (flavorPrice + addOnsPrice) * quantity * 1.5f;
        }

        // add to VECTOR
        FLAVOURS.add(flavour);
        ADDONS.add(addOns);
        TOASTSIZE.add(toastSize);
        QUANTITY.add(quantity);
        TOTALPRICE.add(hargaUkuran);

        System.out.println("");
        System.out.println("Added order succesfully! \n");
    }
//    void hitungHarga(){
//        float totalPrice = 0;
//        float flavorPrice = 0;
//        float addOnsPrice = 0;
//        int quantity = 0;
//        String toastSize = "";
//        if (toastSize.equalsIgnoreCase("Regular")){
//            totalPrice = (flavorPrice + addOnsPrice) * quantity;
//        } else if (toastSize.equalsIgnoreCase("Large")) {
//            totalPrice = ((flavorPrice + addOnsPrice) * quantity * 1.5f);
//        }
//        TOTALPRICE.add(totalPrice);
//    }
    void viewOrders(){
        for (int i = 0; i < FLAVOURS.size(); i++){
            System.out.println("Name : " + FLAVOURS.get(i));
            System.out.println("Category : " + ADDONS.get(i));
            System.out.println("Type : " + TOASTSIZE.get(i));
            System.out.println("Quantity : " + QUANTITY.get(i));
            System.out.println("Total Price : " + TOTALPRICE.get(i));
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}
