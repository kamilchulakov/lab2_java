package lab.attacks;
import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    @Override
    protected String describe() {
        // RockMusic.play();
        return "применяет Rock Tomb, уменьшает скорость противника на 1";
    }
    @Override
    protected void applyOppEffects(Pokemon p)
    {
        p.setMod(Stat.SPEED, -1);
    }
    public RockTomb(){
        super(Type.ROCK,60,95);
    }
}
