import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    static Vector<String> NAME = new Vector<String>();
    static Vector<Integer> AGE = new Vector<Integer>();
    static Vector<Integer> CODE = new Vector<Integer>();

    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        int choose = 0;
        do {
            System.out.println("\nData Karyawan");
            System.out.println("=============");
            System.out.println("1. Input");
            System.out.println("2. View");
            System.out.println("3. Delete Data");
            System.out.println("4. Exit");
            System.out.print(">> ");
            choose = scan.nextInt();
            scan.nextLine();

            switch (choose){
                case 1:
                    inputData();
                    break;
                case 2:
                    viewData();
                    break;
                case 3:
                    deleteData();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (choose != 4);
    }
    public static void  inputData(){
        String name = "";
        int age = 0
                ;
        System.out.println("\nData Karyawan");
        System.out.println("=============");
        do {
            System.out.print("Name            : ");
            name = scan.nextLine();
        }while (name.length() < 5);
        NAME.add(name);

        System.out.print("Age             : ");
        age = scan.nextInt();
        scan.nextLine();
        AGE.add(age);

        int random_number = rand.nextInt(4001) + 1000;
        System.out.println("Code            : " + random_number);
        System.out.println();
        CODE.add(random_number);
    }
    public static void  viewData(){
        if (NAME.isEmpty()){
            System.out.println("Data kosong");
        } else if (!NAME.isEmpty()) {
            for (int i = 0; i < NAME.size() - 1; i++){
                for (int j = i + 1; j < NAME.size(); j++){
                    if (NAME.get(i).compareTo(NAME.get(j)) > 0){
                        String tempName = NAME.get(i);
                        NAME.set(i, NAME.get(j));
                        NAME.set(j, tempName);

                        int tempAge = AGE.get(i);
                        AGE.set(i, AGE.get(j));
                        AGE.set(j, tempAge);

                        int tempCode = CODE.get(i);
                        CODE.set(i, CODE.get(j));
                        CODE.set(j, tempCode);
                    }
                }
            }
            for (int i = 0; i < NAME.size(); i++){
                System.out.println("Data ke : " + (i + 1));
                System.out.println("Name    : " + NAME.get(i));
                System.out.println("Age     : " + AGE.get(i));
                System.out.println("Code    : " + CODE.get(i));
                System.out.println("");
            }
        }

    }
    public static void  deleteData(){
        viewData();

        int choose = 0;

        System.out.println("Data Karyawan");
        System.out.println("=============");
        System.out.println("Hapus data ke : ");
        choose = scan.nextInt();
        scan.nextLine();
        NAME.remove(choose - 1);
        AGE.remove(choose - 1);
        CODE.remove(choose - 1);
    }
}
