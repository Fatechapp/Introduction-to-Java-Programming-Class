import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import artifacts.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static PurpleArtifact purpleArtifact = new PurpleArtifact(null, null, 0, null);
    static GoldenArtifact goldenArtifact = new GoldenArtifact(null, null, 0, 0);



    public static void main(String[] args) {
//        PurpleArtifact purpleArtifact = new PurpleArtifact("Flower1", "Flower", 95, "Pyro");
//        GoldenArtifact goldenArtifact = new GoldenArtifact("Sands1", "Sands", 105, 1.8);
//
//        purpleArtifact.addToArtifactList();
//        goldenArtifact.addToArtifactList();
//


        mainMenu();

    }
    public static void mainMenu() {
        int menu = 0;

        while (true) {
            System.out.println("\nKey Domain");
            System.out.println("==========");
            System.out.println("1. Insert artifacts");
            System.out.println("2. View obtainable artifacts");
            System.out.println("3. Delete for artifact");
            System.out.println("4. Exit");
            while (true) {
                try {
                    System.out.print(">> ");
                    menu = Integer.parseInt(scan.nextLine());
                    break;
                } catch (Exception e) {

                }
            }

            switch (menu) {
                case 1:
                    formOne();
                    break;
                case 2:
                    formtwo();
                    break;
                case 3:
                    formthree();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
    public static void formOne() {

        int menu1 = 0;

        System.out.println("Which artifact you want to add?");
        System.out.println("1. Purple Artifact");
        System.out.println("2. Golden Artifact");
        while (true) {
            try {
                System.out.print(">> ");
                menu1 = Integer.parseInt(scan.nextLine());
                break;
            } catch (Exception e) {

            }
        }
        switch (menu1) {
            case 1:
                purpleArtifact.insertPurpleArtifact();
                break;
            case 2:

                break;
            default:
                break;
        }
    }
    public static void formtwo() {
        List<PurpleArtifact> artifacts = purpleArtifact.getPurpleArtifactList();

        if (artifacts.isEmpty()) {
            System.out.println("Kosong artifknya \n");
        }
        else {
            for (Artifact artifact : artifacts) {
                System.out.println("Title: " + artifact.getName());
                System.out.println("Type: " + artifact.getType());
                System.out.println("Base Attack: " + artifact.getBaseAttack());
                System.out.println("Damage: " + artifact.calculateDamage());
                System.out.println("--------");
            }
        }
    }
    public static void formthree() {
        System.out.print("Masukkan urutan Artifact yang akan dihapus: ");
        int orderToDelete = scan.nextInt();
        List<PurpleArtifact> artifacts = purpleArtifact.getPurpleArtifactList();
        artifacts.removeIf(artifact -> artifacts.indexOf(artifact) + 1 == orderToDelete);
    }
}