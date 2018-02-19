public class Drawing extends DrawingBoard {

    public Drawing(int width, int height) {
        super(width, height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Drawing(String filePath) {
        super(filePath);
    }

    public void add(Shape thing, Drawing db) {
        if (!thing.within(db)) {
            System.out.println("Shape is outside the drawing");
        } else {
            thing.drawOn(db);
        }
    }


}
