public class Group extends Shape {
    public Shape[] sa;
    private int xcor = 0;
    private int ycor = 0;
    private int h = 0;
    private int w = 0;

    public Group(Shape[] shapes) {
        sa = shapes;

        for (int i = 0; i < sa.length; i++) {
            xcor += sa[i].getX();
            ycor += sa[i].getY();
            h += sa[i].getHeight();
            w += sa[i].getWidth();
        }
        xcor /= sa.length;
        ycor /= sa.length;
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
        return xcor;
    }

    @Override
    public int getY() {
        return ycor;
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
        String[] bounds = {Integer.toString(ycor - w / 2), Integer.toString(xcor - h / 2), Integer.toString(ycor + w / 2), Integer.toString(xcor + h / 2)};

        return bounds;

    }


}
