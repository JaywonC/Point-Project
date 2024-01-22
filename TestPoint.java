public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(-5, 7);
        Point p4 = new Point(3, -10);
        Point p5 = new Point(3, 10);
        Point p6 = new Point(6, 8);
        System.out.println("p1: " + "x=" + p1.getX() + ", " + "y=" +p1.getY());
        System.out.println("p2: " + "x=" + p2.getX() + ", " + "y=" +p2.getY());
        System.out.println("p3: " + "x=" + p3.getX() + ", " + "y=" +p3.getY());
        System.out.println("p4: " + "x=" + p4.getX() + ", " + "y=" +p4.getY());
        System.out.println("p4: " + "x=" + p5.getX() + ", " + "y=" +p5.getY());
        System.out.println("p4: " + "x=" + p6.getX() + ", " + "y=" +p6.getY());
        System.out.println("The points:");
        // Testing manhattanDistance
        System.out.println("Testing manhattanDistance:");
        System.out.println("p2 to p3: " + p2.manhattanDistance(p3));
        System.out.println("p3 to p4: " + p3.manhattanDistance(p4));

        // Testing isCollinear
        System.out.println("\nTesting isCollinear:");
        System.out.println("p2, p4, p5: " + p2.isCollinear(p4, p5));
        System.out.println("p2, p3, p4: " + p2.isCollinear(p3, p4));
        System.out.println("p1, p2, p6: " + p1.isCollinear(p2, p6));
        System.out.println("p1, p2, p3: " + p1.isCollinear(p2, p3));
    }
}
