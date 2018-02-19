public class Group extends Shape {
    public Shape[] sa;
    private int xcoor = 0;
    private int ycoor = 0;
    private int h = 0;
    private int w = 0;

    public Group(Shape[] shapes) {
        sa = shapes;

        for (int i = 0; i < sa.length; i++) {
            xcoor += sa[i].getX();
            ycoor += sa[i].getY();
            h += sa[i].getHeight();
            w += sa[i].getWidth();
        }
        xcoor /= sa.length;
        ycoor /= sa.length;
        h /= sa.length;
        w /= sa.length;
    }

    @Override
    public void drawOn(DrawingBoard db) {
        for (int i = 0; i < sa.length; i++) {
            sa[i].drawOn(db);
        }
    }


    public boolean within(DrawingBoard db) {
        boolean g = true;
        for (int i = 0; i < sa.length; i++) {

            if (sa[i].within(db) == false)
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
        String[] bounds = {Integer.toString(ycoor - w / 2), Integer.toString(xcoor - h / 2), Integer.toString(ycoor + w / 2), Integer.toString(xcoor + h / 2)};

        return bounds;

    }


}
