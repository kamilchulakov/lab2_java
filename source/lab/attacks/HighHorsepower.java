package lab.attacks;
import ru.ifmo.se.pokemon.*;

public class HighHorsepower extends PhysicalMove {
    @Override
    protected String describe() {
        return "яростно атакует противника всем телом используя HighHorsepower";
    }

    public HighHorsepower(){
        super(Type.GROUND,95,95);
    }
}