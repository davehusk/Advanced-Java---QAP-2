public class MyRectangle {
      // Instance variables for the top-left and bottom-right points of the rectangle
      private MyPoint topLeft;
      private MyPoint bottomRight;

      // Constructor that takes two MyPoint objects
      public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
      }

      // Constructor that takes four integers to create the top-left and bottom-right points
      public MyRectangle(int x1, int y1, int x2, int y2) {
            this.topLeft = new MyPoint(x1, y1);
            this.bottomRight = new MyPoint(x2, y2);
      }

      // Getter for the top-left point
      public MyPoint getTopLeft() {
            return topLeft;
      }

      // Setter for the top-left point
      public void setTopLeft(MyPoint topLeft) {
            this.topLeft = topLeft;
      }

      // Getter for the bottom-right point
      public MyPoint getBottomRight() {
            return bottomRight;
      }

      // Setter for the bottom-right point
      public void setBottomRight(MyPoint bottomRight) {
            this.bottomRight = bottomRight;
      }

      // Method to calculate the width of the rectangle
      public int getWidth() {
            return Math.abs(bottomRight.getX() - topLeft.getX());
      }

      // Method to calculate the height of the rectangle
      public int getHeight() {
            return Math.abs(topLeft.getY() - bottomRight.getY());
      }

      // Method to calculate the area of the rectangle
      public int getArea() {
            return getWidth() * getHeight();
      }

      // Method to calculate the perimeter of the rectangle
      public int getPerimeter() {
            return 2 * (getWidth() + getHeight());
      }

      // Override the toString method to provide a string representation of the rectangle
      @Override
      public String toString() {
            return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight +
                     ", width=" + getWidth() + ", height=" + getHeight() + "]";
      }
}
