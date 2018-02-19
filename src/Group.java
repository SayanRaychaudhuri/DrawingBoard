public class Group extends Shape {
    public Shape[] sa;
    private int xcor = 0;
    private int ycor = 0;
    private int h = 0;
    private int w = 0;

    public Group(Shape[] shapes) {
        sa = shapes;

        for (int i = 0; i < sa.length; i++) {
            xcor += sa[i].getX(sa[i]);
            ycor += sa[i].getY(sa[i]);
            h += sa[i].getHeight(sa[i]);
            w += sa[i].getWidth(sa[i]);
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
    public int getX(Shape shape) {
        return xcor;
    }

    @Override
    public int getY(Shape shape) {
        return ycor;
    }

    @Override
    public int getHeight(Shape shape) {

        return h;
    }

    @Override
    public int getWidth(Shape shape) {

        return w;
    }

    @Override
    public String[] getBoundingBox(Shape sh) {
        String[] bounds = {Integer.toString(ycor - w / 2), Integer.toString(xcor - h / 2), Integer.toString(ycor + w / 2), Integer.toString(xcor + h / 2)};

        return bounds;

    }


}
