public class Line2D {
    private Point p1;
    private Point p2;
    public Line2D (Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
        
    }
    public Line2D(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return "position is (" + p1.getX() + "," + p1.getY() + "), (" + p2.getX() + "," + p2.getY() + "))";
    }

    public double getSlope() {
        if (p1.getX() == p2.getX()) {
            System.out.println("illegal");
        }
        return (double) (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }
    public boolean isCollinear(Point p) {
        double TOLERANCE = 0.01;
        // Check for slope equality within a tolerance
        double slope1 = getSlope();
        double slope2 = (double) (p2.getY() - p.getY()) / (p2.getX() - p.getX());

    return Math.abs(slope1 - slope2) < TOLERANCE;

    }
}
