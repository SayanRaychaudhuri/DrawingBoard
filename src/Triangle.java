public class Triangle extends Drawable{
    private int x1, y1, x2, y2, x3, y3;
    private int col;
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, int color){
        super(0,0,0,0);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        col = color;
    }

    public void drawOn(DrawingBoard db) {
        for (int j = smallest(x1, x2, x3); j <= largest(x1, x2, x3); j++)
            for (int i = smallest(y1, y2, y3); i <= largest(y1, y2, y3); i++)
                if (triangleArea(x1, y1, x2, y2, x3, y3) == triangleArea(j, i, x2, y2, x3, y3) + triangleArea(x1, y1, j, i, x3, y3) + triangleArea(x1, y1, x2, y2, j, i))
                    db.getImageArray()[i][j] = col;
    }

    public double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3) { // derived from Heron's formula and distance formula
        return Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0);
    }

    public int smallest(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    public int largest(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
}
