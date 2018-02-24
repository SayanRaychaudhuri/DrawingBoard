import java.util.ArrayList;

public class Drawing extends DrawingBoard {
    ArrayList<Shape> shapes = new ArrayList<>();

    public Drawing(int width, int height) {
        super(width, height);
    }

    public Drawing(String filePath) {
        super(filePath);
    }

    public void add(Shape shape){
        shapes.add(shape);
    }

    public void drawOn() {
            for (Shape shape : shapes) {
                if (shape.within(this)) {
                    shape.drawOn(this);
                } else {
                    throw new IllegalArgumentException("Out of bounds");
                }
            }
            super.show();
    }
}
