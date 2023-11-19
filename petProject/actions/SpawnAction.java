package petProject.actions;


import petProject.Entity;
import petProject.coordinates.Map;
import java.util.Random;

public abstract class SpawnAction extends Action {

    protected int spawnRate;

    public void perform(final Map world) {

        int rate = 0;
        while (rate < spawnRate) {
            Entity emptyEntity = getRandomEmptyCell(world);
            Entity newEntityOnMap = spawnEntity(emptyEntity);
            world.setEntity(newEntityOnMap);
            rate++;
        }
    }

    public Entity getRandomEmptyCell(final Map worldMap) {
        while (true) {
            int x = new Random().nextInt(worldMap.width - 1);
            int y = new Random().nextInt(worldMap.height - 1);
            int index = x * worldMap.height + y;
            if (worldMap.isEmpty(index)) {
                return new Entity(x, y);
            }
        }
    }

    public abstract Entity spawnEntity(final Entity emptyEntity);
}



