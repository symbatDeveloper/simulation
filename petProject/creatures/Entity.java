package petProject.creatures;

import petProject.coordinates.Coordinates;

abstract public class Entity {
    public Coordinates coordinates;

    public Entity(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
