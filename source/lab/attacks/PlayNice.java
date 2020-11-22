package lab.attacks;
import ru.ifmo.se.pokemon.*;

public class PlayNice extends StatusMove{
    public PlayNice() {
        super(Type.NONE, 0, 100);
    }
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, -1);
    }
    @Override
    protected String describe() {
        return "уменьшает атаку противника на 1 используя Play Nice";
    }
}
