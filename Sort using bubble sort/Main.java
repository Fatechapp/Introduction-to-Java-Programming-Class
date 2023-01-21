import javax.swing.*;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Vector<String> NAMA = new Vector<String>();
    static Vector<Integer> AGE = new Vector<Integer>();
    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        int menu = 0;
        do {
            System.out.println("Sort Name");
            System.out.println("=========");
            System.out.println("1. Input Name");
            System.out.println("2. View Name");
            System.out.println("3. Exit");
            System.out.print(">> ");
            try {
                menu = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){

            }
            switch (menu){
                case 1:
                    inputName();
                    break;
                case 2:
                    viewName();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (menu != 3);
    }
    public static void inputName(){
        String name = "";
        int age = 0;

        System.out.println("Sort Name");
        System.out.println("=========");
        System.out.print("Input Name : ");
        name = scan.nextLine();
        NAMA.add(name);

        do {
            System.out.print("Input Age  : ");
            try {
                age = scan.nextInt();
                scan.nextLine();
            }catch (Exception e){

            }
        }while (age < 0);
        AGE.add(age);

        System.out.println("");
    }
    public static void viewName(){
        int sortType = 0;
        if (NAMA.isEmpty()){
            System.out.println("Name is still empty");
        } else if (!NAMA.isEmpty()) {
            do {

                System.out.println("\nNAME LIST");
                System.out.println("================");
                System.out.println("1. by Name Ascending");
                System.out.println("2. by Name Descending");
                System.out.println("3. by Age Ascending");
                System.out.println("4. by Age Descending");
                System.out.println("5. back to main menu");
                System.out.print(">> ");
                sortType = scan.nextInt();

                switch (sortType){
                    case 1:
                        AsortByName();
                        break;
                    case 2:
                        DsortByName();
                        break;
                    case 3:
                        AsortByAge();
                        break;
                    case 4:
                        DsortByAge();
                        break;
                    case 5:
                        mainMenu();
                        break;
                }
            } while (sortType != 5);
        }
    }
    public static void AsortByName(){
        String NameData = String.format("| %-3s | %-20s | %-10s |", "", "Name", "Age");
        System.out.println(NameData);
        for (int i = 0; i < NAMA.size()-1; i++){
            for (int j = 0; j < NAMA.size()-i-1; j++){
                if (NAMA.get(j).compareTo(NAMA.get(j+1)) > 0){
                    String tempNama = NAMA.get(j);
                    int tempAge = AGE.get(j);
                    NAMA.set(j,NAMA.get(j+1));
                    AGE.set(j,AGE.get(j+1));
                    NAMA.set(j+1,tempNama);
                    AGE.set(j+1,tempAge);
                }
            }
        }
        for (int i = 0; i < NAMA.size(); i++){
            String Data = String.format("| %-3s | %-20s | %-10s |", (i+1), NAMA.get(i), AGE.get(i));
            System.out.println(Data);
        }
    }
    public static void DsortByName(){
        String NameData = String.format("| %-3s | %-20s | %-10s |", "", "Name", "Age");
        System.out.println(NameData);
        for (int i = 0; i < NAMA.size()-1; i++){
            for (int j = 0; j < NAMA.size()-i-1; j++){
                if (NAMA.get(j).compareTo(NAMA.get(j+1)) < 0){
                    String tempNama = NAMA.get(j);
                    int tempAge = AGE.get(j);
                    NAMA.set(j,NAMA.get(j+1));
                    AGE.set(j,AGE.get(j+1));
                    NAMA.set(j+1,tempNama);
                    AGE.set(j+1,tempAge);
                }
            }
        }
        for (int i = 0; i < NAMA.size(); i++){
            String Data = String.format("| %-3s | %-20s | %-10s |", (i+1), NAMA.get(i), AGE.get(i));
            System.out.println(Data);
        }
    }
    public static void AsortByAge(){
        for (int i = 0; i < AGE.size()-1; i++){
            for (int j = 0; j < AGE.size()-i-1; j++){
                if (AGE.get(j) > AGE.get(j+1)){
                    String tempNama = NAMA.get(j);
                    int tempAge = AGE.get(j);
                    NAMA.set(j,NAMA.get(j+1));
                    AGE.set(j,AGE.get(j+1));
                    NAMA.set(j+1,tempNama);
                    AGE.set(j+1,tempAge);
                }
            }
        }
        for (int i = 0; i < NAMA.size(); i++){
            String Data = String.format("| %-3s | %-20s | %-10s |", (i+1), NAMA.get(i), AGE.get(i));
            System.out.println(Data);
        }

    }
    public static void DsortByAge(){
        for (int i = 0; i < AGE.size()-1; i++){
            for (int j = 0; j < AGE.size()-i-1; j++){
                if (AGE.get(j) < AGE.get(j+1)){
                    String tempNama = NAMA.get(j);
                    int tempAge = AGE.get(j);
                    NAMA.set(j,NAMA.get(j+1));
                    AGE.set(j,AGE.get(j+1));
                    NAMA.set(j+1,tempNama);
                    AGE.set(j+1,tempAge);
                }
            }
        }
        for (int i = 0; i < NAMA.size(); i++){
            String Data = String.format("| %-3s | %-20s | %-10s |", (i+1), NAMA.get(i), AGE.get(i));
            System.out.println(Data);
        }
    }
}
