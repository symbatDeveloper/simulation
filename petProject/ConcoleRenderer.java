package petProject;

import petProject.coordinates.*;


public class ConcoleRenderer {

    public void reder(final Map worldMap) {
    cleanConsoleOutput();

        System.out.println("Simulation: ");

        int borderDrawingLength = worldMap.getWorld().size() / worldMap.width;
        int borderDrawingLengthOld = borderDrawingLength;
        drawBorders(borderDrawingLength);
        for (int i = 0; i < worldMap.getWorld().size(); i++) {
            System.out.print("  " + worldMap.getWorld().get(i).getType() + " ");
            if (i == borderDrawingLengthOld - 1) {
                System.out.println(" ");
                borderDrawingLengthOld += borderDrawingLength;
            }
        }
        drawBorders(borderDrawingLength);
    }

    private void drawBorders(final int borderDrawingLength) {
        System.out.print(" ");
        for (int i = 0; i < borderDrawingLength; i++) {
            System.out.print("....");
        }
        System.out.println();
    }

    public static void cleanConsoleOutput() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
}






//        private String selectUnicode (Entity entity){
//            switch (entity.getClass().getSimpleName()) {
//                case "Herbivore":
//                    return "🐥";
//                case "Predator":
//                    return "🐈";
//                case "Grass":
//                    return "🌿";
//                case "Tree":
//                    return "🌳";
//                case "Rock":
//                    return "🪨";
//            }
//            return " ";
//        }



