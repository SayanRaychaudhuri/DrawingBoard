public class LineSegment extends Shape {
    private int h;
    private int w;
    private boolean in;
    private int col;
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int xcoor;
    private int ycoor;

    public LineSegment(int x1, int y1, int x2, int y2, int color) {
        h = Math.abs(y2 - y1);
        w = Math.abs(x2 - x1);
        in = true;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        col = color;
        xcoor = x1 + (w / 2);
        ycoor = y2 - (h / 2);
    }

    @Override
    public void drawOn(DrawingBoard db) {

        for (int j = x1; j <= x2; j++) {
            int i = yOnLine(j, x1, y1, x2, y2);

            db.getImageArray()[i][j] = col;

        }

    }

    public static int yOnLine(int x, int x1, int y1, int x2, int y2) {
        if (y2 == y1)    // horizontal line, slope == 0
            return x1;    // actually all x values lie on the line

        double m = ((double) (y2 - y1)) / (x2 - x1);    // slope

        int y = (int) (y1 + m * (x - x1));
        return y;
    }

    @Override
    public boolean within(DrawingBoard db) {
        if ((xcoor - h / 2) < 0 || xcoor + h / 2 > db.getWidth() || ycoor - w / 2 < 0 || ycoor + w / 2 > db.getHeight()) {
            in = false;

        }
        return in;
    }

    @Override
    public int getX() {
        return xcoor;
    }

    public int getY() {
        return ycoor;
    }

    @Override
    public String[] getBoundingBox() {

        return new String[]{Integer.toString(ycoor - w / 2), Integer.toString(xcoor - h / 2), Integer.toString(ycoor + w / 2), Integer.toString(xcoor + h / 2)};
    }

    @Override
    public int getHeight() {
        return h;
    }

    @Override
    public int getWidth() {
        return w;
    }
}