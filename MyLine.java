public class MyLine {
    private MyPoint begin; // starting point
    private MyPoint end; // ending point

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1); // initialize begin point
        this.end = new MyPoint(x2, y2); // initialize end point
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin; // assign begin
        this.end = end; // assign end
    }

    public MyPoint getBegin() {
        return begin; // return begin point
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin; // update begin point
    }

    public MyPoint getEnd() {
        return end; // return end point
    }

    public void setEnd(MyPoint end) {
        this.end = end; // update end point
    }

    public int getBeginX() {
        return begin.getX(); // return x of begin
    }

    public void setBeginX(int x) {
        begin.setX(x); // update x of begin
    }

    public int getBeginY() {
        return begin.getY(); // return y of begin
    }

    public void setBeginY(int y) {
        begin.setY(y); // update y of begin
    }

    public int getEndX() {
        return end.getX(); // return x of end
    }

    public void setEndX(int x) {
        end.setX(x); // update x of end
    }

    public int getEndY() {
        return end.getY(); // return y of end
    }

    public void setEndY(int y) {
        end.setY(y); // update y of end
    }

    public int[] getBeginXY() {
        return new int[]{begin.getX(), begin.getY()}; // return begin coordinates
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y); // update begin coordinates
    }

    public int[] getEndXY() {
        return new int[]{end.getX(), end.getY()}; // return end coordinates
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y); // update end coordinates
    }

    public double getLength() {
        return begin.distance(end); // calculate and return line length
    }

    public double getGradient() {
        int xDiff = end.getX() - begin.getX(); // calculate x difference
        int yDiff = end.getY() - begin.getY(); // calculate y difference
        return Math.atan2(yDiff, xDiff); // calculate and return gradient in radians
    }

    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ",end=" + end + "]"; // represent line
    }
}
