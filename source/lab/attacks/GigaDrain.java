package lab.attacks;
import ru.ifmo.se.pokemon.*;

public class GigaDrain extends SpecialMove {
    public GigaDrain() {
        super(Type.GRASS, 75, 100);
    }
    @Override
    protected String describe() {
        return "deals damage and the user will recover 50% of the HP drained using Giga Drain";
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int) -p.getHP()/2);
    }
}
