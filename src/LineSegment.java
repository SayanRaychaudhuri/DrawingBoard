public class LineSegment extends Shape {
    private int h;
    private int w;
    private boolean in;
    private int col;
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int xcor;
    private int ycor;

    public LineSegment(int x1, int y1, int x2, int y2, Drawing draw, int color) {
        h = Math.abs(y2 - y1);
        w = Math.abs(x2 - x1);
        in = true;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        col = color;
        xcor = x1 + (w / 2);
        ycor = y2 - (h / 2);
    }

    @Override
    public void drawOn(DrawingBoard db) {

        for (int j = x1; j <= x2; j++) {
            int i = yOnLine(j, x1, y1, x2, y2);

            db.getImageArray()[i][j] = col;

        }


    }

    /**
     * Finds the x coordinate of a point on a line given the y coordinate.
     *
     * @param y  y coordinate of the point
     * @param x1
     * @param y1 (x1, y1) is one point on the line
     * @param x2
     * @param y2 (x2, y2) is another point on the line
     * @return
     */


    public static int yOnLine(int x, int x1, int y1, int x2, int y2) {
        if (y2 == y1)    // horizontal line, slope == 0
            return x1;    // actually all x values lie on the line

        double m = ((double) (y2 - y1)) / (x2 - x1);    // slope

        int y = (int) (y1 + m * (x - x1) + 0.5);
        return y;
    }

    @Override
    public boolean within(DrawingBoard db) {
        if ((xcor - h / 2) < 0 || xcor + h / 2 > db.getWidth() || ycor - w / 2 < 0 || ycor + w / 2 > db.getHeight()) {
            in = false;

        }
        return in;
    }

    @Override
    public int getX(Shape shape) {
        return xcor;
    }

    public int getY(Shape shape) {
        return ycor;
    }

    @Override
    public String[] getBoundingBox(Shape sh) {

        String[] bounds = {Integer.toString(ycor - w / 2), Integer.toString(xcor - h / 2), Integer.toString(ycor + w / 2), Integer.toString(xcor + h / 2)};

        return bounds;
    }

    @Override
    public int getHeight(Shape shape) {
        return h;
    }

    @Override
    public int getWidth(Shape shape) {
        return w;
    }
}