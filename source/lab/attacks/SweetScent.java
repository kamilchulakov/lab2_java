package lab.attacks;

import ru.ifmo.se.pokemon.*;

public class SweetScent extends StatusMove{
    public SweetScent() {
        super(Type.NONE, 0, 100);
    }
    @Override
    protected String describe() {
        return "уменьшает Evasion цели на 1 с помощью Sweet Scent";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.EVASION, -1);
    }
}
