public abstract class Drawable {
    private int xcoor, ycoor, h, w;
    private boolean in = true;

    public Drawable(int h, int w, int xcoor, int ycoor){
        this.h = h;
        this.w = w;
        this.xcoor = xcoor;
        this.ycoor = ycoor;
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

    public static int yOnLine(int x, int x1, int y1, int x2, int y2) {
        if (y2 == y1)
            return x1;

        double m = ((double) (y2 - y1)) / (x2 - x1);

        return (int) (y1 + m * (x - x1));
    }

    public boolean within(DrawingBoard db) {
        if ((xcoor - h / 2) < 0 || xcoor + h / 2 > db.getWidth() || ycoor - w / 2 < 0 || ycoor + w / 2 > db.getHeight()) {
            in = false;
        }
        return in;
    }

    public String[] getBoundingBox(){
        return new String[]{Integer.toString(ycoor - w / 2), Integer.toString(xcoor - h / 2), Integer.toString(ycoor + w / 2), Integer.toString(xcoor + h / 2)};
    }

    public void printBoundBox() {
        System.out.println("These are the coordinates of the top left corner: " + getBoundingBox()[1] + "," + getBoundingBox()[0] + "\nThese are the coordinates of the bottom right corner: " + getBoundingBox()[3] + "," + getBoundingBox()[2]);
    }

    public abstract void drawOn(DrawingBoard db);
}
