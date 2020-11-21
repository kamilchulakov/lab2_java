import ru.ifmo.se.pokemon.*;
import lab.attacks.*;
import lab.pokemons.*;


public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        // battle.addAlly(new Golett("GOLETTA", 10));
        // battle.addAlly(new Budew("BUDEW", 10));
        // battle.addAlly(new Roselia("ROSE", 50));
        battle.addAlly(new Alomomola("ALLO", 10));
        battle.addFoe(new Golurk("HLEBTSA", 10));
        battle.go();
    }
}
