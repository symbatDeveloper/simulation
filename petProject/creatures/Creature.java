package petProject.creatures;

import petProject.coordinates.Coordinates;
import petProject.coordinates.CoordinatesShift;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract public class Creature extends Entity{
    public Creature(Coordinates coordinates) {
         super(coordinates);
     }
    int hp = 10;
    int speed = 1;

    public abstract void makeMove();

    public Set<Coordinates> getAvailableMove(Map map) {
        Set<Coordinates> result = new HashSet<>();

      for(CoordinatesShift shift : getPieceMoves()){

          if(coordinates.canShift(shift)){

            Coordinates newCoordinates = coordinates.shift(shift);

            if(isSqareAvailable(newCoordinates, map)){
                result.add(newCoordinates);
              }
          }
      }
return  result;
    }

    protected boolean isSqareAvailable(Coordinates coordinates, Map map) {
        return map.isEmpty();
    }

    protected abstract Set<CoordinatesShift> getPieceMoves();
    protected Set<CoordinatesShift> getPieceAttacks() {
        return getPieceMoves();
    }
 }
