package petProject;
import petProject.coordinates.*;


public class Main {
    public static void main(String[] args) {
    Map map = new Map();
    int a=23;
    map.setCellsCoordinates();

    ConcoleRenderer renderer = new ConcoleRenderer();
    renderer.render(map);
    }
}
