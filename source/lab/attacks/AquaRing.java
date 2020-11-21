package lab.attacks;
import ru.ifmo.se.pokemon.*;

public class AquaRing extends StatusMove{
    public AquaRing() {
        super(Type.NONE, 0, 100);
    }

    @Override
    protected String describe() {
        return "surrounds itself with a veil of water, which restores 1⁄16 of its maximum HP at the end of each turn using Aqua Ring";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().turns(5).stat(Stat.HP, (int) (-p.getStat(Stat.HP)/16)));
    }
}