package petProject;

import petProject.coordinates.*;

public class Simulation {
  private final Map map;

  private final ConcoleRenderer renderer = new ConcoleRenderer();

  //private InputCoordinates inputCoordinates = new InputCoordinates();

  public Simulation(petProject.coordinates.Map map) {
    this.map = map;
  }

  public void simulation() {
    while (true){
      renderer.render(map);
      InputCoordinates.inputCoordinates(map);

    }
  }
  }

