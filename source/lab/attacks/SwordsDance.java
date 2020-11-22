package lab.attacks;
import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove{
    public SwordsDance() {
        super(Type.NONE,0, 100);
    }
    @Override
    protected String describe() {
        return "решает танцеввть с ножами, увеличивает свою атаку на 2";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, +2);
    }
}
