import java.util.Scanner;
import java.util.Vector;

public class Main {
    Scanner scan = new Scanner(System.in);
    Vector<String> names = new Vector<String>();
    Vector<String> foodNames = new Vector<String>();
    Vector<String> categories = new Vector<String>();
    Vector<String> types = new Vector<String>();
    Vector<Integer> prices = new Vector<Integer>();

    public Main(){
        int menu = 0;
        do {
            System.out.println("Restaurant");
            System.out.println("1. Insert Order");
            System.out.println("2. Update Order");
            System.out.println("3. Delete Order");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            try {
                menu = scan.nextInt();
            } catch (Exception e){

            } finally {
                scan.nextLine();
            }

            if (menu == 1){
                insertOrder();
            }
            else if (menu == 2) {
                updateOrder();
            }
            else if (menu == 3) {
                deleteOrder();
            }
            else if (menu == 4) {
                checkout();
            }
        }while (menu != 5);
    }

    void insertOrder(){
        String name = "";
        String category = "";
        String type = "";
        String foodName = "";
        int price = 0;

        do {
            System.out.print("Name : ");
            name = scan.nextLine();
        }while (!name.startsWith("Mr") && !name.startsWith("Mrs"));

        do {
            System.out.print("Category ( Breakfast || Lunch ) : ");
            category = scan.nextLine();
        }while (!category.equalsIgnoreCase("Breakfast") &&
                !category.equalsIgnoreCase("Lunch"));

        while (true){
            System.out.print("Food Type ( Food || Beverages || Snack ) : ");
            type = scan.nextLine();

            if (type.equals("Food") ||
                    type.equals("Beverages") ||
                    type.equals("Snack")) {
                break;
            }
        }

        do {
            System.out.print("Food Name : ");
            foodName = scan.nextLine();
        }while (foodName.length() < 5 ||
                foodName.length() > 20 ||
                foodNames.contains(foodName));

        do {
            System.out.print("Food price ( > 10000) : ");
            price = scan.nextInt();
        }while (price < 10000);

        // atau bisa juga dengan

//        while (true){
//            System.out.println("Food price : ");
//            price = scan.nextInt();
//
//            if (price > 10000){
//                break;
//            }
        names.add(name);
        categories.add(category);
        types.add(type);
        foodNames.add(foodName);
        prices.add(price);

        System.out.println("OKE");
        }

        void  printOrder(){
            for (int i = 0; i < names.size(); i++){
                System.out.println("Name : " + names.get(i));
                System.out.println("Category : " + categories.get(i));
                System.out.println("Type : " + types.get(i));
                System.out.println("Food Name : " + foodNames.get(i));
                System.out.println("Price : " + prices.get(i));
                System.out.println("===============================");
            }
        }
        void updateOrder(){
            printOrder();
            int idx = 0;

            do {
                System.out.print(" Select Order : ");
                idx = scan.nextInt();
                scan.nextLine();
            }while (idx < 1 || idx > names.size());

            String name = "";

            do {
                System.out.print("Name : ");
                name = scan.nextLine();
            }while (!name.startsWith("Mr") && !name.startsWith("Mrs"));

            names.set(idx - 1, name);
        }

        void deleteOrder(){
            printOrder();
            int idx = 0;

            do {
                System.out.print(" Select Order : ");
                idx = scan.nextInt();
                scan.nextLine();
            }while (idx < 1 || idx > names.size());

            names.remove(idx - 1);
            categories.remove(idx - 1);
            types.remove(idx - 1);
            foodNames.remove(idx - 1);
            prices.remove(idx - 1);
        }

        void checkout(){
            String input = "";
            do {
                System.out.print("Are you sure want to checkout ( Yes || No ) ? ");
                input = scan.nextLine();
            }while (!input.equals("Yes") && !input.equals("No"));
            if (input.equals("Yes")){
                names.clear();
                categories.clear();
                types.clear();
                foodNames.clear();
                prices.clear();
            }
        }
    public static void main(String[] args) {
        new Main();
    }
}

