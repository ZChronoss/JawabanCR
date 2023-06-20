package Missing_Hierarchy.Pokemons;

import Missing_Hierarchy.Entity;
import Missing_Hierarchy.Move;
import Missing_Hierarchy.Types.TypeTrait;
import Missing_Hierarchy.Types.Fire;
import Missing_Hierarchy.Types.Grass;
import Missing_Hierarchy.Types.Water;

import java.util.ArrayList;
import java.util.Random;

public class Treecko extends Entity implements PokemonTrait{
    private int health;
    private TypeTrait type;
    private int speed;
    private ArrayList<Move> moveSet;

    public Treecko(String name) {
        super(name, "");
        this.health = 40;
        this.type = new Fire();
        this.speed = 70;
        this.moveSet = MakeMoveSet();
    }


    public void Attack(PokemonTrait target, Move move){
    		int damageMultiplier = 2;
            if(target.getType().getWeakness().contains(move.getTypeName())){
                damageMultiplier = 3;
                System.out.println(getName() + " used " + move.getName()
                        + " its super effectibe");
            }
            else if(target.getType().getEffectives().contains(move.getTypeName())){
                damageMultiplier = 1;
                System.out.println(getName() + " used " + move.getName()
                        + " its not effectibe");
            }
            target.setHealth(
                    target.getHealth() - move.getDamage()*damageMultiplier);
    }

    public static ArrayList<Move> MakeMoveSet(){
        ArrayList<Move> learnableMoves = LearnableMoves();
        ArrayList<Move> newMoveSet = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(learnableMoves.size());
            Move move = learnableMoves.get(randomIndex);
            newMoveSet.add(move);
        }

        return newMoveSet;
    }

    public static ArrayList<Move> LearnableMoves(){
        ArrayList<Move> learnableMoves = new ArrayList<>();
        learnableMoves.add(new Move("Absorb", 20, 100,
                "grass"));
        return learnableMoves;
    }

    private Move getMove(int index){
        return this.moveSet.get(index);
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public TypeTrait getType() {
        return type;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public ArrayList<Move> getMoveSet() {
        return moveSet;
    }

    @Override
    public void setMoveSet(ArrayList<Move> moveSet) {
        this.moveSet = moveSet;
    }
}
