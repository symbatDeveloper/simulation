package petProject.coordinates;
import petProject.Entity;

import java.util.ArrayList;
import java.util.List;

public class Map {

    public int width;
    public int height;

    private final List<Entity> world = new ArrayList<>();

    public List<Entity> getWorld() {
        return world;
    }

    public Map(final int width, final int height) {
        this.width = width;
        this.height = height;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                world.add(new Entity(i, j));
            }
        }
    }

    public void setEntity(final Entity entity) {
        int index = entity.getX() * height + entity.getY();
        world.set(index, entity);
    }

    public Entity getEntity(int index) {
        return world.get(index);
    }

    public boolean isEmpty(int index) {
        return world.get(index).getType().equals(" ");
    }
}
