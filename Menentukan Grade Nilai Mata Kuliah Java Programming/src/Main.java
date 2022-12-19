import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float nAssignment, nMidExam, nFinalExam, nAkhir;

        // Input nilai assignment
        System.out.print("Masukkan nilai assignment: ");
        nAssignment = scan.nextInt();

        // Input nilai mid exam
        System.out.print("Masukkan nilai mid exam: ");
        nMidExam = scan.nextInt();

        // Input nilai final exam
        System.out.print("Masukkan nilai final exam: ");
        nFinalExam = scan.nextInt();

        // Tampilkan nilai akhir
        nAkhir = (float) ((0.20 * nAssignment) + (0.30 * nMidExam) + (0.50 * nFinalExam));
//        System.out.println("nilai akhir : " + nAkhir);

//        Nilai Akhir Grade
//      90 – 100 A
        if (nAkhir >= 90 && nAkhir <= 100){
            System.out.println("A");
        }

//      85 – 89 A-
        else if (nAkhir >= 85 && nAkhir <= 89){
            System.out.println("A-");
        }

//      80 – 84 B+
        else if (nAkhir >= 80 && nAkhir <= 84){
            System.out.println("B+");
        }

//      75 – 79 B
        else if (nAkhir >= 75 && nAkhir <= 79){
            System.out.println("B");
        }

//      70 – 74 B-
        else if (nAkhir >= 70 && nAkhir <= 74){
            System.out.println("B-");
        }

//      65 – 69 C
        else if (nAkhir >= 65 && nAkhir <= 69){
            System.out.println("C");
        }

//      50 – 64 D
        else if (nAkhir >= 50 && nAkhir <= 64){
            System.out.println("D");
        }

//      0 – 49 E
        else if (nAkhir >= 70 && nAkhir <= 74){
            System.out.println("E");
        }

    }
}