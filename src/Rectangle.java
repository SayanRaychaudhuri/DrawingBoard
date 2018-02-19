public class Rectangle extends Shape {
    private int h;
    private int w;
    private boolean in;
    private int xcoor;
    private int ycoor;

    private Drawing d;
    private int col;

    public Rectangle(int x, int y, int height, int width, Drawing draw, int color) {
        h = height;
        w = width;
        in = true;
        xcoor = x;
        ycoor = y;

        d = draw;
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

        String[] bounds = {Integer.toString(ycoor - w / 2), Integer.toString(xcoor - h / 2), Integer.toString(ycoor + w / 2), Integer.toString(xcoor + h / 2)};

        return bounds;
    }

    public int getHeight() {
        return h;
    }

    public int getWidth() {
        return w;
    }


}
