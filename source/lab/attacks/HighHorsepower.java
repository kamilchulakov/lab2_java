package lab.attacks;
import ru.ifmo.se.pokemon.*;

public class HighHorsepower extends PhysicalMove {
    @Override
    protected String describe() {
        return "fiercely attacks the target using its entire body with HighHorsepower";
    }

    public HighHorsepower(){
        super(Type.GROUND,95,95);
    }
}