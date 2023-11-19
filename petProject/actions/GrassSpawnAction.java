package petProject.actions;


import petProject.Entity;
import petProject.coordinates.Map;
import petProject.elements.objects.Grass;


public class GrassSpawnAction extends SpawnAction {

    public GrassSpawnAction(Map world) {
        super.spawnRate = (world.height * world.height) / 20;
    }

    @Override
    public void perform(final Map worldMap) {

        int count = 0;
        for (int i = 0; i < worldMap.getWorld().size(); i++) {
            if (worldMap.getEntity(i) instanceof Grass) {
                count++;
            }
        }
        if (count < super.spawnRate / 10) {
            while (count < spawnRate) {
                Entity emptyEntity = getRandomEmptyCell(worldMap);
                Entity newEntityOnMap = spawnEntity(emptyEntity);
                worldMap.setEntity(newEntityOnMap);
                count++;
            }
        }
    }

    @Override
    public Entity spawnEntity(Entity emptyEntity) {
         return new Grass(emptyEntity.getX(), emptyEntity.getY());
    }


}
