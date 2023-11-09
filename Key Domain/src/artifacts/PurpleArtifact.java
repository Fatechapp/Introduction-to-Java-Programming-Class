package artifacts;

import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PurpleArtifact extends Artifact {

    static Scanner scan = new Scanner(System.in);

    private String bonusStatus;
    private List<PurpleArtifact> purpleArtifactList = new ArrayList<>();

    public PurpleArtifact(String name, String type, int baseAttack, String bonusStatus) {
        super(name, type, baseAttack);
        this.bonusStatus = bonusStatus;
    }

    public String getBonusStatus() {
        return bonusStatus;
    }

    public void setBonusStatus(String bonusStatus) {
        this.bonusStatus = bonusStatus;
    }

    public List<PurpleArtifact> getPurpleArtifactList() {
        return purpleArtifactList;
    }

    public void setPurpleArtifactList(List<PurpleArtifact> purpleArtifactList) {
        this.purpleArtifactList = purpleArtifactList;
    }
    public void addToPurpleArtifactList() {
        purpleArtifactList.add(this);
    }

    @Override
    public int calculateDamage() {
        return (int) getBaseAttack() * 100;
    }
    public void insertPurpleArtifact() {
        String name;
        String type;
        int baseAttack;
        String bonusStatus;

        System.out.println("\nAdd new artifacts!");
        System.out.println("==================");

        System.out.print("Input name [5..25 characters]: ");
        name = scan.nextLine();

        System.out.print("Input type [Flower | Plume | Sands | Goblet | Circlet] [case sensitive]: ");
        type = scan.nextLine();

        System.out.print("Input base attack [Flower/Plume = 90 - 100 | Sands/Goblet/Circlet = 101 - 110]: ");
        baseAttack = Integer.parseInt(scan.nextLine());

        System.out.print("Input bonus status [Anemo | Pyro | Hydro | Electro | Cryo][case sensitive]: ");
        bonusStatus = scan.nextLine();

        PurpleArtifact aPurpleArtifact = new PurpleArtifact(name, type, baseAttack, bonusStatus);
        purpleArtifactList.add(aPurpleArtifact);
    }
}
