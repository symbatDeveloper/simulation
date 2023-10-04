package petProject.coordinates;

import petProject.creatures.Entity;
import petProject.creatures.Herbivore;

import java.util.HashMap;

public class Map {
    HashMap<Coordinates, Entity> cells = new HashMap<>();


//    public getWidth();
//    public getHeight();
//
//    add(coordinates, entity);
//    remove(coordinates, entity);
//    move(coordinates, entity);
//    isEmpty(coordinates);


    public void setCells(Coordinates coordinates, Entity entity){
        entity.coordinates= coordinates;
        cells.put(coordinates , entity);
    }
public void setCellsCoordinates(){
        for(File file : File.values()){
    setCells(new Coordinates(file, 6), new Herbivore(new Coordinates(file, 6)));
        }
}

}
