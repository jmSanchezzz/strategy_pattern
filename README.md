🕹️ Strategy Pattern – GameApp Problem Scenario
📌 Problem Scenario

Suppose we have three types of characters in a GameApp:

Character Types
1. Knight

Attacks with a sword

Uses three defense strategies:

Shield

Dodge

Magic Barrier

2. Wizard

Casts spells

Uses magic barrier to defend

3. Archer

Shoots arrows

Uses dodge to defend

🎯 Required Design Pattern

Implement the Strategy Pattern using two types of strategies:

A. DefenseStrategy

Shield

Dodge

CreateMagic

B. AttackStrategy

CastSpell

ShootArrow

SwingSword

🔧 Task Requirements

Refactor the existing code to apply the Strategy Pattern

Remove conditional (if–else) logic

Encapsulate attack and defense behaviors into separate strategy classes

Allow behaviors to vary independently from the character

Provide the UML Diagram of the refactored design

🧩 Existing Code (To Be Refactored)
public class Character {
    private String type;

    public Character(String type) {
        this.type = type;
    }

    public void attack() {
        if (type.equals("Knight")) {
            System.out.println("Knight attacks with a sword!");
        } else if (type.equals("Wizard")) {
            System.out.println("Wizard casts a spell!");
        } else if (type.equals("Archer")) {
            System.out.println("Archer shoots an arrow!");
        }
    }

    public void defend() {
        if (type.equals("Knight")) {
            System.out.println("Using a shield to defend!");
            System.out.println("Dodging to avoid attack!");
            System.out.println("Creating a magic barrier for defense!");
        } else if (type.equals("Wizard")) {
            System.out.println("Creating a magic barrier for defense!");
        } else if (type.equals("Archer")) {
            System.out.println("Using a shield to defend!");
        }
    }
}
