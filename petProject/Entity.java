package petProject;

public class Entity {

    private int x;
    private int y;
    protected String type;

    public Entity(final int x, final int y) {
        this.x = x;
        this.y = y;
        type = " ";
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }

    public String getType() {
        return type;
    }
}
