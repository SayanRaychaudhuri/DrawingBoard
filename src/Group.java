public class Group extends Drawable{
    private Drawable[] drawables;

    public Group(Drawable[] drawables) {
        super(0,0,0,0);
        this.drawables = drawables;
        for (Drawable D : drawables) {
            xcoor += D.getX();
            ycoor += D.getY();
            h += D.getHeight();
            w += D.getWidth();
        }
        xcoor /= drawables.length;
        ycoor /= drawables.length;
        h /= drawables.length;
        w /= drawables.length;
    }

    public void drawOn(DrawingBoard db) {
        for (Drawable aSa : drawables) {
            aSa.drawOn(db);
        }
    }


    public boolean within(DrawingBoard db) {
        boolean g = true;
        for (Drawable aSa : drawables) {
            if (!aSa.within(db))
                g = false;
        }
        return g;
    }
}
