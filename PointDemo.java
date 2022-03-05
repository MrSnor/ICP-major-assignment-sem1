
public class PointDemo {
    public static void main(String[] args) {
        // creating instances of "Point" class
        Point p1 = new Point();
        p1.setPoint(4, 7);

        Point p2 = new Point();
        p2.setPoint(3, 6);

        // calling "showPoint" method
        System.out.println("For p1 : " + p1.showPoint());
        System.out.println("For p2 : " + p2.showPoint());

        // calling "findDistance" method and printing its value
        System.out.println("Distance between the two points is "+Point.findDistance(p2, p1));
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

    // method to display values of a "Point"
    String showPoint() {
        return String.format("x coordinate is %d & y coordinate is %d",
                x, y);
    }

    // method to find distance between 2 given points
    static double findDistance(Point firstPoint, Point secondPoint) {
        // applying formula < distance = √((x_2-x_1)²+(y_2-y_1)²) >
        double distance = Math.sqrt(Math.pow(secondPoint.x - firstPoint.x, 2)
                + Math.pow(secondPoint.y - firstPoint.y, 2));
        return distance;
    }
}
