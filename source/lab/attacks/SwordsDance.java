package lab.attacks;
import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove{
    public SwordsDance() {
        super(Type.NONE,0, 100);
    }
    @Override
    protected String describe() {
        return "raises the user's Attack by two stages using Swords Dance";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, +2);
    }
}
