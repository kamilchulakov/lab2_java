package lab.pokemons;
import ru.ifmo.se.pokemon.*;
import lab.attacks.*;

public class Roserade extends Roselia{
    public Roserade(String name, int level) {
        super(name, level);
        setStats(60, 70, 65, 125, 105, 90);
        addMove(new SweetScent());
    }
}
