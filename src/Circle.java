public class Circle extends Drawable{
    private int r, xcoor, ycoor, col;

    public Circle(int x, int y, int radius, int color){
        super(2*radius,2*radius, x, y);
        xcoor = x;
        ycoor = y;
        r = radius;
        col = color;
    }

    public void drawOn(DrawingBoard db) {
        for (int j = xcoor - 2*r; j <= xcoor + 2*r; j++)
            for (int i = ycoor - 2*r; i <= ycoor + 2*r; i++)
                if (distance(j ,i , xcoor, ycoor) <= r/2)
                db.getImageArray()[i][j] = col;
    }
}