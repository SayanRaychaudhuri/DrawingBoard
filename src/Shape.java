public abstract class Shape implements Drawable {
    private boolean in;
    
    public abstract int getX();

    public abstract int getY();

    public abstract int getHeight();

    public abstract int getWidth();

    //bounding box will return a 4 number integer array with the first two numbers being the
    //bottom left coordinates, and the second two being the top right coordinates
    public abstract String[] getBoundingBox();

    public void printBoundBox() {
        System.out.println(getBoundingBox()[1] + "," + getBoundingBox()[0] + "  These are the coordinates for the top left corner\n" + getBoundingBox()[3] + "," + getBoundingBox()[2] + "  These are the coordinates for the bottom right corner\n");
    }
}
