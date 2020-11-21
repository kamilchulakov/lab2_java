package lab.attacks;
import ru.ifmo.se.pokemon.*;

public class DynamicPunch extends PhysicalMove {
    @Override
    protected String describe() {
        return "deals damage with Dynamic Punch and confuses the target, if it hits." +
                " Confused Pokémon have a 33% chance of hurting themselves each turn, for 1-4 attacking turns";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(1./3).attack(40).turns((int) (1 + Math.random() * 5));
        p.addEffect(e);
    }
    public DynamicPunch(){
        super(Type.FIGHTING,100,50);
    }
}