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

    @Override
    public void drawOn(DrawingBoard db) {
        for (Drawable aDrawable : drawables){
            aDrawable.drawOn(db);
        }
        super.show();
    }

    @Override
    public boolean within(DrawingBoard db) {
        return false;
    }
}
