package robot.characters;

public abstract class Character {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                '}';
    }
}
