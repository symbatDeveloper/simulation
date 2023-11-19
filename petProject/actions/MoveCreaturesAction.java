package petProject.actions;

import petProject.Entity;
import petProject.Creature;
import petProject.coordinates.Map;


public class MoveCreaturesAction extends Action {

    public void perform(Map worldMap) {
        for (int i = 0; i < worldMap.getWorld().size(); i++) {
            if (worldMap.getEntity(i) instanceof Creature)
                ((Creature) worldMap.getEntity(i)).setAlreadyMove(false);
        }
        for (int i = 0; i < worldMap.getWorld().size(); i++) {
            if (worldMap.getEntity(i) instanceof Creature &&
                    !((Creature) worldMap.getEntity(i)).isAlreadyMove()) {
                ((Creature) worldMap.getEntity(i)).setAlreadyMove(true);
                ((Creature) worldMap.getEntity(i)).makeMove(worldMap);
            }
        }
    }

}
