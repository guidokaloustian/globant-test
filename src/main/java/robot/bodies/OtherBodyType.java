package robot.bodies;

public class OtherBodyType implements Body{

    private BodyType bodyType;

    public OtherBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
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

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
