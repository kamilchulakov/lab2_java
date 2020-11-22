package lab.attacks;
import ru.ifmo.se.pokemon.*;

public class AquaRing extends StatusMove{
    public AquaRing() {
        super(Type.NONE, 0, 100);
    }

    @Override
    protected String describe() {
        return "использует Aqua Ring, окружая себя кольцом воды";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().turns(5).stat(Stat.HP, (int) (-p.getStat(Stat.HP)/16)));
    }
}