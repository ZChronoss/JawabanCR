package Missing_Hierarchy.Types;

import java.util.ArrayList;

public class Grass extends TypeTrait{
    private ArrayList<String> weakness;
    private ArrayList<String> effectives;

    public Grass() {
        super("grass");
        this.effectives = MakeEffectives();
        this.weakness = MakeWeaknesses();
    }

    private static ArrayList<String> MakeWeaknesses(){
        ArrayList<String> grassWeakness = new ArrayList<>();
        grassWeakness.add("fire");
        return grassWeakness;
    }

    private static ArrayList<String> MakeEffectives(){
        ArrayList<String> grassEffectives = new ArrayList<>();
        grassEffectives.add("water");
        return grassEffectives;
    }

    @Override
    public ArrayList<String> getWeakness() {
        return weakness;
    }

    @Override
    public void setWeakness(ArrayList<String> weakness) {
        this.weakness = weakness;
    }

    @Override
    public ArrayList<String> getEffectives() {
        return effectives;
    }

    @Override
    public void setEffectives(ArrayList<String> effectives) {
        this.effectives = effectives;
    }

}
