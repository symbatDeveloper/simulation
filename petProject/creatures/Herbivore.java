package petProject.creatures;

import petProject.coordinates.Coordinates;
import petProject.coordinates.CoordinatesShift;

import java.util.Set;

public class Herbivore extends Creature{
    public Herbivore(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public void makeMove() {

    }

    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        return null;
    }
}
