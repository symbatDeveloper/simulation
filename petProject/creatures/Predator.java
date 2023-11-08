package petProject.creatures;

import petProject.coordinates.Coordinates;
import petProject.coordinates.CoordinatesShift;

import java.util.Set;

public class Predator extends Creature{
    public Predator(Coordinates coordinates) {
        super(coordinates);
    }
    int stength=10;

    @Override
    public void makeMove() {

    }

    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        return null;
    }
}
