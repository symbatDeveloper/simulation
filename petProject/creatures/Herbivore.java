package petProject.creatures;

import petProject.coordinates.Coordinates;
import petProject.coordinates.CoordinatesShift;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Creature {
    public Herbivore(Coordinates coordinates) {
        super(coordinates);
    }

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
    protected boolean checkIfTarget(Entity entity) {
        return false;
    }
}

//    public boolean notAllowedEntitiesToPass(Entity entity) {
//        if (entity instanceof Herbivore ||
//                entity instanceof Rock ||
//                entity instanceof Tree ||
//                entity instanceof Predator) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    protected boolean checkIfTarget(final Entity entity) {
//        return entity instanceof Grass;
//    }

