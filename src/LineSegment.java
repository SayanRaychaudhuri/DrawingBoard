public class LineSegment extends Drawable {
    private int h, w, col, x1, x2, y1, y2, xcoor, ycoor;

    public LineSegment(int x1, int y1, int x2, int y2, int color) {
        super(Math.abs(y2-y1), Math.abs(x2-x1), x1+Math.abs(x2-x1)/2, y2-Math.abs(y2 - y1)/2);
        h = Math.abs(y2 - y1);
        w = Math.abs(x2 - x1);
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

}