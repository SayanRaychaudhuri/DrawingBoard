public class Group extends Shape {
    private Shape[] sa;
    private int xcoor, ycoor, h, w;

    public Group(Shape[] shapes) {
        sa = shapes;

        for (Shape aSa : sa) {
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

    @Override
    public void drawOn(DrawingBoard db) {
        for (Shape aSa : sa) {
            aSa.drawOn(db);
        }
    }


    public boolean within(DrawingBoard db) {
        boolean g = true;
        for (Shape aSa : sa) {
            if (!aSa.within(db))
                g = false;
        }
        return g;
    }

    @Override
    public int getX() {
        return xcoor;
    }

    @Override
    public int getY() {
        return ycoor;
    }

    @Override
    public int getHeight() {

        return h;
    }

    @Override
    public int getWidth() {

        return w;
    }

    @Override
    public String[] getBoundingBox() {
        return new String[]{Integer.toString(ycoor - w / 2), Integer.toString(xcoor - h / 2), Integer.toString(ycoor + w / 2), Integer.toString(xcoor + h / 2)};
    }


}
