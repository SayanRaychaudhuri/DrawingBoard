import java.util.ArrayList;

public class Drawing extends DrawingBoard implements Drawable{
    ArrayList<Drawable> drawables = new ArrayList<>();

    public Drawing(int width, int height) {
        super(width, height);
    }

    public Drawing(String filePath) {
        super(filePath);
    }

    public void add(Drawable drawable){
        drawables.add(drawable);
    }

    public void drawOn() {
            for (Drawable aDrawable : drawables) {
                if (aDrawable.within(this)) {
                    aDrawable.drawOn(this);
                } else {
                    throw new IllegalArgumentException("Out of bounds");
                }
            }
            super.show();
    }
}
