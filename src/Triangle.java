public class Triangle extends Shape {
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
    private Orientation rotate;
    private int[][] pixels;

    public enum Orientation {
        DOWNLEFT,
        DOWNRIGHT,
        UPLEFT,
        UPRIGHT
    }

    public Triangle(int x1, int y1, int x2, int y2, Drawing draw, int color, Orientation rotate) {
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
        this.rotate = rotate;
        pixels = new int[w][h];

    }


    @Override
    public void drawOn(DrawingBoard db) {
        switch (rotate){
            case DOWNLEFT:
                for (int i = x1; i < x2; i++) {
                    for (int j = y1; j < yOnLine(i, x1, y1, x2, y2); j++) {
                        db.getImageArray()[j][i] = col;
                    }
                }
                break;
            case DOWNRIGHT:
                for (int i = x1; i < x2; i++) {
                    for (int j = y1; j < yOnLine(i, x1, y2, x2, y1); j++) {
                        db.getImageArray()[j][i] = col;
                    }
                }
                break;
            case UPLEFT:
                for (int i = x1; i < x2; i++) {
                    for (int j = y2; j > yOnLine(i, x1, y2, x2, y1); j--) {
                        db.getImageArray()[j][i] = col;
                    }
                }
                break;
            case UPRIGHT:
                for (int i = x1; i < x2; i++) {
                    for (int j = y2; j > yOnLine(i, x1, y1, x2, y2); j--) {
                        db.getImageArray()[j][i] = col;
                    }
                }
                break;
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

        String[] bounds = {Integer.toString(ycoor - w / 2), Integer.toString(xcoor - h / 2), Integer.toString(ycoor + w / 2), Integer.toString(xcoor + h / 2)};

        return bounds;
    }

    public int getHeight() {
        return h;
    }

    public int getWidth() {
        return h;
    }


}
