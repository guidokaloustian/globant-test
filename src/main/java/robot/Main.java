package robot;

import robot.bodies.*;
import robot.characters.Robot;

public class Main {
    public static void main(String[] args) {
        //Un Robot puede comenzar con cuerpo doméstico y luego cambiarse el cuerpo a un cuerpo de combate acuático.
        DomesticBody domesticBody1 = new DomesticBody();
        Robot robot1 = new Robot("Pablo", domesticBody1);
        robot1.changeBody(new CombatBody(FighterType.WATER));
        //Un Robot con cuerpo de combate aéreo.
        robot1.changeBody(new CombatBody(FighterType.AIR));
        //Un Robot con cuerpo de animal.
        robot1.changeBody(new OtherBodyType(BodyType.ANIMAL));

        //Recordar que todos los robot tiene algunas tareas en común.
        robot1.move();
        robot1.talk();
        robot1.grab();
    }
}
