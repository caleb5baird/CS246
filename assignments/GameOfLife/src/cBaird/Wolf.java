package cBaird;

import java.awt.*;
import java.util.Random;

public class Wolf extends Creature implements Movable, Aggressor, Aware, Spawner {

    Random _rand;
    int prefferdDirection;
    boolean canSpawn;

    public Wolf() {
        _rand = new Random();
        _health = 1;
        prefferdDirection = _rand.nextInt(4);
        canSpawn = false;
    }

    public Boolean isAlive() {
        return _health > 0;
    }

    public Shape getShape() {
        return Shape.Square;
    }

    public Color getColor() {
        return new Color(128, 128, 128);
    }
    public void attack(Creature target) {
        if (target != null)
            if(target instanceof Animal) {
                target.takeDamage(5);
                if (!target.isAlive()) {
                    canSpawn = true;
                }
            }

    }

    public void move() {
        switch(prefferdDirection) {
            case 0:
                _location.y++;
                break;
            case 1:
                _location.x++;
                break;
            case 2:
                _location.y--;
                break;
            case 3:
                _location.x--;
                break;
            default:
                break;
        }
    }

    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {
       Creature[] creatures = {above,right,below,left};
       boolean done = false;
       if (creatures[prefferdDirection] == null ||
               !(creatures[prefferdDirection] instanceof Animal))
           for (int i = 0; i < 4 && !done; ++i)
               if (creatures[i] != null && creatures[i] instanceof Animal) {
                   prefferdDirection = i;
                   done = true;
               }
    }

    public Creature spawnNewCreature() {
        Creature child = null;
        if (canSpawn) {
            child = new Wolf();
            Point childPosition = new Point(_location);
            childPosition.x--;
            child.setLocation(childPosition);
            canSpawn = false;
        }
        return child;
    }
}
