package robot.bodies;

public class DomesticBody implements Body {

    public void clean() {
        System.out.println("I can clean.");
    }

    public void sweep() {
        System.out.println("I can sweep.");
    }

    @Override
    public void move() {
        System.out.println("I can move.");
    }

    @Override
    public void grab() {
        System.out.println("I'm grabing this");
    }

    @Override
    public void talk() {
        System.out.println("I'm talking");
    }
}
