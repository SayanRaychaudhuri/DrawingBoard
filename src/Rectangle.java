public class Rectangle extends Shape {
    private int h, w, xcoor, ycoor;
    private boolean in;

    private int col;

    public Rectangle(int x, int y, int height, int width, int color) {
        h = height;
        w = width;
        in = true;
        xcoor = x;
        ycoor = y;
        col = color;
    }

    public void drawOn(DrawingBoard db) {
        for (int j = xcoor - h / 2; j <= xcoor + h / 2; j++)
            for (int i = ycoor - w / 2; i <= ycoor + w / 2; i++)
                db.getImageArray()[i][j] = col;


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

    public int getHeight() {
        return h;
    }

    public int getWidth() {
        return w;
    }


}
