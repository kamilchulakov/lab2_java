package lab.attacks;

import ru.ifmo.se.pokemon.*;

public class SweetScent extends StatusMove{
    public SweetScent() {
        super(Type.NONE, 0, 100);
    }
    @Override
    protected String describe() {
        return "lowers the target's Evasion by one stage using Sweet Scent";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.EVASION, -1);
    }
}
