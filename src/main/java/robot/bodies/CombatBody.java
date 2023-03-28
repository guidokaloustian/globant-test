package robot.bodies;

public class CombatBody implements Body {
    public FighterType type;

    public CombatBody(FighterType type) {
        this.type = type;
    }

    public void combat() {
        System.out.println("I'm combating");
    }

    public void retire() {
        System.out.println("I'm retiring");
    }

    public void changeType(FighterType type) {
        this.type = type;
    }

    @Override
    public void move() {
        System.out.println("I'm moving.");
    }

    @Override
    public void grab() {
        System.out.println("I'm grabbing this.");
    }

    @Override
    public void talk() {
        System.out.println("I'm talking.");
    }
}
