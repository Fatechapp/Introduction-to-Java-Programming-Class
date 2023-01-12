import java.util.Scanner;
import java.util.Vector;

public class trial {
    static Scanner scan = new Scanner(System.in);
    static Vector<String> NAMES = new Vector<String>();
    static Vector<String> GENDER = new Vector<String>();
    static Vector<String> ADRESS = new Vector<String>();
    static Vector<Integer> AGE = new Vector<Integer>();
    static Vector<String> INITIAL = new Vector<String >();
    public static void main(String[] args) {
        int menuNum = 0;
        do {
            println("POWER RECRUITMENT");
            println("-----------------");
            println("1. Input new candidate");
            println("2. View candidate's data");
            println("3. Remove candidate");
            println("4. Exit");
            print("Choose : "); menuNum = scan.nextInt();
            println("");

            // MENU MENU MENU MENU MENU MENU MENU MENU MENU MENU MENU MENU MENU MENU MENU MENU MENU MENU

            if (menuNum == 1){
                menu_1();
            }
            if (menuNum == 2){
                viewCandidate();
            }
            if (menuNum == 3){
                removeCandidate();
            }

        }while (menuNum != 4);
    }
    // MENU 1 MENU 1 MENU 1 MENU 1 MENU 1 MENU 1 MENU 1 MENU 1 MENU 1 MENU 1 MENU 1 MENU 1
    private static void  menu_1(){
        String name = "";
        String gender = "";
        String address = "";
        int age = 0;

        do {
            print("input candidate's name [5..20] : ");
            name = scan.nextLine();
            try{
                if (name.length() <= 5
                        || name.length() >= 20){
                    throw new Exception("Panjang nama harus antara 5-20 huruf");
                }
                else if (name.split(" ").length < 2){
                    throw new Exception("Name must be at least 2 words!");
                }
                System.out.println("Nama yang dimasukkan: " + name);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (true);
        NAMES.add(name);

        do {
            print("Input candidate's gender [male | female] : ");
            gender = scan.nextLine();
            try{
                if (!gender.equalsIgnoreCase("male")
                        && !gender.equalsIgnoreCase("female")){
                    throw new Exception("male or female?");
                }
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (true);
        GENDER.add(gender);

        do {
            print("Input candidate's address [must be ended with 'street'] : ");
            address = scan.nextLine();
            try {
                if (!address.endsWith("street")){
                    throw new Exception("adress must be ended with 'street'! ");
                }
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (true);
        ADRESS.add(address);

        do {
            print("Input candidate's age [17..30] : ");
            age = scan.nextInt();
            scan.nextLine();
            try {
                if (age <= 17){
                    throw new Exception("age must be below 16");
                } else if ( age >= 30) {
                    throw new Exception("age must be under 31");
                }
                break;
            } catch (Exception e){
                println(e.getMessage());
            }
        } while (true);
        AGE.add(age);

        String initial = ""+name.charAt(0)+name.charAt(name.indexOf(" ")+1);
        println("Thank you for registering! Your initial is : " + initial);
        INITIAL.add(initial);

        scan.nextLine();
    }
    private static void viewCandidate(){
        if (NAMES.isEmpty()){
            println("No Data Found! \n");
        }
        else{
            for (int i = 0; i < NAMES.size(); i++){
                println("Data : " + (i+1));
                println("Name : " + NAMES.get(i));
                println("Initial : " + INITIAL.get(i));
                println("Gender : " + GENDER.get(i));
                println("Adress : " + ADRESS.get(i));
                println("Age : " + AGE.get(i));
            }
        }
    }
    private static void removeCandidate(){
        viewCandidate();
        int select;
        do {
            System.out.print("Select Data to Delete : " + NAMES.size());
            select = scan.nextInt();
        } while (select > NAMES.size() || select < 0);
        if (select ==0) {
            menu_1();
        } else {
            NAMES.remove(select -1);
            GENDER.remove(select -1);
            AGE.remove(select -1);
            ADRESS.remove(select -1);
        }
    }

    // PRINTLN PRINTLN PRINTLN PRINTLN PRINTLN PRINTLN PRINTLN PRINTLN PRINTLN PRINTLN PRINTLN PRINTLN
    private static void println(String s){
        System.out.println(s);
    }private static void println(char c){
        System.out.println(c);
    }private static void println(int i){
        System.out.println(i);
    }private static void println(float f){
        System.out.println(f);
    }private static void println(double d){
        System.out.println(d);
    }

    // PRINT PRINT PRINT PRINT PRINT PRINT PRINT PRINT PRINT PRINT PRINT
    private static void print(String s){
        System.out.print(s);
    }private static void print(char c){
        System.out.print(c);
    }private static void print(int i){
        System.out.print(i);
    }private static void print(float f){
        System.out.print(f);
    }private static void print(double d){
        System.out.print(d);
    }
}
