package petProject.elements.creatures;


import petProject.Creature;
import petProject.Entity;
import petProject.elements.objects.Grass;
import petProject.elements.objects.Rock;
import petProject.elements.objects.Tree;

public class Predator extends Creature {

    final int attackPower;

    public Predator(final int x, final int y) {
        super(x, y);
        super.speed = 1;
        super.hp = 100;
        super.type = "🐈";
        attackPower = 15;
    }


    @Override
    public boolean notAllowedEntitiesToPass(Entity entity) {
        if (entity instanceof Grass ||
                entity instanceof Rock ||
                entity instanceof Tree ||
                entity instanceof Predator) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected boolean checkIfTarget(final Entity entity) {
        return entity instanceof Hervibore;
    }
}
