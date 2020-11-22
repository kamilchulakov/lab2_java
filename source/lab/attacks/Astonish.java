package lab.attacks;
import ru.ifmo.se.pokemon.*;

public class Astonish extends PhysicalMove {
    @Override
    protected String describe() {
        return "применяет Astonish с возможностью блокировки атаки противника на 1 ход";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.3).attack(0).turns(1);
        p.addEffect(e);
    }
    public Astonish(){
        super(Type.GHOST,30,100);
    }
}