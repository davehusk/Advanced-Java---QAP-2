public class TestMyRectangle {
      public static void main(String[] args) {

            // Test the MyRectangle class
            MyRectangle rect1 = new MyRectangle(new MyPoint(1, 5), new MyPoint(4, 1));
            System.out.println("Rectangle 1: " + rect1);
            System.out.println("Width: " + rect1.getWidth());
            System.out.println("Height: " + rect1.getHeight());
            System.out.println("Area: " + rect1.getArea());
            System.out.println("Perimeter: " + rect1.getPerimeter());
      }
}
