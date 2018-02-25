public class Ellipse extends Drawable {
    private int a, b, c, xcoor, ycoor, f1Xcoor, f2Xcoor, col;

    public Ellipse(int x, int y, int horizontalAxis, int verticalAxis, int color) {
        super(2 * verticalAxis, 2 * horizontalAxis, x, y);
        xcoor = x;
        ycoor = y;
        a = horizontalAxis;
        b = verticalAxis;
        c = (int) Math.sqrt(Math.abs(Math.pow(a, 2) - Math.pow(b, 2)));
        f1Xcoor = xcoor + c;
        f2Xcoor = xcoor - c;
        col = color;
    }

    public void drawOn(DrawingBoard db) {
        if (a > b) {
            for (int j = xcoor - 2 * a; j <= xcoor + 2 * a; j++)
                for (int i = ycoor - 2 * b; i <= ycoor + 2 * b; i++)
                    if (distance(j, i, f1Xcoor, ycoor) + distance(j, i, f2Xcoor, ycoor) <= 2 * a) {
                        db.getImageArray()[i][j] = col;
                    }
        } else {
            for (int j = xcoor - 2 * b; j <= xcoor + 2 * b; j++)
                for (int i = ycoor - 2 * a; i <= ycoor + 2 * a; i++)
                    if (distance(j, i, f1Xcoor, ycoor) + distance(j, i, f2Xcoor, ycoor) <= 2 * b) {
                        db.getImageArray()[j][i] = col;
                    }
        }
    }
}