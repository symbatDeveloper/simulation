package petProject.actions;


import petProject.coordinates.Map;
import petProject.Entity;
import petProject.elements.objects.Tree;

public class TreeSpawnAction extends SpawnAction {

    public TreeSpawnAction(Map worldMap) {
        super.spawnRate = (worldMap.height * worldMap.height)/20;
    }

    @Override
    public Entity spawnEntity(final Entity emptyEntity) {
        return new Tree(emptyEntity.getX(), emptyEntity.getY());
    }
}