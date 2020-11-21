package lab.pokemons;
import ru.ifmo.se.pokemon.*;
import lab.attacks.*;

public class Roselia extends Budew{
    public Roselia(String name, int level) {
        super(name, level);
        setStats(50, 60, 45, 100, 80, 65);
        addMove(new GigaDrain());
    }
}
