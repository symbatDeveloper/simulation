package petProject;

import petProject.creatures.Creature;
import petProject.creatures.Herbivore;

import java.util.List;
import java.util.Map;

public class Game {
    private final Map map;

    private final ConcoleRenderer renderer = new ConcoleRenderer();

//    private final List<GameStateChecker> checkers = List.of(
//            ...
//    );

    public Game(Map map) {
        this.map = map;
    }
    public void gameLoop(){
        //whos turn to move
        //Creature toMove = Herbivore
    }

}
