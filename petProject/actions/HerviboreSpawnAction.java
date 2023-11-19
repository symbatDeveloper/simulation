package petProject.actions;

import petProject.Entity;
import petProject.coordinates.Map;
import petProject.elements.creatures.Hervibore;

public class HerviboreSpawnAction extends SpawnAction {

    public HerviboreSpawnAction(Map worldMap) {
        super.spawnRate = (worldMap.height * worldMap.height) / 30;
    }

    @Override
    public void perform(final Map worldMap) {

        int count = 0;
        for (int i = 0; i < worldMap.getWorld().size(); i++) {
            if (worldMap.getEntity(i) instanceof Hervibore) {
                count++;
            }
        }
        if (count < super.spawnRate / 5) {
            while (count < spawnRate) {
                Entity emptyEntity = getRandomEmptyCell(worldMap);
                Entity newEntityOnMap = spawnEntity(emptyEntity);
                worldMap.setEntity(newEntityOnMap);
                count++;
            }
        }
    }

    @Override
    public Entity spawnEntity(final Entity emptyEntity) {
        return new Hervibore(emptyEntity.getX(), emptyEntity.getY());
    }
}