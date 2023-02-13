import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input size : ");
        final int size = scan.nextInt();
        scan.nextLine();

        for (int m = 0; m < size; m++) {
            for (int n = 0; n <= 4 * size; n++) {
                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));
                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));

                if (pos1 < size + 0.5 || pos2 < size + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print(System.lineSeparator());
        }
        for (int m = 1; m <= 1.7 * size; m++){
            for (int n = 0; n < m; n++) {
                System.out.print(' ');
            }
            for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {
                System.out.print("*");
            }
            System.out.print(System.lineSeparator());
        }
    }
}
