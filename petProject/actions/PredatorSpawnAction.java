package petProject.actions;

import petProject.coordinates.Map;
import petProject.Entity;
import petProject.elements.creatures.Predator;


public class PredatorSpawnAction extends SpawnAction {

    public PredatorSpawnAction(Map worldMap) {
        super.spawnRate = (worldMap.height * worldMap.height) / 60;
    }

    @Override
    public Entity spawnEntity(final Entity emptyEntity) {
        return new Predator(emptyEntity.getX(), emptyEntity.getY());
    }
}
