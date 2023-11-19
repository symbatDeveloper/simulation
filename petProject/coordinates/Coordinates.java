package petProject.coordinates;

import petProject.creatures.Creature;
import petProject.creatures.Entity;

import java.util.Objects;

public class Coordinates {
    public final File file;
    public final Integer rank;

    public Coordinates(File file, Integer rank) {
        this.file = file;
        this.rank = rank;
        for (int i = 0; i < file.ordinal(); i++) {
            for (int j = 0; j < rank; j++) {
                Coordinates c = new Coordinates(i,j);
            }
        }
    }



    public Coordinates shift(CoordinatesShift shift) {
        return new Coordinates(File.values()[this.file.ordinal() + shift.fileShift], this.rank + shift.rankShift);
    }



    public boolean canShift(CoordinatesShift shift) {
        int f = file.ordinal() + shift.fileShift;
        int r = rank + shift.rankShift;

        if ((f < 0) || (f > 9)) return false;
        if ((r < 1) || (r > 10)) return false;

        return true;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinates that)) return false;
        return file == that.file && Objects.equals(rank, that.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, rank);
    }
}
