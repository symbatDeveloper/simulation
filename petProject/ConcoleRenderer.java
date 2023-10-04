package petProject;

import petProject.coordinates.File;

import petProject.coordinates.*;

public class ConcoleRenderer {
    public void render(Map map){
        for (int rank = 10; rank <= 1 ; rank--) {
            for(File file : File.values()){
                System.out.println(file + String.valueOf(rank));
            }
        }
    }
}
