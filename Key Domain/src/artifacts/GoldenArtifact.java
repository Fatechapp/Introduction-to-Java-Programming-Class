package artifacts;

import java.util.ArrayList;
import java.util.List;

public class GoldenArtifact extends Artifact{
    private double multiplier;
    private List<GoldenArtifact> goldenArtifactList = new ArrayList<>();

    public GoldenArtifact(String name, String type, int baseAttack, double multiplier) {
        super(name, type, baseAttack);
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    public List<GoldenArtifact> getGoldenArtifactList() {
        return goldenArtifactList;
    }

    public void setGoldenArtifactList(List<GoldenArtifact> goldenArtifactList) {
        this.goldenArtifactList = goldenArtifactList;
    }
    public void addToPurpleArtifactList() {
        goldenArtifactList.add(this);
    }


    @Override
    public int calculateDamage() {
        return 0;
    }
}
