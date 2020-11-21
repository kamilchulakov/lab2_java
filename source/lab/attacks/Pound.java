package lab.attacks;
import ru.ifmo.se.pokemon.*;

public class Pound extends PhysicalMove{
    public Pound() {
        super(Type.NONE, 40, 100);
    }

    @Override
    protected String describe() {
        return "deals damage using Pound";
    }
}
