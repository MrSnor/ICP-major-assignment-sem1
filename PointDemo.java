
public class PointDemo {
    public static void main(String[] args) {
        Point Point1 = new Point();
        Point1.setPoint(4, 7);

        Point Point2 = new Point();
        Point2.setPoint(3, 6);

        System.out.println(Point.findDistance(Point2, Point1));
    }
}

class Point {
    private int x, y;

    void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static double findDistance(Point firstPoint, Point secondPoint) {
        double distance = Math.sqrt(Math.pow(secondPoint.x - firstPoint.x, 2)
                + Math.pow(secondPoint.y - firstPoint.y, 2));
        return distance;
    }
}
