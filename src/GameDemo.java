import java.util.Arrays;

public class GameDemo {
    public static void main(String[] args) {
        Character knight = new Character("Knight", new SwingSword(),
                Arrays.asList(new Shield(), new Dodge(), new CreateMagic()));

        Character wizard = new Character("Wizard", new CastSpell(),
                Arrays.asList(new CreateMagic()));

        Character archer = new Character("Archer", new ShootArrow(),
                Arrays.asList(new Dodge()));

        System.out.println("--- Knight Actions ---");
        knight.attack();
        knight.defend();

        System.out.println("\n--- Wizard Actions ---");
        wizard.attack();
        wizard.defend();

        System.out.println("\n--- Archer Actions ---");
        archer.attack();
        archer.defend();
    }
}