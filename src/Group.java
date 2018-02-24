public class Group{
    private Drawable[] sa;
    private int xcoor, ycoor, h, w;

    public Group(Drawable[] drawables) {
        sa = drawables;

        for (Drawable aSa : sa) {
            xcoor += aSa.getX();
            ycoor += aSa.getY();
            h += aSa.getHeight();
            w += aSa.getWidth();
        }
        xcoor /= sa.length;
        ycoor /= sa.length;
        h /= sa.length;
        w /= sa.length;
    }

    public void drawOn(DrawingBoard db) {
        for (Drawable aSa : sa) {
            aSa.drawOn(db);
        }
    }


    public boolean within(DrawingBoard db) {
        boolean g = true;
        for (Drawable aSa : sa) {
            if (!aSa.within(db))
                g = false;
        }
        return g;
    }

}
