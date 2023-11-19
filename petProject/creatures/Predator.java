package petProject.creatures;

import petProject.coordinates.Coordinates;
import petProject.coordinates.CoordinatesShift;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Predator extends Creature{
    public Predator(Coordinates coordinates) {
        super(coordinates);
    }
    int stength=10;

    @Override
    public Set<CoordinatesShift> makeMove() {
        return new HashSet<>(Arrays.asList(
                new CoordinatesShift(1, 2),
                new CoordinatesShift(2, 1),

                new CoordinatesShift(2, -1),
                new CoordinatesShift(1, -2),

                new CoordinatesShift(-2, -1),
                new CoordinatesShift(-1, -2),

                new CoordinatesShift(-2, 1),
                new CoordinatesShift(-1, 2)));
    }
    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
       return new HashSet<>(Arrays.asList(
                new CoordinatesShift(1, 2),
                new CoordinatesShift(2, 1),

                new CoordinatesShift(2, -1),
                new CoordinatesShift(1, -2),

                new CoordinatesShift(-2, -1),
                new CoordinatesShift(-1, -2),

                new CoordinatesShift(-2, 1),
                new CoordinatesShift(-1, 2)
        ));
    }


    @Override
    protected boolean checkIfTarget(final Entity entity) {
        return entity instanceof Herbivore;
    }
}
