package petProject.elements.creatures;


import petProject.Creature;
import petProject.Entity;
import petProject.elements.objects.Grass;
import petProject.elements.objects.Rock;
import petProject.elements.objects.Tree;

public class Hervibore extends Creature {

    public Hervibore(final int x, final int y) {
        super(x, y);
        super.speed = 2;
        super.hp = 50;
        super.type = "🐥";
    }

    @Override
    public boolean notAllowedEntitiesToPass(Entity entity) {
        if (entity instanceof Hervibore ||
                entity instanceof Rock ||
                entity instanceof Tree ||
                entity instanceof Predator) {
            return true;
        }
            return false;

    }

    protected boolean checkIfTarget(final Entity entity) {
        return entity instanceof Grass;
    }
}