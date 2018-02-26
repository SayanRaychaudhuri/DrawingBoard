public abstract class Drawable {
    public int xcoor, ycoor, h, w;
    public boolean in = true;

    public Drawable(int h, int w, int xcoor, int ycoor){
        this.h = h;
        this.w = w;
        this.xcoor = xcoor;
        this.ycoor = ycoor;
    }

    public int yOnLine(int x, int x1, int y1, int x2, int y2) {
        if (y2 == y1)
            return x1;

        double m = ((double) (y2 - y1)) / (x2 - x1);

        return (int) (y1 + m * (x - x1));
    }

    public int distance(int x1, int y1, int x2, int y2) {
        return (int)Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
    }
    public boolean within(DrawingBoard db) {
        if ((xcoor - h / 2) < 0 || xcoor + h / 2 > db.getWidth() || ycoor - w / 2 < 0 || ycoor + w / 2 > db.getHeight()) {
            in = false;
        }
        return in;
    }

    public int getX(){
        return xcoor;
    }

    public int getY(){
        return ycoor;
    }

    public int getHeight(){
        return h;
    }

    public int getWidth(){
        return w;
    }

    public abstract void drawOn(DrawingBoard db);
}
