package petProject;

import petProject.actions.*;
import petProject.coordinates.*;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

    private final Map worldMap;

    private final ConcoleRenderer renderer;

    private final List<Action> initActions;

    private final List<Action> turnActions;

    private boolean isOver;

    private int countMoves;

    public Simulation(final Map worldMap,
                      final ConcoleRenderer renderer) {
      this.worldMap = worldMap;
      this.renderer = renderer;
      this.initActions = new ArrayList<>();
      this.turnActions = new ArrayList<>();
    }

    public void play() throws InterruptedException {
      createActions ();
      for (final Action action : initActions) {
        action.perform(worldMap);
      }
      while (!isOver) {
        nextTurn();
        Thread.sleep(300);
      }
      System.out.println("Game is Over. you made " + countMoves + " moves");
    }

    public void nextTurn() {
      List<Entity> before = new ArrayList<>(worldMap.getWorld());
      for (final Action action : turnActions) {
        action.perform(worldMap);
      }
      List<Entity> after = new ArrayList<>(worldMap.getWorld());
      if (before.equals(after)) {
        this.isOver = true;
      } else {
         renderer.reder(worldMap);
        countMoves++;
      }
    }

    public void createActions () {
      initActions.add(new RockSpawnAction(worldMap));
      initActions.add(new GrassSpawnAction(worldMap));
      initActions.add(new TreeSpawnAction(worldMap));
      initActions.add(new HerviboreSpawnAction(worldMap));
      initActions.add(new PredatorSpawnAction(worldMap));
      turnActions.add(new MoveCreaturesAction());
      turnActions.add(new GrassSpawnAction(worldMap));
      turnActions.add(new HerviboreSpawnAction(worldMap));
    }
  }




