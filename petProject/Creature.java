package petProject;



import petProject.coordinates.Map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class Creature extends Entity {

    protected int speed;

    protected int hp;

    private boolean alreadyMove;

    public Creature(final int x, final int y) {
        super(x, y);
        alreadyMove = false;
    }

    public boolean isAlreadyMove() {
        return alreadyMove;
    }

    public void setAlreadyMove(final boolean alreadyMove) {
        this.alreadyMove = alreadyMove;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(final int hp) {
        this.hp = hp;
    }

    protected abstract boolean checkIfTarget(Entity entity);

    public ArrayList<Integer> findPathToObject(Map worldMap) {
        ArrayList<Integer> path = new ArrayList<>();
        Queue<ArrayList<Integer>> queueEntity = new LinkedList<>();
        List<Integer> isVisited = new ArrayList<>();

        int index = super.getX() * worldMap.height + super.getY();
        path.add(index);
        queueEntity.add(path);

        while (!queueEntity.isEmpty()) {
            ArrayList<Integer> currentPath = queueEntity.remove();
            int lastIndexOfCurrentPath = currentPath.get(currentPath.size() - 1);

            Entity TargetObject = worldMap.getEntity(lastIndexOfCurrentPath);

            if (checkIfTarget(TargetObject)) {
                return currentPath;
            } else {
                int row = lastIndexOfCurrentPath / worldMap.height;
                int col = lastIndexOfCurrentPath % worldMap.height;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int currentIndex = (row + i) * worldMap.height + (col + j);
                        if ((currentIndex >= 0 && currentIndex < worldMap.height * worldMap.width) &&
                                (col + j >= 0 && col + j < worldMap.width)) {
                            if (!isVisited.contains(currentIndex)) {
                                if (!notAllowedEntitiesToPass(worldMap.getEntity(currentIndex))) {
                                    ArrayList<Integer> newPath = new ArrayList<>(currentPath);
                                    newPath.add(currentIndex);
                                    queueEntity.add(newPath);
                                    isVisited.add(currentIndex);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public void makeMove(Map worldMap) {

        List<Integer> pathToObject = findPathToObject(worldMap);
        if (findPathToObject(worldMap) != null) {
            if (pathToObject.size() > 1) {
                int currentIndex = pathToObject.remove(0);
                int x = worldMap.getEntity(currentIndex).getX();
                int y = worldMap.getEntity(currentIndex).getY();
                Entity changeEntityTo = new Entity(x, y);
                worldMap.setEntity(changeEntityTo);
                x = worldMap.getEntity(currentIndex).getX();
                y = worldMap.getEntity(currentIndex).getY();
                this.setX(x);
                this.setY(y);
                worldMap.setEntity(this);
            }
        }
    }

    public abstract boolean notAllowedEntitiesToPass(Entity entity);
}

