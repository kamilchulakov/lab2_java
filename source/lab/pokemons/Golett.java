package lab.pokemons;
import ru.ifmo.se.pokemon.*;
import lab.attacks.*;

public class Golett extends Pokemon {
    public Golett(String name, int level) {
        super(name, level);
        setStats(59, 74, 50, 35, 50, 35);
        setType(Type.GROUND, Type.GHOST);
        setMove(new Astonish(), new DynamicPunch(), new RockTomb());
    }
}
