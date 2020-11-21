package lab.pokemons;
import ru.ifmo.se.pokemon.*;
import lab.attacks.*;

public class Budew extends Pokemon{
    public Budew(String name, int level) {
        super(name, level);
        setStats(40, 30, 35, 50, 70, 55);
        setType(Type.GRASS, Type.POISON);
        setMove(new SwordsDance(), new Swagger());
    }
}
