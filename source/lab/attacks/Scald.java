package lab.attacks;
import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove{
    public Scald() {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected String describe() {
        return "deals damage and has a 30% chance of burning the target using Scald";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().chance(0.3).condition(Status.BURN));
    }
}