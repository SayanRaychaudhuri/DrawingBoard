public class Rectangle extends Drawable {
    private int h, w, xcoor, ycoor, col;

    public Rectangle(int x, int y, int height, int width, int color) {
        super(height, width, x, y);
        h = height;
        w = width;
        xcoor = x;
        ycoor = y;
        col = color;
    }

    public void drawOn(DrawingBoard db) {
        for (int j = xcoor - h / 2; j <= xcoor + h / 2; j++)
            for (int i = ycoor - w / 2; i <= ycoor + w / 2; i++)
                db.getImageArray()[i][j] = col;
    }

}
