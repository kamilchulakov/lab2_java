import ru.ifmo.se.pokemon.*;
import lab.attacks.*;
import lab.pokemons.*;


public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.addAlly(new Golett("GOLETTA", 50));
        battle.addFoe(new Budew("BUDEW", 50));
        battle.addAlly(new Roselia("ROSE", 50));
        battle.addAlly(new Alomomola("ALLO", 50));
        battle.addFoe(new Golurk("HLEBTSA", 50));
        battle.go();
    }
}
