
public class PointDemo {
    public static void main(String[] args) {
        // creating instances of "Point" class
        Point Point1 = new Point();
        Point1.setPoint(4, 7);

        Point Point2 = new Point();
        Point2.setPoint(3, 6);

        // calling "findDistance" method and printing its value
        System.out.println(Point.findDistance(Point2, Point1));
    }
}

// "Point" class
class Point {
    private int x, y;

    // method to set values to "Point" object
    void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // method to find distance between 2 given points
    static double findDistance(Point firstPoint, Point secondPoint) {
        // applying formula < distance = √((x_2-x_1)²+(y_2-y_1)²) >
        double distance = Math.sqrt(Math.pow(secondPoint.x - firstPoint.x, 2)
                + Math.pow(secondPoint.y - firstPoint.y, 2));
        return distance;
    }
}
