package petProject;

import petProject.coordinates.File;

import petProject.coordinates.*;
import petProject.creatures.Creature;
import petProject.creatures.Entity;

import javax.swing.*;

public class ConcoleRenderer {

    public void render(Map map) {
        for (int rank = 10; rank >= 1; rank--) {
            String line = "";
            for (File file : File.values()) {
                Coordinates coordinates = new Coordinates(file, rank);
                if (map.isCellEmpty(coordinates)) {
                    line += getSpriteForEmpltyCell(coordinates);
                } else {
                    line += getSpriteForCreature(map.getCreature(coordinates));
                }
            }

            System.out.println(line);
        }
    }
        public String colorize (String sprite){
            String result = sprite;
            return sprite;
        }


        private String getSpriteForEmpltyCell (Coordinates coordinates){
            return colorize("  ");
        }


        private String selectUnicode (Entity entity){
            switch (entity.getClass().getSimpleName()) {
                case "Herbivore":
                    return "🐥";
                case "Predator":
                    return "🐈";
                case "Grass":
                    return "🌿";
                case "Tree":
                    return "🌳";
                case "Rock":
                    return "🪨";
            }
            return " ";
        }

private String getSpriteForCreature(Entity entity){
        return colorize( selectUnicode(entity));
}

}
