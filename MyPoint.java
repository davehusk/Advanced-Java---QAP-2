public class MyPoint {
    private int x; // x-coordinate
    private int y; // y-coordinate

    public MyPoint(int x, int y) {
        this.x = x; // set x
        this.y = y; // set y
    }

    public int getX() {
        return x; // return x
    }

    public void setX(int x) {
        this.x = x; // set x
    }

    public int getY() {
        return y; // return y
    }

    public void setY(int y) {
        this.y = y; // set y
    }

    public void setXY(int x, int y) {
        this.x = x; // set x
        this.y = y; // set y
    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.x; // calculate x difference
        int yDiff = this.y - another.y; // calculate y difference
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff); // calculate distance
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")"; // represent point as (x, y)
    }
}
