public abstract class Shape implements Drawable {
    private boolean in;

    public abstract int getX(Shape shape);

    public abstract int getY(Shape shape);

    public abstract int getHeight(Shape shape);

    public abstract int getWidth(Shape shape);

    //bounding box will return a 4 number integer array with the first two numbers being the
    //bottom left coordinates, and the second two being the top right coordinates
    public abstract String[] getBoundingBox(Shape sh);

    public void printBoundBox(Shape sh) {
        System.out.println(sh.getBoundingBox(sh)[1] + "," + sh.getBoundingBox(sh)[0] + "  These are the coordinates for the top left corner\n" + sh.getBoundingBox(sh)[3] + "," + sh.getBoundingBox(sh)[2] + "  These are the coordinates for the bottom right corner\n");
    }
}
