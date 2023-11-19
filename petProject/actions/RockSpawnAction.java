package petProject.actions;

import petProject.coordinates.Map;
import petProject.Entity;
import petProject.elements.objects.Rock;

public class RockSpawnAction extends SpawnAction {

    public RockSpawnAction(Map worldMap) {
        super.spawnRate = (worldMap.height * worldMap.height)/10;
    }

    @Override
    public Entity spawnEntity(final Entity emptyEntity) {
        return new Rock(emptyEntity.getX(), emptyEntity.getY());
    }


}
