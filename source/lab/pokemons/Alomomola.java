package lab.pokemons;
import ru.ifmo.se.pokemon.*;
import lab.attacks.*;

public class Alomomola extends Pokemon{
    public Alomomola(String name, int level) {
        super(name, level);
        setStats(165, 75, 80, 40, 45, 65);
        setType(Type.WATER);
        setMove(new Pound(), new AquaRing(), new PlayNice(), new Scald());
    }
}
