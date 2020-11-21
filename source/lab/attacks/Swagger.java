package lab.attacks;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove{
    public Swagger() {
        super(Type.NONE, 0, 85);
    }
    @Override
    protected String describe() {
        return "confuses the target and raises its Attack by two stages using Swagger";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, +2);
        p.confuse();
    }
}
