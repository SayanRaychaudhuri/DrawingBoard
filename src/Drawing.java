import java.util.ArrayList;

public class Drawing extends DrawingBoard {
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

    public void show(){
        for (Drawable aDrawable : drawables){
            aDrawable.drawOn(this);
        }
        super.show();
    }
}
