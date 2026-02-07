# Strategy Pattern – GameApp Problem Scenario

## Problem Scenario

Suppose we have three types of characters in a GameApp:

## Character Types

**Knight** – Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)

**Wizard** – Casts spells; uses magic barrier to defend

**Archer** – Shoots arrows; uses dodge to to defend

## Required Design Pattern

Implement two types of Strategy:

### A. DefenseStrategy

- Shield
- Dodge
- CreateMagic

### B. AttackStrategy

- CastSpell
- ShootArrow
- SwingSword

## Task Requirement

Refactor the existing codes and provide the UML Diagram:

## Existing Code

```java
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
            System.out.println("Dodgin to avoid attack!");
            System.out.println("Creating a magic barrier for defense!");
        } else if (type.equals("Wizard")) {
            System.out.println("Creating a magic barrier for defense!");
        } else if (type.equals("Archer")) {
            System.out.println("Using a shield to defend!");
        }
    }
}
```
## UML DIAGRAM
<img width="1271" height="521" alt="exported_from_idea drawio" src="https://github.com/user-attachments/assets/5e03fa89-1555-42ed-987f-6bf532e2d034" />

