package point;

public class Point implements Movable {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int x;
    private int y;

    @Override
    public void moveUp() {
        setY(this.y - 1);
    }

    @Override
    public void moveDown() {
        setY(this.y + 1);
    }

    @Override
    public void moveLeft() {
        setX(this.x - 1);
    }

    @Override
    public void moveRight() {
        setX(this.x + 1);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
