package cBaird;

import java.awt.*;

public class Zombie extends Creature implements Movable, Aggressor {

    public Zombie() {
        _health = 1;
    }

    public Boolean isAlive() {
        return _health > 0;
    }

    public Shape getShape() {
        return Shape.Square;
    }

    public Color getColor() {
        return new Color(20, 80, 135);
    }
    public void attack(Creature target) {
        if (target != null)
            if(!(target instanceof Plant)) {
                target.takeDamage(10);
            }

    }

    public void move() {
        _location.x++;
    }
}
