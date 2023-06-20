package Missing_Hierarchy.Pokemons;

import java.util.ArrayList;
import java.util.Random;

import Missing_Hierarchy.Entity;
import Missing_Hierarchy.Move;
import Missing_Hierarchy.Types.Fire;
import Missing_Hierarchy.Types.Grass;
import Missing_Hierarchy.Types.TypeTrait;
import Missing_Hierarchy.Types.Water;

public interface PokemonTrait {

    public int getHealth();
    
    public void setHealth(int health);

    public TypeTrait getType();

    public int getSpeed();

    public void setSpeed(int speed);

    public ArrayList<Move> getMoveSet();

    public void setMoveSet(ArrayList<Move> moveSet);
}
