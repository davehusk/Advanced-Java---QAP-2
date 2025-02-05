public class TesMyLine {
    public static void main(String[] args) {
        // Define the points (x1, y1) and (x2, y2)
        int x1 = 1, y1 = 2; // Begin point
        int x2 = 4, y2 = 6; // End point

        // Create a MyLine object
        MyLine line = new MyLine(x1, y1, x2, y2);

        // Display the initial line
        System.out.println("Initial line: " + line);

        // Calculate and display the line's length
        double length = line.getLength();
        System.out.println("Line length: " + length);

        // Calculate and display the line's gradient in radians
        double gradient = line.getGradient();
        System.out.println("Line gradient (in radians): " + gradient);

        // Get and display the coordinates of the begin and end points
        System.out.println("Begin point: " + line.getBegin());
        System.out.println("End point: " + line.getEnd());
    }
}
