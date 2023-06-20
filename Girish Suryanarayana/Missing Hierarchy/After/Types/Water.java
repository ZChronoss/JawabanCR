package Missing_Hierarchy.Types;


import java.util.ArrayList;

public class Water extends TypeTrait{
    private ArrayList<String> weakness;
    private ArrayList<String> effectives;

    public Water() {
        super("water");
        this.effectives = MakeEffectives();
        this.weakness = MakeWeaknesses();
    }

    private static ArrayList<String> MakeWeaknesses(){
        ArrayList<String> waterWeakness = new ArrayList<>();
        waterWeakness.add("grass");
        return waterWeakness;
    }
    private static ArrayList<String> MakeEffectives(){
        ArrayList<String> waterEffectives = new ArrayList<>();
        waterEffectives.add("fire");
        return waterEffectives;
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
