package petProject.coordinates;

import petProject.creatures.*;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map {
    HashMap<Coordinates, Entity> cells = new HashMap<>();
    public List<Move> moves = new ArrayList<>();



//    public getWidth();
//    public getHeight();
//
//    add(coordinates, entity);
//    remove(coordinates, entity);
//    move(coordinates, entity);
//    isEmpty(coordinates);


    public void setCells(Coordinates coordinates, Entity entity) {
        entity.coordinates = coordinates;
        cells.put(coordinates, entity);
    }

    public boolean isCellEmpty(Coordinates coordinates) {
        return !cells.containsKey(coordinates);
    }
    public void removeCreature(Coordinates coordinates) {
        cells.remove(coordinates);
    }

    // moving creatures
    public void makeMove(Move move) {
        Creature creature = (Creature) getCreature(move.from);

        removeCreature(move.from);
        setCells(move.to, creature);

        moves.add(move);
    }

    public Entity getCreature(Coordinates coordinates) {
        return cells.get(coordinates);
    }

    public void setCellsCoordinates() {
        //Herbivore
        setCells(new Coordinates(File.F, 5), new Herbivore(new Coordinates(File.F, 5)));
        setCells(new Coordinates(File.A, 1), new Herbivore(new Coordinates(File.A, 1)));
        setCells(new Coordinates(File.D, 7), new Herbivore(new Coordinates(File.D, 6)));
        setCells(new Coordinates(File.J, 9), new Herbivore(new Coordinates(File.J, 10)));
        setCells(new Coordinates(File.H, 2), new Herbivore(new Coordinates(File.H, 3)));

        //set rock
        setCells(new Coordinates(File.A, 10), new Rock(new Coordinates(File.A, 4)));
        setCells(new Coordinates(File.H, 4), new Rock(new Coordinates(File.H, 5)));
        setCells(new Coordinates(File.D, 6), new Rock(new Coordinates(File.A, 8)));
        setCells(new Coordinates(File.B, 3), new Rock(new Coordinates(File.H, 3)));
        setCells(new Coordinates(File.C, 5), new Rock(new Coordinates(File.H, 4)));
        setCells(new Coordinates(File.J, 3), new Rock(new Coordinates(File.A, 1)));
        setCells(new Coordinates(File.F, 7), new Rock(new Coordinates(File.H, 10)));


        // set knights
        setCells(new Coordinates(File.B, 2), new Predator(new Coordinates(File.B, 5)));
        setCells(new Coordinates(File.G, 4), new Predator(new Coordinates(File.G, 7)));
        setCells(new Coordinates(File.B, 7), new Predator(new Coordinates(File.B, 10)));
        setCells(new Coordinates(File.G, 10), new Predator(new Coordinates(File.G, 2)));

        // set grass
        setCells(new Coordinates(File.B, 1), new Grass(new Coordinates(File.C, 1)));
        setCells(new Coordinates(File.F, 2), new Grass(new Coordinates(File.F, 1)));
        setCells(new Coordinates(File.G, 3), new Grass(new Coordinates(File.C, 8)));
        setCells(new Coordinates(File.H, 4), new Grass(new Coordinates(File.F, 8)));
        setCells(new Coordinates(File.A, 5), new Grass(new Coordinates(File.C, 1)));
        setCells(new Coordinates(File.D, 6), new Grass(new Coordinates(File.F, 1)));
        setCells(new Coordinates(File.E, 7), new Grass(new Coordinates(File.C, 9)));
        setCells(new Coordinates(File.C, 8), new Grass(new Coordinates(File.F, 8)));
        setCells(new Coordinates(File.J, 10), new Grass(new Coordinates(File.F, 8)));

        // set  tree
        setCells(new Coordinates(File.A, 10), new Tree(new Coordinates(File.C, 1)));
        setCells(new Coordinates(File.I, 8), new Tree(new Coordinates(File.F, 9)));
        setCells(new Coordinates(File.J, 6), new Tree(new Coordinates(File.C, 7)));
        setCells(new Coordinates(File.D, 5), new Tree(new Coordinates(File.F, 10)));
        setCells(new Coordinates(File.F, 4), new Tree(new Coordinates(File.C, 10)));
        setCells(new Coordinates(File.G, 2), new Tree(new Coordinates(File.F, 3)));


    }



}
