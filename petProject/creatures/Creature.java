package petProject.creatures;

import petProject.coordinates.Coordinates;

abstract public class Creature extends Entity{

     public Creature(Coordinates coordinates) {
         super(coordinates);
     }
    int hp = 10;
    int speed = 1;

    public abstract void makeMove();

 }
