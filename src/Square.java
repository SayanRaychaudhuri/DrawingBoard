public class Square extends Drawable{
    private int s, xcoor, ycoor, col;

    public Square(int x, int y, int sidelength, int color) {
        super(sidelength, sidelength, x, y);
        xcoor = x;
        ycoor = y;
        s = sidelength;
        col = color;
    }

    public void drawOn(DrawingBoard db) {
        for (int j = xcoor - s / 2; j <= xcoor + s / 2; j++)
            for (int i = ycoor - s / 2; i <= ycoor + s / 2; i++)
                db.getImageArray()[i][j] = col;
    }
}
