public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int manhattanDistance(Point other) {
        return Math.abs(this.x - other.getX()) + Math.abs(this.y - other.getY());
    }
    public boolean isCollinear(Point p1, Point p2) {
        if (this.x == p1.getX() && this.x == p2.getX()) {
            return true;
        }
        
        // Check for slope equality within a tolerance
        double slope1 = (double) (p1.getY() - this.y) / (p1.getX() - this.x);
        double slope2 = (double) (p2.getY() - this.y) / (p2.getX() - this.x);
        
        return Math.abs(slope1 - slope2) < 0.01;
    }



}
