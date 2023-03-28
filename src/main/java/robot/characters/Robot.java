package robot.characters;

import robot.bodies.Body;

public class Robot extends Character {
    private Body body;

    public Robot(String name, Body body) {
        super(name);
        this.body = body;
    }

    public void changeBody(Body body) {
        this.body = body;
    }

    public Body getBody() {
        return body;
    }

    public void move() {
        body.move();
    }

    public void grab() {
        body.grab();
    }

    public void talk() {
        body.talk();
    }


}
