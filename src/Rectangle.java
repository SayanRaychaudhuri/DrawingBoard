public class Rectangle extends Shape {
    private int h;
    private int w;
    private boolean in;
    private int xcor;
    private int ycor;

    private Drawing d;
    private int col;

    public Rectangle(int x, int y, int height, int width, Drawing draw, int color) {
        h = height;
        w = width;
        in = true;
        xcor = x;
        ycor = y;

        d = draw;
        col = color;
    }

    public void drawOn(DrawingBoard db) {
        for (int j = xcor - h / 2; j <= xcor + h / 2; j++)
            for (int i = ycor - w / 2; i <= ycor + w / 2; i++)
                db.getImageArray()[i][j] = col;


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

    public int getHeight(Shape shape) {
        return h;
    }

    public int getWidth(Shape shape) {
        return w;
    }


}
