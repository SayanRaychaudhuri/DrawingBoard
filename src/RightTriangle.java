public class RightTriangle extends Drawable {
    private int h, w, col, x1, x2, y1, y2, xcoor, ycoor;
    private Orientation rotate;

    public enum Orientation {
        DOWNLEFT,
        DOWNRIGHT,
        UPLEFT,
        UPRIGHT
    }

    public RightTriangle(int x1, int y1, int x2, int y2, int color, Orientation rotate) { // Points that make the hypotenuse
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
        this.rotate = rotate;

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

}
