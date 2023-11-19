package petProject;
import petProject.coordinates.*;

import static petProject.coordinates.InputCoordinates.input;
import static petProject.coordinates.InputCoordinates.inputCoordinates;


public class Main {
    public static void main(String[] args) {
    Map map = new Map();
    int a=123;
    map.setCellsCoordinates();

    ConcoleRenderer renderer = new ConcoleRenderer();
    renderer.render(map);

        Coordinates coordinates = input();
        System.out.println("coordinates: "+ coordinates);

        Coordinates coordinates1= inputCoordinates(map);
        System.out.println(coordinates1);
    }
}
