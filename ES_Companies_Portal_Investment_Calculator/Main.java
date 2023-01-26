import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        double investedMoney = 0d;
        int investMultiplier = 0;

        System.out.println("ES Companies Portal - Investment Calculator");
        System.out.println("========================================");
        System.out.println("Beginning");
        do {
            System.out.print("Input your money to be invested [1...5000 | can use decimal] : $ ");
            investedMoney = scan.nextDouble();
            try {
                if (investedMoney < 0){
                    throw new Exception("");
                } else if (investedMoney > 5000) {
                    throw new Exception("");
                }
                break;
            }catch (Exception e){
                scan.nextLine();
            }
        }while (true);
        do {
            System.out.print("Input the investment multiplier [1..99] :");
            investMultiplier = scan.nextInt();
            try {
                if (investMultiplier < 1){
                    throw new Exception("");
                } else if (investMultiplier > 99) {
                    throw new Exception("");
                }
                break;
            }catch (Exception e){
                scan.nextLine();
            }
        }while (true);
    }
    public static void month(){

    }
}
