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
        System.out.println("These are the coordinates of the top left corner: " + getBoundingBox()[1] + "," + getBoundingBox()[0] + "\nThese are the coordinates of the bottom right corner: " + getBoundingBox()[3] + "," + getBoundingBox()[2]);
    }
}
