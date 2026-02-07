import java.util.List;

public class Character {
    private String type;
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies;

    public Character(String type, AttackStrategy attackStrategy, List<DefenseStrategy> defenseStrategies) {
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = defenseStrategies;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        System.out.println(type + " is defending:");
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }
}