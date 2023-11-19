package petProject;
import petProject.coordinates.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Simulation simulation = new Simulation(
                new Map(12, 12),
                new ConcoleRenderer());
        simulation.play();

    }
}
